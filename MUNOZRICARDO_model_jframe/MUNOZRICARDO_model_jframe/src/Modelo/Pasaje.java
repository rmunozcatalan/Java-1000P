
package Modelo;


public class Pasaje extends Producto{
    protected String destino;

    public Pasaje() {}

    public Pasaje(String descProducto, int valProducto, String dest) {
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
     int total= this.valorProducto*InterfaceVenta.iva-1000;
         System.out.println("El Descuento es: "+total);
 };
    
}
