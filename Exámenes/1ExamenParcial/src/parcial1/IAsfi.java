package parcial1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAsfi extends Remote {

    public Boolean RetenerMonto(Cuenta cuenta, int monto, String glosa) throws RemoteException;

}
