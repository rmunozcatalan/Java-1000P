/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Factura {
    
    private int nro_factura;
    private String rut_cliente;
    private int monto;
    private int fecha;

    public Factura() {
        this.nro_factura=0;
        this.rut_cliente=" ";
        this.monto=0;
        this.fecha=0;
    }

    public int getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(int nro_factura) {
        this.nro_factura = nro_factura;
    }

    public String getRut_cliente() {
        return rut_cliente;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    

}
