
package biblioteca;

import database.DaoArmario;
import database.DaoBiblioteca;
import database.DaoLibro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int opcion;
        
        
        Armario armario = null;
        Libro libro = null;
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Regulus", 200.0);
        while(true){
            System.out.println("1. Crear Armario");
            System.out.println("2. Añadir armario a la biblioteca");
            System.out.println("3. Crear Libro");
            System.out.println("4. Añadir libro al Armario");
            
            System.out.println("5. Guardar en la base de datos ");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            
            
             switch (opcion) {
                case 1:
                    System.out.print("Ingrese el codigo del armario");
                    String codigo = sc.next();
                    System.out.print("Ingrese el material del armario (Metalico, Madera)");
                    String material = sc.next();
                    armario = new Armario(codigo, TipoArmario.valueOf(material));
                    break;
                case 2:
                    System.out.println(armario);
                    armario.mostrarLibro();
                    System.out.println("Desea añadir este armario a la biblioteca? (s/n)");
                    String respuesta = sc.next();
                    if(respuesta.equals("s")){
                        biblioteca.agregarArmario(armario);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese el autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Ingrese la editorial: ");
                    String editorial = sc.nextLine();
                    System.out.println("Ingrese el año");
                    int anio = sc.nextInt();
                    libro = new Libro(nombre, autor, editorial, anio);
                    break;
                case 4:
                    System.out.println(libro);
                    System.out.println("Desea añadir el libro al armario? (s/n)");
                    String respuesta2 = sc.next();
                    if(respuesta2.equals("s")){
                        armario.agregarLibro(libro);
                    }
                    sc.close();
                    break;
                    
                 case 5:
                    DaoLibro.insertarLibro(libro);
                    break;
                    
                    
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
        
        
        
        
        
//        Libro libro1 = new Libro("Libro ABC", "Juan", "Editorial A", 2023);
//    
//        armario1.agregarLibro(libro1);
//        
//
//        biblioteca.agregarArmario(armario1);
        
        // Guardar en la DB
//        DaoLibro.insertarLibro(libro1);
//        DaoArmario.insertarArmario(armario1);
//        DaoBiblioteca.insertarBiblioteca(biblioteca);
    }
    
}
