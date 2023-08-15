package database;

import database.ConexionBD;
import biblioteca.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoLibro {
    public static void insertarLibro(Libro libro) {
        try (Connection conexión = ConexionBD.obtenerConexion()) {
            String consulta = "INSERT INTO libro (nombre, autor, editorial, anio) VALUES (?, ?, ?, ?)";
            PreparedStatement declaración = conexión.prepareStatement(consulta);
            declaración.setString(1, libro.getNombre());
            declaración.setString(2, libro.getAutor());
            declaración.setString(3, libro.getEditorial());
            declaración.setInt(4, libro.getAnio());
            declaración.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


