package parcial1;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorAsfi2 {
    public static void main(String[] args) {
        try {
            Juez juez = new Juez();
            LocateRegistry.createRegistry(1099); // levantar el servidor de registro;
            Naming.bind("Juez", juez);
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorAsfi2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorAsfi2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorAsfi2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
