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
public class Alcohol extends Narcotico{
    protected double gradoAlcohol;

    public Alcohol(String descProductos, int valProducto, int cantidad, String distribucion, double gradoAlcohol) {
        super(descProductos, valProducto, cantidad, distribucion);
        this.gradoAlcohol = gradoAlcohol;
    }

    public Alcohol() {
    }

    public double getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(double gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }
    
    
}
