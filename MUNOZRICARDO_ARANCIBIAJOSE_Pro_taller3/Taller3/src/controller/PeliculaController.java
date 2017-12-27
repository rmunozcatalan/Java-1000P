package controller;

import model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeliculaController {

    //agregar Película
    public boolean agregarPelicula(Pelicula nuevaPelicula) {
        try {
            
            Conexion conexionOracle = new Conexion();
            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            
            String sql = "INSERT INTO RM_JA_PELICULA ( CODIGO, PRECIO, ID_CATEGORIA, FORMATO4K, NOMBRE) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, nuevaPelicula.getCodigo());
            stmt.setInt(2, nuevaPelicula.getPrecio());
            stmt.setInt(3, nuevaPelicula.getId_categoria());
            stmt.setString(4, nuevaPelicula.getFormato4k());
            stmt.setString(5, nuevaPelicula.getNombre());
            
            stmt.executeUpdate();
            stmt.close();
            conexionOracle.cerrar();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Película " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar Película " + e.getMessage());
            return false;
        }
    }

    //buscar Película por código
    public Pelicula buscarPeliculaPorCodigo(int codigo) {
        Pelicula pelicula = new Pelicula();
//        pelicula.setCodigo(0);
        try {
            
            Conexion conexionOracle = new Conexion();
            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            
            String sql = "SELECT * FROM RM_JA_PELICULA WHERE codigo = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, codigo);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                pelicula.setCodigo(rs.getInt("CODIGO"));
                pelicula.setPrecio(rs.getInt("PRECIO"));
                pelicula.setFormato4k(rs.getString("FORMATO4K"));
                pelicula.setNombre(rs.getString("NOMBRE"));
                pelicula.setId_categoria(rs.getInt("ID_CATEGORIA"));
            }
            stmt.close();
            conexionOracle.cerrar();
            
        } catch (SQLException e) {
            System.out.println("Error SQL al consultar Película por código" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al consultar Película por código" + e.getMessage());
        }
        return pelicula;
    }
    
}
