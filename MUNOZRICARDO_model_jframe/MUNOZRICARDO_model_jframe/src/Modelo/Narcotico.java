/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Duoc
 */
public class Narcotico extends Producto{
    protected int cantidad;
    protected String distribucion;

   
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    public Narcotico(String descProductos, int valProducto, int cantidad, String distribucion) {
        super(descProductos,valProducto);
        this.cantidad = cantidad;
        this.distribucion = distribucion;
    }

    public Narcotico() {}

   
 
}
