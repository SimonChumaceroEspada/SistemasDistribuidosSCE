
package fibonaci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorFibonaci {

    public static void main(String[] args) {
        int port = 5002;
        ServerSocket server;
        String cadena="";
        try {
            server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con éxito");
            Socket client;
            PrintStream toClient;
            client = server.accept(); //conexion
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            System.out.println("Cliente se conecto");
            while (!cadena.equals("Terminar"))
            {
             cadena=fromClient.readLine();
             
             int n = Integer.parseInt(cadena);
             int f= Operacion.fibonaci(n);
             toClient = new PrintStream(client.getOutputStream());
             toClient.println(f);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ServidorFibonaci.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
