package parcial1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteJuez {
    public static void main(String[] args) {
        IJuez juez;

        try {
            juez = (IJuez) Naming.lookup("rmi://localhost/Juez");

            Cuenta[] cuenta1 = juez.ConsultarCuentas("123456789", "Juan", "Perez");

            // for (Cuenta cuenta : cuenta1) {
            // System.out.println(cuenta);
            // }

            // Cuenta[] cuenta2 = juez.ConsultarCuentas("123456789", "Juan2", "Perez");

            // for (Cuenta cuenta : cuenta2) {
            // System.out.println(cuenta);
            // }

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteJuez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteJuez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteJuez.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
