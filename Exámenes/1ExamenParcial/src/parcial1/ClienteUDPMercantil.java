package parcial1;

import java.net.*;
import java.io.*;

public class ClienteUDPMercantil {

    // Los argumentos proporcionan el mensaje y el nombre del servidor
    public static void main(String args[]) {
        int puerto = 6789;

        Cuenta cuentaMercantil = new Cuenta(Banco.Mercantil, "123456789", "7504877", "Simon", "Chumacero Espada",
                80000.0);

        try {
            String banco = cuentaMercantil.getBanco().toString();
            String nrocuenta = cuentaMercantil.getNrocuenta();
            String ci = cuentaMercantil.getCi();
            String nombres = cuentaMercantil.getNombres();
            String apellidos = cuentaMercantil.getApellidos();

            String dato = banco + " " + nrocuenta + " " + ci + " " + nombres + " " + apellidos;

            String ip = "localhost";
            DatagramSocket socketUDP = new DatagramSocket();
            byte[] mensaje = dato.getBytes();
            InetAddress hostServidor = InetAddress.getByName(ip);

            // Construimos un datagrama para enviar el mensaje al servidor
            DatagramPacket peticion = new DatagramPacket(mensaje, dato.length(), hostServidor,
                    puerto);

            // Enviamos el datagrama
            socketUDP.send(peticion);

            // Construimos el DatagramPacket que contendrá la respuesta
            byte[] bufer = new byte[1000];
            DatagramPacket respuesta = new DatagramPacket(bufer, bufer.length);
            socketUDP.receive(respuesta);

            // Enviamos la respuesta del servidor a la salida estandar
            System.out.println("Respuesta: " + new String(respuesta.getData()));

            // Cerramos el socket
            socketUDP.close();

            // 7
            String datoNroCuenta = cuentaMercantil.getNrocuenta();
            byte[] mensajeNroCuenta = datoNroCuenta.getBytes();
            // Construimos un datagrama para enviar el mensaje al servidor
            DatagramPacket peticionNroCuenta = new DatagramPacket(mensajeNroCuenta, datoNroCuenta.length(),
                    hostServidor,
                    puerto);

            // Enviamos la respuesta del servidor a la salida estandar
            System.out.println("Respuesta: " + new String(respuesta.getData()));

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
}
