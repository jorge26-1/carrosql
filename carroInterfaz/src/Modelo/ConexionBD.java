
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static Connection getConexion() throws SQLException {
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // URL de conexión a la base de datos
            String url = "jdbc:mysql://localhost:3307/tienda_carro"; 
            String usuario = "root"; // Tu usuario de MySQL
            String contrasena = ""; // Tu contraseña de MySQL

            // Retorna la conexión
            return DriverManager.getConnection(url, usuario, contrasena);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new SQLException("No se pudo establecer la conexión con la base de datos.");
        }
    }
}
