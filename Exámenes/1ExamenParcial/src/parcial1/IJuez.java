package parcial1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IJuez extends Remote {
    public Cuenta[] ConsultarCuentas(String ci, String nombres, String apellidos) throws RemoteException;

    // public Boolean RetenerMonto(Cuenta cuenta, int monto, String glosa) throws
    // RemoteException;
}