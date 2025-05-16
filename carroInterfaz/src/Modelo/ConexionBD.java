
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static Connection getConexion() throws SQLException {
        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");

           s
            String url = "jdbc:mysql://localhost:3307/tienda_carro"; 
            String usuario = "root";
            String contrasena = "";

           
            return DriverManager.getConnection(url, usuario, contrasena);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new SQLException("No se pudo establecer la conexión con la base de datos.");
        }
    }
}
