package modelo;

public class Pasajes implements interfaceVentas {

    protected String Destino;

    public Pasajes(String Destino) {
        this.Destino = Destino;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    @Override
    public String toString() {
        return "Pasajes{" + "Destino=" + Destino + '}';
    }

    @Override
    public void aplicarDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String nombreProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
