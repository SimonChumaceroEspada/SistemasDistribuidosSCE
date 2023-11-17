/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidoresrmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;
import java.util.Scanner;
// Cliente RMI

public class ClienteRMI {

    public static void main(String[] args) {
        try {
            // Obtiene la referencia remota de la plataforma de intercambio
            PlataformaInterfaz plataforma = (PlataformaInterfaz) Naming
                    .lookup("rmi://localhost/PlataformaIntermediaria");

            System.out.println("Ingrese el Banco (BancoUnion o BNB):");
            Scanner scanner = new Scanner(System.in);
            String nombreBanco = scanner.nextLine();

            // Convierte el nombre del banco a enum Banco
            Banco banco = Banco.valueOf(nombreBanco);

            // Crea instancias de Cuenta, Cliente, etc., con los datos necesarios
            // Crear un cliente de origen
            Cliente clienteOrigen = new Cliente();
            System.out.println("Ingrese el Codigo de cliente de origen");
            clienteOrigen.setCodigoCliente(scanner.nextInt());

            // Crear una cuenta de origen
            Cuenta cuentaOrigen = new Cuenta();
            System.out.println("Ingrese el numero de cuenta de origen");
            cuentaOrigen.setNumeroCuenta(scanner.next());
            cuentaOrigen.setCodigoCliente(clienteOrigen.getCodigoCliente());

            // Crear un cliente de destino
            Cliente clienteDestino = new Cliente();
            System.out.println("Ingrese el Codigo de cliente de destino");
            clienteDestino.setCodigoCliente(scanner.nextInt());

            // Crear una cuenta de destino
            Cuenta cuentaDestino = new Cuenta();
            System.out.println("Ingrese el numero de cuenta de destino");
            cuentaDestino.setNumeroCuenta(scanner.next());

            // Monto de la transferencia
            System.out.println("Ingrese el monto de la transferencia");
            double monto = scanner.nextDouble();

            // Realiza la transferencia llamando al método remoto
            plataforma.realizarTransferencia(cuentaOrigen, cuentaDestino, monto, banco);

            System.out.println("Transferencia realizada con éxito...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
