
package modelo;

/**
 *
 * @author sergiomariocortescarmona
 */
public class Pelicula {
    int codigo, precio, idcategoria;
    String formato4k, nombre;

    public Pelicula() {
        this.codigo= codigo;
        this.precio=0;
        this.idcategoria=0;
        this.formato4k="";
        this.nombre="";
    }
    
    public Pelicula(int codigo, int precio, int idcategoria, String formato4k, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.idcategoria = idcategoria;
        this.formato4k = formato4k;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getFormato4k() {
        return formato4k;
    }

    public void setFormato4k(String formato4k) {
        this.formato4k = formato4k;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "codigo=" + codigo + ", precio=" + precio + ", idcategoria=" + idcategoria + ", formato4k=" + formato4k + ", nombre=" + nombre + '}';
    }
    
    
}
