
package servidoresrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlataformaIntermediaria extends UnicastRemoteObject implements PlataformaInterfaz {
    public PlataformaIntermediaria() throws RemoteException {
        super();
    }

    @Override
    public void realizarTransferencia(Cuenta origen, Cuenta destino, double monto, Banco banco) throws RemoteException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Configura la conexión a la base de datos
            String url = "jdbc:mysql://localhost:3306/db_banco_bnb";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);

            // Inicia la transacción
            connection.setAutoCommit(false);

            // Realiza las operaciones en la base de datos
            restarSaldo(connection, origen.getCodigoCliente(), monto);
            sumarSaldo(connection, destino.getCodigoCliente(), monto);

            // Realiza el commit de la transacción
            connection.commit();
        } catch (SQLException e) {
            // Manejo de excepciones, realiza un rollback en caso de error
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Cierra la conexión y el PreparedStatement
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void restarSaldo(Connection connection, long codigoCliente, double monto) throws SQLException {
        String sql = "UPDATE cuentas SET saldo = saldo - ? WHERE codigo_cliente = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setDouble(1, monto);
            preparedStatement.setLong(2, codigoCliente);
            preparedStatement.executeUpdate();
        }
    }

    private void sumarSaldo(Connection connection, long codigoCliente, double monto) throws SQLException {
        String sql = "UPDATE cuentas SET saldo = saldo + ? WHERE codigo_cliente = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setDouble(1, monto);
            preparedStatement.setLong(2, codigoCliente);
            preparedStatement.executeUpdate();
        }
    }
}
