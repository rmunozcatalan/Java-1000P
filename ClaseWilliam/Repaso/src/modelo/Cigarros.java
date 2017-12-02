package modelo;

public class Cigarros extends Productos {

    private String tipoFiltro;
    private int cantidadNicotina;

    public Cigarros(String tipoFiltro, int cantidadNicotina, String DescripcionProducto, int ValorProducto) {
        super(DescripcionProducto, ValorProducto);
        this.tipoFiltro = tipoFiltro;
        this.cantidadNicotina = cantidadNicotina;
    }

    public String getTipoFiltro() {
        return tipoFiltro;
    }

    public void setTipoFiltro(String tipoFiltro) {
        this.tipoFiltro = tipoFiltro;
    }

    public int getCantidadNicotina() {
        return cantidadNicotina;
    }

    public void setCantidadNicotina(int cantidadNicotina) {
        this.cantidadNicotina = cantidadNicotina;
    }

    @Override
    public String toString() {
        return super.toString() + "Cigarros{" + "tipoFiltro=" + tipoFiltro + ", cantidadNicotina=" + cantidadNicotina + '}';
    }

}
