package parcial1;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServidorAsfi {
    public static void main(String[] args) throws IOException {
        int port = 6789;
        try {
            Juez juez = new Juez();
            Asfi asfi = new Asfi();
            LocateRegistry.createRegistry(1099); // levantar el servidor de registro;
            Naming.bind("Juez", juez);
            Naming.bind("Asfi", asfi);

            // Servidor UDP Banco Mercantil
            DatagramSocket socketUDP = new DatagramSocket(port);
            byte[] bufer = new byte[1000];

            while (true) {
                // Construimos el DatagramPacket para recibir peticiones
                DatagramPacket peticion = new DatagramPacket(bufer, bufer.length);

                // Leemos una petición del DatagramSocket
                socketUDP.receive(peticion);

                System.out.print("Datagrama recibido del host: " +
                        peticion.getAddress());
                System.out.println(" desde enl puerto remoto: " +
                        peticion.getPort());

                String cadena = new String(peticion.getData());
                System.out.println(" valor enviado: " + cadena);
                // asfi.RetenerMonto(null, port, cadena)
                // Construimos el DatagramPacket para enviar la respuesta
                String resp = cadena;
                String response = String.valueOf(resp);
                byte[] mensaje = response.getBytes();

                DatagramPacket respuesta = new DatagramPacket(mensaje, response.length(),
                        peticion.getAddress(), peticion.getPort());

                // Enviamos la respuesta, que es un eco
                socketUDP.send(respuesta);
            }

        } catch (RemoteException ex) {
            Logger.getLogger(ServidorAsfi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorAsfi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorAsfi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}