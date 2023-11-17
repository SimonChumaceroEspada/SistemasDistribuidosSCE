
package servidoresrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Omar
 */
public interface PlataformaInterfaz extends Remote {
    void realizarTransferencia(Cuenta origen, Cuenta destino, double monto, Banco banco) throws RemoteException;
}
