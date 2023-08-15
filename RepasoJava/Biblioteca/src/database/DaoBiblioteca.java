package database;

import database.ConexionBD;
import biblioteca.Biblioteca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoBiblioteca {
    public static void insertarBiblioteca(Biblioteca biblioteca) {
        try (Connection conexión = ConexionBD.obtenerConexion()) {
            String consulta = "INSERT INTO bibliotecas (nombre, tamaño_metros_cuadrados) VALUES (?, ?)";
            PreparedStatement declaración = conexión.prepareStatement(consulta);
            declaración.setString(1, biblioteca.getNombre());
            declaración.setDouble(2, biblioteca.getTamanioMetrosCuadrados());
            declaración.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Aquí podrías agregar métodos para realizar otras operaciones con la tabla de bibliotecas
}
