package Modelo;

import java.sql.*;
import java.util.ArrayList;

public class RegistroVehiculos {

    
    public static ArrayList<String[]> listaVehiculos = new ArrayList<>();

    
    public static void agregarVehiculo(String serial, int puertas, String modelo, String marca, String combustible, String adicionales) {
        
        listaVehiculos.add(new String[] {
            serial, String.valueOf(puertas), modelo, marca, combustible, adicionales
        });

        
        try {
            Connection conn = ConexionBD.getConexion();
            String sql = "INSERT INTO vehiculos (serial_vehiculo, numero_puertas, modelo_vehiculo, marca, tipo_combustible, caracteristicas_adicionales) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, serial);
            stmt.setInt(2, puertas);
            stmt.setString(3, modelo);
            stmt.setString(4, marca);
            stmt.setString(5, combustible);
            stmt.setString(6, adicionales);
            stmt.executeUpdate();

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static ArrayList<String[]> obtenerVehiculos() {
        ArrayList<String[]> lista = new ArrayList<>();

        try {
            Connection conn = ConexionBD.getConexion();
            String sql = "SELECT serial_vehiculo, numero_puertas, modelo_vehiculo, marca, tipo_combustible, caracteristicas_adicionales FROM vehiculos";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String serial = rs.getString("serial_vehiculo");
                String puertas = String.valueOf(rs.getInt("numero_puertas"));
                String modelo = rs.getString("modelo_vehiculo");
                String marca = rs.getString("marca");
                String combustible = rs.getString("tipo_combustible");
                String adicionales = rs.getString("caracteristicas_adicionales");

                lista.add(new String[]{serial, puertas, modelo, marca, combustible, adicionales});
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
