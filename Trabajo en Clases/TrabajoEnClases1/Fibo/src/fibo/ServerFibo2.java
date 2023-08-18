package fibo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFibo2 {
    public static void main(String[] args) {
        int port = 5002;
        ServerSocket server;

        try {
            server = new ServerSocket(port);
            System.out.println("Servidor Iniciado");

            while (true) {
                Socket client = server.accept();


                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
                String input = fromClient.readLine();

                try {
                    int numero = Integer.parseInt(input);
                    int resultado = Operacion.fibonaci(numero);

                    PrintStream toClient = new PrintStream(client.getOutputStream());
                    toClient.println(resultado);
                } catch (NumberFormatException e) {
                    PrintStream toClient = new PrintStream(client.getOutputStream());
                    toClient.println("Error: El valor ingresado no es un número válido.");
                }

                client.close();
            }
        } catch (IOException e) {
            System.out.println("Hubo un error en el servidor: " + e.getMessage());
        }
    }
}
