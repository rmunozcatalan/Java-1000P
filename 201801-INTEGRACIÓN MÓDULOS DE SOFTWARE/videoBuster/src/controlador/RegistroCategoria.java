/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.ConexionMYSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Categoria;
import modelo.Pelicula;

/**
 *
 * @author yayi
 */
public class RegistroCategoria {
    //buscar todas las categorías

    public ArrayList<Categoria> buscarTodasCategorias() {
        ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();
        try {
            ConexionMYSQL cnx = new ConexionMYSQL();
            Connection coneccion = cnx.obtenerConexion();

            String sql = "SELECT * FROM CATEGORIA order by DESCRIPCION ASC";
            PreparedStatement stmt = coneccion.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("ID"));
                categoria.setDescripcion(rs.getString("DESCRIPCION"));

                listaCategoria.add(categoria);
            }

            stmt.close();
            coneccion.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al consultar las categorías" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al consultar las categorías" + e.getMessage());
        }
        return listaCategoria;
    }
    
    //agregar Película
    public boolean agregarCategoria(Categoria nuevaCategoria) {
        try {
            ConexionMYSQL cnx = new ConexionMYSQL();
            Connection coneccion = cnx.obtenerConexion();

            String sql = "INSERT INTO CATEGORIA(ID,DESCRIPCION) VALUES(?,?)";
            PreparedStatement stmt = coneccion.prepareStatement(sql);

            stmt.setInt(1, nuevaCategoria.getId());
            stmt.setString(2, nuevaCategoria.getDescripcion());

            stmt.executeUpdate();
            stmt.close();
            coneccion.close();
            return true;
        } 
        catch (SQLException e) {
            System.out.println("Error SQL al agregar Categoria " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar Categoria " + e.getMessage());
            return false;
        }

    }
}
