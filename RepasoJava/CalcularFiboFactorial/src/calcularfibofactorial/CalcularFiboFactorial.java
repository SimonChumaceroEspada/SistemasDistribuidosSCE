
package calcularfibofactorial;

import static calcularfibofactorial.Operaciones.calcularFactorial;
import static calcularfibofactorial.Operaciones.calcularFibonacci;
import java.util.Scanner;

public class CalcularFiboFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int opcion;
        
        while(true){
            System.out.println("1. Introducir n");
            System.out.println("2. Calcular Fibonacci");
            System.out.println("3. Calcular Factorial");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            
            
             switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor de n: ");
                    n = sc.nextInt();
                    break;
                case 2:
                    if (n == 0) {
                        System.out.println("Valor de n");
                    } else {
                        System.out.println("Fibonacci(" + n + ") = " + calcularFibonacci(n));
                    }
                    break;
                case 3:
                    if (n == 0) {
                        System.out.println("El valor de n es 0");
                    } else {
                        System.out.println("Factorial(" + n + ") = " + calcularFactorial(n));
                    }
                    break;
                case 4:
                    System.out.println("Salir");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
    
  
    
}
