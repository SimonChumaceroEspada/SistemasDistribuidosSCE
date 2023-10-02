package parcial1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Juez extends UnicastRemoteObject implements IJuez {

    public Juez() throws RemoteException {
        super();
    }

    @Override
    public Cuenta[] ConsultarCuentas(String ci, String nombres, String apellidos) throws RemoteException {
        Cuenta[] cuentas = null;
        System.out.println("ConsultarCuentas");
        return cuentas;
    }

    // @Override
    // public Boolean RetenerMonto(Cuenta cuenta, int monto, String glosa) throws
    // RemoteException {
    // // TODO Auto-generated method stub
    // System.out.println("RetenerMonto");
    // throw new UnsupportedOperationException("Unimplemented method
    // 'RetenerMonto'");
    // }

}
