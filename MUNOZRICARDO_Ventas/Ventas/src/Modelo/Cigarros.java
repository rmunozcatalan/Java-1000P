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
public class Cigarros extends Narcoticos {

    protected int cantidadNicotina;
    protected String tipoFiltro;

    public Cigarros() {
    }

    public Cigarros(String descProductos, int valProducto, int cantidad, String distribucion, int cantidadNicotina, String tipoFiltro) {
        super(descProductos, valProducto, cantidad, distribucion);
        this.cantidadNicotina = cantidadNicotina;
        this.tipoFiltro = tipoFiltro;
    }

    public int getCantidadNicotina() {
        return cantidadNicotina;
    }

    public void setCantidadNicotina(int cantidadNicotina) {
        this.cantidadNicotina = cantidadNicotina;
    }

    public String getTipoFiltro() {
        return tipoFiltro;
    }

    public void setTipoFiltro(String tipoFiltro) {
        this.tipoFiltro = tipoFiltro;
    }

}
