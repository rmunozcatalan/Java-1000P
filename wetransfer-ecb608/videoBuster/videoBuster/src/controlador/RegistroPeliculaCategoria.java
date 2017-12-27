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
import modelo.PeliculaCategoria;

/**
 *
 * @author vina
 */
public class RegistroPeliculaCategoria {

    //buscar Película por código
    public PeliculaCategoria buscarPeliculaPorCodigo(int codigo) {
        PeliculaCategoria pelicula = new PeliculaCategoria();
        try {
            Conexion cnx = new Conexion();
            Connection coneccion = cnx.obtenerConexion();

            String sql = "SELECT p.codigo, p.nombre, p.formato4K, c.descripcion, p.precio, c.id FROM pelicula AS p, categoria AS c WHERE p.id_categoria = c.id AND p.codigo=?;";
            PreparedStatement stmt = coneccion.prepareStatement(sql);

            stmt.setInt(1, codigo);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                pelicula.setCodigo(rs.getInt("CODIGO"));
                pelicula.setNombre(rs.getString("NOMBRE"));
                pelicula.setFormato4k(rs.getString("FORMATO4K"));
                pelicula.setCategoria(rs.getString("DESCRIPCION"));
                pelicula.setPrecio(rs.getInt("PRECIO"));
                pelicula.setId(rs.getInt("ID"));
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
    public ArrayList<PeliculaCategoria> buscarTodasPelicula() {
        ArrayList<PeliculaCategoria> listaPelicula = new ArrayList<PeliculaCategoria>();
        try {
            Conexion cnx = new Conexion();
            Connection coneccion = cnx.obtenerConexion();

            String sql = "SELECT p.codigo, p.nombre, p.formato4K, c.descripcion, p.precio, c.id FROM pelicula AS p, categoria AS c WHERE p.id_categoria = c.id  order by p.NOMBRE ASC";
            PreparedStatement stmt = coneccion.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                PeliculaCategoria pelicula = new PeliculaCategoria();
                pelicula.setCodigo(rs.getInt("CODIGO"));
                pelicula.setNombre(rs.getString("NOMBRE"));
                pelicula.setFormato4k(rs.getString("FORMATO4K"));
                pelicula.setCategoria(rs.getString("DESCRIPCION"));
                pelicula.setPrecio(rs.getInt("PRECIO"));
                pelicula.setId(rs.getInt("ID"));

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
