
package Modelo;

import java.sql.*;
import java.util.ArrayList;

public class RegistroUsuarios {

    public static ArrayList<String[]> listaUsuarios = new ArrayList<>();

    
    public static void agregarUsuario(String nombre, String correo, String contrasena) {
        // Guardar en memoria
        listaUsuarios.add(new String[] { nombre, correo, contrasena });

        
        try {
            Connection conn = ConexionBD.getConexion();
            String sql = "INSERT INTO usuarios (nombre, correo, contrasena) VALUES (?, ?, ?)";
            java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombre);
            stmt.setString(2, correo);
            stmt.setString(3, contrasena);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static ArrayList<String[]> obtenerUsuarios() {
        ArrayList<String[]> usuarios = new ArrayList<>();

        try {
           
            Connection conn = ConexionBD.getConexion();
            String sql = "SELECT nombre, correo, contrasena FROM usuarios";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String correo = rs.getString("correo");
                String contrasena = rs.getString("contrasena");
                usuarios.add(new String[]{nombre, correo, contrasena});
            }

            // Cerrar recursos
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
}
