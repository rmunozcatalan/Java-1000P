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
public class Arbol extends Semilla {

    private int alturaMaxima;

    public Arbol(int alturaMaxima, int codigo, String nombre, int precio) {
        super(codigo, nombre, precio);
        this.alturaMaxima = alturaMaxima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + "Arbol{" + "alturaMaxima=" + alturaMaxima + '}';
    }

    @Override
    public double calcularPrecioOferta() {
        double dCalcularPrecioOferta = 0.0;

        if (this.alturaMaxima > 180) {
            dCalcularPrecioOferta = this.precio + (this.precio * DESC_ARBOL);
        }

        return dCalcularPrecioOferta;
    }
}
