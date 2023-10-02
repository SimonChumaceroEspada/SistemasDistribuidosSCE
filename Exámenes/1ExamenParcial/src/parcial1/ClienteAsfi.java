package parcial1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteAsfi {
    public static void main(String[] args) throws RemoteException {
        IAsfi asfi;
        try {
            asfi = (IAsfi) Naming.lookup("rmi://localhost/Asfi");
            Cuenta cuenta1 = new Cuenta(Banco.BancoBCP, "123456789", "7504877", "Simon", "Chumacero Espada", 80000.0);
            Cuenta cuenta2 = new Cuenta(Banco.Mercantil, "123456789", "7504877", "Santiago", "Chumacero Espada",
                    80000.0);
            System.out.println("RetenerMonto");
            asfi.RetenerMonto(cuenta1, 100, "RetenerMonto");
            asfi.RetenerMonto(cuenta2, 100, "RetenerMonto");

            //
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteAsfi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteAsfi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteAsfi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
