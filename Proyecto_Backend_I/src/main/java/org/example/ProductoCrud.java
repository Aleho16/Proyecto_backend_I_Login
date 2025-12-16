package org.example;

import java.sql.*;


public class ProductoCrud {


    public static void agregar(String nombre, double precio) {
        String sql = "INSERT INTO productos(nombre, precio, estado) VALUES (?,?,true)";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {


            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.executeUpdate();
            System.out.println("Producto agregado");
        } catch (Exception e) {
            System.out.println("Error al agregar producto");
        }
    }


    public static void listar() {
        String sql = "SELECT * FROM productos";
        try (Connection con = Conexion.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {


            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getDouble("precio"));
            }
        } catch (Exception e) {
            System.out.println("Error al listar");
        }
    }
}