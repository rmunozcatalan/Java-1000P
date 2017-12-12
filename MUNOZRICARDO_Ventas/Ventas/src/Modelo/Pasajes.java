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
public class Pasajes extends Productos{
    protected String destino;

    public Pasajes() {}

    public Pasajes(String descProducto, int valProducto, String dest) {
        super(descProducto,valProducto);
        this.destino=dest;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    
           @Override
 public void aplicarDescuento(){
     int total= this.valorProducto*InterfaceVentas.iva-1000;
         System.out.println("El Descuento es: "+total);
 };
    
}
