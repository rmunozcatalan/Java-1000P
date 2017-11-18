package classes;

/**
 * @author Ricardo Munoz
 * @author Jose Arancibia
 */
public class FamiliaSemilla {

    private int codigo;
    private String descripcion;

    public FamiliaSemilla() {
    }

    public FamiliaSemilla(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
