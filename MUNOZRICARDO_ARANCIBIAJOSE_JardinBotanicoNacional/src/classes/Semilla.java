package classes;
/**
 * @author Ricardo Munoz
 * @author Jose Arancibia
 */
public class Semilla {

    private int codigo;
    private String nombreCientifico;
    private FamiliaSemilla oFamiliaSemilla;
    private String nombreComun;
    private int numero;
    private String origen;
    private int precio;

    public Semilla() {
    }

    public Semilla(int codigo, String nombreCientifico, FamiliaSemilla oFamiliaSemilla, String nombreComun, int numero, String origen, int precio) {
        this.codigo = codigo;
        this.nombreCientifico = nombreCientifico;
        this.oFamiliaSemilla = oFamiliaSemilla;
        this.nombreComun = nombreComun;
        this.numero = numero;
        this.origen = origen;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public FamiliaSemilla getFamiliaSemilla() {
        return oFamiliaSemilla;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public int getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setFamiliaSemilla(FamiliaSemilla oFamiliaSemilla) {
        this.oFamiliaSemilla = oFamiliaSemilla;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Semilla{" + "codigo=" + codigo + ", nombreCientifico=" + nombreCientifico + ", familiaSemilla=" + oFamiliaSemilla.getDescripcion() + ", nombreComun=" + nombreComun + ", numero=" + numero + ", origen=" + origen + ", precio=" + precio + '}';
    }

    
}
