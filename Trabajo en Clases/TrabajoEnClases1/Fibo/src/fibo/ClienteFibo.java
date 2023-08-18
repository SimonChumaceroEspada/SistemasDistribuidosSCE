
package fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class ClienteFibo {
    public static void main(String[] args) {
        int port = 5002;
        Scanner sc = new Scanner(System.in);
        try {
            Socket client = new Socket("localhost", port);
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
            System.out.println("Introduzca un numero: ");
            String numero = sc.next();
            toServer.println(numero);
            String result = fromServer.readLine();
            System.out.println("El fibonacci es: " + result);
            // Aquí puedes continuar con el resto del código dentro del bloque try
            
        } catch (IOException e) {
            System.out.println("Hubo un error en la conexión: " + e.getMessage());
        }
    }
}

