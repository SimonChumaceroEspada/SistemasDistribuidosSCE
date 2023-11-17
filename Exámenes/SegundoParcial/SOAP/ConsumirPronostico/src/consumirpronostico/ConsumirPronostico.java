/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumirpronostico;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.tempuri.ServicioPronostico;
import org.tempuri.ServicioPronosticoSoap;

/**
 *
 * @author Omar
 */
public class ConsumirPronostico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPronostico servicio = new ServicioPronostico();
        ServicioPronosticoSoap cliente = servicio.getServicioPronosticoSoap();
        
        // Date fecha = new Date(2021,02,04);
        
        int temperatura = 21;
        double probabilidadLluvia = 0.42;
        
        
        String resultado = cliente.obtenerTodosLosPronosticos();
        System.out.println(resultado);
        
        System.out.println("Resultado por fecha: ");
        //String resultadoPorFecha = cliente.ObtenerPronosticoPorFecha(fecha);
        //System.out.println(resultadoPorFecha);
        
        
        System.out.println("Resultado por temperatura: ");
        String resultadoPorTemperatura = cliente.obtenerPronosticosPorTemperatura(temperatura);
        System.out.println(resultadoPorTemperatura);
        
                System.out.println("Resultado por probabilidadLluvia: ");
        String resultadoPorProbabilidadLluvia = cliente.obtenerPronosticosPorProbabilidadLluvia(probabilidadLluvia);
        System.out.println(resultadoPorProbabilidadLluvia);
        
        
    }
    
}
