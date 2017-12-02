package modelo;

public class Medicamento extends Narcotico {

    private String laboratorio;

    public Medicamento(String laboratorio, int cantidad, String distribucion, String DescripcionProducto, int ValorProducto) {
        super(cantidad, distribucion, DescripcionProducto, ValorProducto);
        this.laboratorio = laboratorio;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String toString() {
        return super.toString() + "Medicamento{" + "laboratorio=" + laboratorio + '}';
    }

}
