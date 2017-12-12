package modelo;

abstract public class Productos implements interfaceVentas {

    protected String DescripcionProducto;
    protected int ValorProducto;

    public Productos(String DescripcionProducto, int ValorProducto) {
        this.DescripcionProducto = DescripcionProducto;
        this.ValorProducto = ValorProducto;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public int getValorProducto() {
        return ValorProducto;
    }

    public void setValorProducto(int ValorProducto) {
        this.ValorProducto = ValorProducto;
    }

    @Override
    public String toString() {
        return "Productos{" + "DescripcionProducto=" + DescripcionProducto + ", ValorProducto=" + ValorProducto + '}';
    }

    @Override
    public String nombreProducto() {
        return this.getDescripcionProducto();
    }

    @Override
    public void aplicarDescuento() {
        this.setValorProducto(
                this.getValorProducto() * (int) descuento
        );
    }

}
