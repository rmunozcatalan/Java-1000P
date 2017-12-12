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
public class Medicamentos extends Narcoticos{
    protected String laboratorio;

    public Medicamentos() {
    }

    public Medicamentos(String descProductos, int valProducto, int cantidad, String distribucion,String laboratorio) {
        super(descProductos, valProducto, cantidad, distribucion);
        this.laboratorio = laboratorio;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
           @Override
 public void aplicarDescuento(){
     int total= this.valorProducto*InterfaceVentas.iva-100;
         System.out.println("El Descuento es: "+total);
 };
}
