/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ricardo.munoz
 * @author jose.arancibia
 */
public class Medicamento extends Producto {

    private boolean bioequivalente;

    public Medicamento() {
    }

    public Medicamento(int codigo, String nombre, int precio, boolean bioequivalente) {
        super(codigo, nombre, precio);
        this.bioequivalente = bioequivalente;
    }

    public boolean isBioequivalente() {
        return bioequivalente;
    }

    public void setBioequivalente(boolean bioequivalente) {
        this.bioequivalente = bioequivalente;
    }

    @Override
    public String toString() {
        return super.toString() + "Medicamento{" + "bioequivalente=" + bioequivalente + '}';
    }

    @Override
    public double CalcularPrecioOferta() {
        return this.getPrecio() * DESC_BIOEQUIVALENTE;
    }

}
