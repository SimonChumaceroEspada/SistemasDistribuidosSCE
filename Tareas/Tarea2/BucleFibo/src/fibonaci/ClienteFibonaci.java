
package fibonaci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteFibonaci {

    public static void main(String[] args) {
        {
            int port = 5002;
            var sc = new Scanner(System.in);
            boolean salir = false;
            try {
                Socket client = new Socket("localhost", port);
                PrintStream toServer = new PrintStream(client.getOutputStream());
                BufferedReader fromServer = new BufferedReader(
                        new InputStreamReader(client.getInputStream()));
                while (!salir) {
                    System.out.println("Introduzca un numero o 'Terminar' para salir");
                    String numero = sc.next();
                    toServer.println(numero);
                    if (numero.equals("Terminar")) {
                        salir = true;
                        System.out.println("Se termino " );
                        client.close();
                    } else {
                        String result = fromServer.readLine();
                        System.out.println("El fibonaci es: " + result);
                    }
                }
                

            } catch (IOException ex) {
                Logger.getLogger(ClienteFibonaci.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
