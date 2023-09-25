/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soquetsudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Carlos
 */
// ServerUDP.java
import java.io.IOException;
import java.net.*;

public class ServerUDP {
  public static void main(String args[]) {
    int port = 6789;

    try {
      DatagramSocket socketUDP = new DatagramSocket(port);
      byte[] bufer = new byte[1000];

      while (true) {
        DatagramPacket peticion = new DatagramPacket(bufer, bufer.length);
        socketUDP.receive(peticion);

        String requestString = new String(peticion.getData(), 0, peticion.getLength());
        String[] parts = requestString.split("-");
        String operation = parts[0];
        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);
        int c = Integer.parseInt(parts[3]);

        int result;
        if (operation.equals("mayor")) {
          result = Math.max(Math.max(a, b), c);
        } else if (operation.equals("menor")) {
          result = Math.min(Math.min(a, b), c);
        } else {
          result = 0; // Indicate invalid operation
        }

        String response = String.valueOf(result);
        byte[] mensaje = response.getBytes();

        DatagramPacket respuesta = new DatagramPacket(mensaje, mensaje.length,
            peticion.getAddress(), peticion.getPort());

        socketUDP.send(respuesta);
      }

    } catch (SocketException e) {
      System.out.println("Socket: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO: " + e.getMessage());
    }
  }
}
