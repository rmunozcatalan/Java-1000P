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
abstract public class Producto implements InterfaceVenta{
    protected String descripcionProductos;
    protected int valorProducto;

    public String getDescripcionProductos() {
        return descripcionProductos;
    }

    public void setDescripcionProductos(String descripcionProductos) {
        this.descripcionProductos = descripcionProductos;
    }

    public int getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(int valorProducto) {
        this.valorProducto = valorProducto;
    }

    public Producto(String descripcionProductos, int valorProducto) {
        this.descripcionProductos = descripcionProductos;
        this.valorProducto = valorProducto;
    } 

    public Producto() {
    }
    
       @Override
 public void aplicarDescuento(){
     int total= this.valorProducto*InterfaceVenta.iva;
         System.out.println("El Descuento es: "+total);
 };
    
    
    @Override
 public String nombreProducto(){
        return this.nombreProducto();
};   
    
    
    
    
    
    
/*
    public boolean RetornaBioequi(String Algo){
        boolean respuesta=false;    
        if ("A"==Algo){
            respuesta=true;
        }else{
            respuesta=false;
        }
        return respuesta;
    }
    
    public void MetodoQueEsALGO(String distribucion) {
        if (distribucion=="A"){
            System.out.println("ES Verdadero");
        }else{
            System.out.println("Es Falso"); 
        }
            
    }
    
    */
 
    public String listarProductos() {
        return "Productos{" + "descripcionProductos=" + descripcionProductos + ", valorProducto=" + valorProducto + '}';
    }
}
