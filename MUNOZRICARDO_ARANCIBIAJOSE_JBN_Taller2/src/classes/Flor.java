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
public class Flor extends Semilla {

    private String color;

    public Flor(String color, int codigo, String nombre, int precio) {
        super(codigo, nombre, precio);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "Flor{" + "color=" + color + '}';
    }

    @Override
    public double calcularPrecioOferta() {
        double dCalcularPrecioOferta = 0.0;

        if (!this.color.equals("red")) {
            dCalcularPrecioOferta = this.precio + (this.precio * DESC_FLOR);
        }

        return dCalcularPrecioOferta;
    }

}
