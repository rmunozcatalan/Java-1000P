package modelo;

public class Alcohol extends Productos {

    private double gradosAlcoholicos;

    public Alcohol(double gradosAlcoholicos, String DescripcionProducto, int ValorProducto) {
        super(DescripcionProducto, ValorProducto);
        this.gradosAlcoholicos = gradosAlcoholicos;
    }

    public double getGradosAlcoholicos() {
        return gradosAlcoholicos;
    }

    public void setGradosAlcoholicos(double gradosAlcoholicos) {
        this.gradosAlcoholicos = gradosAlcoholicos;
    }

    @Override
    public String toString() {
        return super.toString() + "Alcohol{" + "gradosAlcoholicos=" + gradosAlcoholicos + '}';
    }

}
