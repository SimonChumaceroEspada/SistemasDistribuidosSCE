/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidoresrmi;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;

/**
 *
 * @author Omar
 */
// Servidor RMI
public class ServidoresRMI {
    public static void main(String[] args) {
        try {
            // Crea e inicia el registro RMI
            LocateRegistry.createRegistry(1099);

            // Crea la instancia de la plataforma intermedia y la registra en el registro RMI
            PlataformaInterfaz plataforma = new PlataformaIntermediaria();
            Naming.rebind("PlataformaIntermediaria", plataforma);

            System.out.println("Servidor RMI listo...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
