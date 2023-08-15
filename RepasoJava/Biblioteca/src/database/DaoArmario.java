package database;

import database.ConexionBD;
import biblioteca.Armario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoArmario {
    public static void insertarArmario(Armario armario) {
        try (Connection conexión = ConexionBD.obtenerConexion()) {
            String consulta = "INSERT INTO armarios (codigo) VALUES (?)";
            PreparedStatement declaración = conexión.prepareStatement(consulta);
            declaración.setString(1, armario.getCodigo());
            declaración.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Aquí podrías agregar métodos para realizar otras operaciones con la tabla de armarios
}
