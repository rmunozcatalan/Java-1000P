/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Vendible;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
public abstract class Semilla  implements Vendible{

    protected int codigo;
    protected String nombre;
    protected int precio;

    public Semilla(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Semilla{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

    @Override
    public double calcularPrecioOferta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
