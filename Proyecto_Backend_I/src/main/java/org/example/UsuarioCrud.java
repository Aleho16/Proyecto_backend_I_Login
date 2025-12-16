package org.example;

import java.sql.*;


public class UsuarioCrud {


    public static void registrar(Usuario u) {
        String sql = "INSERT INTO usuarios(username, password, intentos, activo) VALUES (?,?,?,?)";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {


            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ps.setInt(3, 0);
            ps.setBoolean(4, true);
            ps.executeUpdate();
            System.out.println("Usuario registrado");
        } catch (Exception e) {
            System.out.println("Error al registrar usuario");
        }
    }


    public static ResultSet login(String user) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE username = ?";
        Connection con = Conexion.getConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, user);
        return ps.executeQuery();
    }
}