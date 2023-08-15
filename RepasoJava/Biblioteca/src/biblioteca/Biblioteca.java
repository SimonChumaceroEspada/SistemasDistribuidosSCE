
package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private double tamanioMetrosCuadrados;
    private List<Armario> armarios;

    public Biblioteca(String nombre, double tamanioMetrosCuadrados) {
        this.nombre = nombre;
        this.tamanioMetrosCuadrados = tamanioMetrosCuadrados;
        this.armarios = new ArrayList<>();
    }

    
    public void agregarArmario(Armario armario){
        armarios.add(armario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamanioMetrosCuadrados() {
        return tamanioMetrosCuadrados;
    }

    public void setTamanioMetrosCuadrados(double tamanioMetrosCuadrados) {
        this.tamanioMetrosCuadrados = tamanioMetrosCuadrados;
    }

    public List<Armario> getArmarios() {
        return armarios;
    }

    public void setArmarios(List<Armario> armarios) {
        this.armarios = armarios;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", tamanioMetrosCuadrados=" + tamanioMetrosCuadrados + "}";
    }
    
    public void mostrarArmarios(){
        for(Armario a: this.armarios){
            System.out.println(a);
        }
    }
    
    
    
}
