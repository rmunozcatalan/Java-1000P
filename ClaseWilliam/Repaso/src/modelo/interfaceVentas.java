package modelo;

public interface interfaceVentas {

    double descuento = 0.4;
    double IVA = 0.19;

    public void aplicarDescuento();

    public String nombreProducto();
}
