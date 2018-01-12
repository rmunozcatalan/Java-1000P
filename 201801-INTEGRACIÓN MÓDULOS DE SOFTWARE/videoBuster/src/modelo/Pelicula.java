/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.RegistroPelicula;

/**
 *
 * @author vina
 */
public class Pelicula {

    private int codigo, precio, id_categoria;
    private String formato4k, nombre;

    public Pelicula() {
    }

    public Pelicula(int codigo, int precio, int id_categoria, String formato4k, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.id_categoria = id_categoria;
        this.formato4k = formato4k;
        this.nombre = nombre;
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

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
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
    
    
    public void grabar(Pelicula p)
    {
              RegistroPelicula rp = new RegistroPelicula();
        if (rp.agregarPelicula(p))
        {
                System.out.println("Se grabó correctamente la pelicula");
        }
        else
        {
                System.out.println("Error en la grabación de la pelicula");
        }         
    }
    
     public void actualizar(Pelicula p)
    {
              RegistroPelicula rp = new RegistroPelicula();
        if (rp.actualizarPelicula(p))
        {
                System.out.println("Se actualizó correctamente la pelicula");
        }
        else
        {
                System.out.println("Error en la actualización de la pelicula");
        }         
    }

}
