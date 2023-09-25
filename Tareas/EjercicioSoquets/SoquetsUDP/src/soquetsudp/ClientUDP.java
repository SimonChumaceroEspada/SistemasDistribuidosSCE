/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soquetsudp;

/**
 *
 * @author Carlos
 */
// ClientUDP.java
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class ClientUDP {
  public static void main(String args[]) {
    int puerto = 6789;
    Scanner scanner = new Scanner(System.in);

    try {
      DatagramSocket socketUDP = new DatagramSocket();
      InetAddress hostServidor = InetAddress.getByName("localhost");

      while (true) {
        System.out.print("Ingresa la operacion (mayor or menor): ");
        String operation = scanner.nextLine();

        if (operation.equals("salir")) {
          break;
        }

        System.out.print("Ingresa el numero (a): ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el numero (b): ");
        int b = scanner.nextInt();
        System.out.print("Ingresa el numero (c): ");
        int c = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        NumerosCliente request = new NumerosCliente(operation, a, b, c);
        byte[] mensaje = request.toString().getBytes();

        DatagramPacket peticion = new DatagramPacket(mensaje, mensaje.length, hostServidor, puerto);
        socketUDP.send(peticion);

        byte[] bufer = new byte[1000];
        DatagramPacket respuesta = new DatagramPacket(bufer, bufer.length);
        socketUDP.receive(respuesta);

        String serverResultado = new String(respuesta.getData(), 0, respuesta.getLength());
        System.out.println("Resultado: " + serverResultado);
      }

      socketUDP.close();
    } catch (SocketException e) {
      System.out.println("Socket: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO: " + e.getMessage());
    }
  }
}
