/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Pelicula;

/**
 *
 * @author vina
 */
public class RegistroPelicula {

    //agregar Película
    public boolean agregarPelicula(Pelicula nuevaPelicula) {
        try {
            Conexion cnx = new Conexion();
            Connection coneccion = cnx.obtenerConexion();

            String sql = "INSERT INTO PELICULA(CODIGO,PRECIO,FORMATO4K,NOMBRE,ID_CATEGORIA) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = coneccion.prepareStatement(sql);

            stmt.setInt(1, nuevaPelicula.getCodigo());
            stmt.setInt(2, nuevaPelicula.getPrecio());
            stmt.setString(3, nuevaPelicula.getFormato4k());
            stmt.setString(4, nuevaPelicula.getNombre());
            stmt.setInt(5, nuevaPelicula.getId_categoria());

            stmt.executeUpdate();
            stmt.close();
            coneccion.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Película " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar Película " + e.getMessage());
            return false;
        }

    }

    //actualizar Película
    public boolean actualizarPelicula(Pelicula modificaPelicula) {
        try {
            Conexion cnx = new Conexion();
            Connection coneccion = cnx.obtenerConexion();

            String sql = "UPDATE PELICULA SET PRECIO=?,FORMATO4K=?,NOMBRE=?,ID_CATEGORIA=? WHERE CODIGO = ?";
            PreparedStatement stmt = coneccion.prepareStatement(sql);

            stmt.setInt(1, modificaPelicula.getPrecio());
            stmt.setString(2, modificaPelicula.getFormato4k());
            stmt.setString(3, modificaPelicula.getNombre());
            stmt.setInt(4, modificaPelicula.getId_categoria());
            stmt.setInt(5, modificaPelicula.getCodigo());

            stmt.executeUpdate();
            stmt.close();
            coneccion.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar Película " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al actualizar Película " + e.getMessage());
            return false;
        }
    }

    //eliminar Película
    public boolean eliminarPelicula(int codigo) {
        try {
            Conexion cnx = new Conexion();
            Connection coneccion = cnx.obtenerConexion();

            String sql = "DELETE FROM PELICULA WHERE codigo = ?";
            PreparedStatement stmt = coneccion.prepareStatement(sql);

            stmt.setInt(1, codigo);

            stmt.executeUpdate();
            stmt.close();
            coneccion.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar Película " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al eliminar Película" + e.getMessage());
            return false;
        }
    }

    //buscar Película por código
    public Pelicula buscarPeliculaPorCodigo(int codigo) {
        Pelicula pelicula = new Pelicula();
        try {
            Conexion cnx = new Conexion();
            Connection coneccion = cnx.obtenerConexion();

            String sql = "SELECT * FROM PELICULA WHERE codigo = ?";
            PreparedStatement stmt = coneccion.prepareStatement(sql);

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
            coneccion.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al consultar Película por código" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al consultar Película por código" + e.getMessage());
        }
        return pelicula;
    }

    //buscar todas las Películas
    public ArrayList<Pelicula> buscarTodosPelicula() {
        ArrayList<Pelicula> listaPelicula = new ArrayList<Pelicula>();
        try {
            Conexion cnx = new Conexion();
            Connection coneccion = cnx.obtenerConexion();

            String sql = "SELECT * FROM PELICULA order by NOMBRE ASC";
            PreparedStatement stmt = coneccion.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.setCodigo(rs.getInt("CODIGO"));
                pelicula.setPrecio(rs.getInt("PRECIO"));
                pelicula.setFormato4k(rs.getString("FORMATO4K"));
                pelicula.setNombre(rs.getString("NOMBRE"));
                pelicula.setId_categoria(rs.getInt("ID_CATEGORIA"));

                listaPelicula.add(pelicula);
            }

            stmt.close();
            coneccion.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al consultar las Películas" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al consultar las Películas" + e.getMessage());
        }
        return listaPelicula;
    }

}
