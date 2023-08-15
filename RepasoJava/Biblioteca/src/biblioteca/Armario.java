
package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Armario {
    private String codigo;
    private TipoArmario tipoArmario;
    private ArrayList<Libro> libros;

    public Armario(String codigo, TipoArmario tipoArmario) {
        this.codigo = codigo;
        this.tipoArmario = tipoArmario;
        this.libros = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoArmario getTipoArmario() {
        return tipoArmario;
    }

    public void setTipoArmario(TipoArmario tipoArmario) {
        this.tipoArmario = tipoArmario;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    
    public void mostrarLibro(){
        for(Libro l: this.libros){
            System.out.println(l);
        }
    }
    
    
    
    

    
    
}
