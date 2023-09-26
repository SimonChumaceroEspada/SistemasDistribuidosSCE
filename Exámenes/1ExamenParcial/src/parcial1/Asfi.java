package parcial1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Asfi extends UnicastRemoteObject implements IAsfi {

    protected Asfi() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    public Boolean RetenerMonto(Cuenta cuenta, int monto, String glosa) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el banco a depositar");
        System.out.println("1. Mercantil");
        System.out.println("2. BancoBCP");
        int banco = sc.nextInt();

        System.out.println("Ingrese el monto a retener");
        int montoRetener = sc.nextInt();

        switch (banco) {
            case 1:
                System.out.println("RetenerMonto Mercantil");

                // 7
                // if(cuenta.equals(cuentaMercantil.getNrocuenta()) && montoRetener <=
                // cuentaMercantil.getSaldo()){
                // cuenta.setSaldo(cuenta.getSaldo() - montoRetener);
                // System.out.println("RetenerMonto Mercantil");
                // return true;
                // }
                break;
            case 2:
                System.out.println("RetenerMonto BancoBCP");
                break;
        }

        System.out.println("RetenerMonto");
        return true;
    }

}
