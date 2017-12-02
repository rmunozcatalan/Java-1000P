package modelo;

public class Narcotico extends Productos {

    protected int cantidad;
    protected String distribucion;

    public Narcotico(int cantidad, String distribucion, String DescripcionProducto, int ValorProducto) {
        super(DescripcionProducto, ValorProducto);
        this.cantidad = cantidad;
        this.distribucion = distribucion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    @Override
    public String toString() {
        return super.toString() + "Narcotico{" + "cantidad=" + cantidad + ", distribucion=" + distribucion + '}';
    }

}
