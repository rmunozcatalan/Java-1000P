/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Duoc
 */
public class Complemento extends Producto {

    private int cantidadComponentes;

    public Complemento() {
    }

    public Complemento(int codigo, String nombre, int precio, int cantidadComponentes) {
        super(codigo, nombre, precio);
        this.cantidadComponentes = cantidadComponentes;
    }

    public int getCantidadComponentes() {
        return cantidadComponentes;
    }

    public void setCantidadComponentes(int cantidadComponentes) {
        this.cantidadComponentes = cantidadComponentes;
    }

    @Override
    public String toString() {
        return super.toString() + "Complemento{" + "cantidadComponentes=" + cantidadComponentes + '}';
    }

    @Override
    public double calcularPrecioOferta() {
        return this.getPrecio() * DESC_COMPLEMENTO;
    }

}
