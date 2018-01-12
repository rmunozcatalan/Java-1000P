/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.RegistroPeliculaCategoria;
import java.util.ArrayList;

/**
 *
 * @author vina
 */
public class PeliculaCategoria {

    private int codigo, precio, id;
    private String formato4k, nombre, categoria;

    public PeliculaCategoria() {
    }

    public PeliculaCategoria(int codigo, int precio, int id, String formato4k, String nombre, String categoria) {
        this.codigo = codigo;
        this.precio = precio;
        this.id = id;
        this.formato4k = formato4k;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFormato4k() {
        return formato4k;
    }

    public void setFormato4k(String formato4k) {
        this.formato4k = formato4k;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void buscarPeliculaPorNombre(String nombre)
    {
            RegistroPeliculaCategoria rpc = new RegistroPeliculaCategoria();
            ArrayList<PeliculaCategoria> listaPelicula = new ArrayList<PeliculaCategoria>();
            listaPelicula = rpc.buscarPeliculaPorNombre(nombre);
            
            if (listaPelicula.get(0).nombre!=null)
            {                
                for(int x=0;x<listaPelicula.size();x++) {                    
                System.out.println(listaPelicula.get(x).getCodigo() + "-" +  listaPelicula.get(x).getNombre()  + "-" +  listaPelicula.get(x).getFormato4k() + "-" +  listaPelicula.get(x).getCategoria() + "-" +  String.valueOf(listaPelicula.get(x).precio));
              }
                System.out.println("Se realizó la búsqueda de la(s) película(s) por nombre correctamente");
                
                
            }
            else
            {
                System.out.println("Error en la búsqueda de la película por nombre");
            }
    
    }
   
    
        public void buscarPeliculaPorCategoriaNombre(String nombre)
    {
            RegistroPeliculaCategoria rpc = new RegistroPeliculaCategoria();
            ArrayList<PeliculaCategoria> listaPelicula = new ArrayList<PeliculaCategoria>();
            listaPelicula = rpc.buscarPeliculaPorCategoriaNombre(nombre);
            
            if (listaPelicula.get(0).nombre!=null)
            {                
                for(int x=0;x<listaPelicula.size();x++) {                    
                System.out.println(listaPelicula.get(x).getCategoria() + "-" +  listaPelicula.get(x).getNombre()  + "-" +  listaPelicula.get(x).getFormato4k() + "-" +  listaPelicula.get(x).getCodigo()+ "-" +  String.valueOf(listaPelicula.get(x).precio));
              }
                System.out.println("Se realizó la búsqueda de la(s) película(s) por categoría nombre correctamente");
                
                
            }
            else
            {
                System.out.println("Error en la búsqueda de la película por categoría ");
            }
    
    }
    
    
}
