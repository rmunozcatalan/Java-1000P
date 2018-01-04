package Model;

public class Empleado {

    private int codigo;
    private String rut;
    private String nombre;
    private String apellido;
    private int celular;
    private String email;
    private int sueldo_bruto;
    private String est_civil;
    private String nom_depto;

    public Empleado() {
    }

    public Empleado(int codigo, String rut, String nombre, String apellido, int celular, String email, int sueldo_bruto, String est_civil, String nom_depto) {
        this.codigo = codigo;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
        this.sueldo_bruto = sueldo_bruto;
        this.est_civil = est_civil;
        this.nom_depto = nom_depto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public String getEst_civil() {
        return est_civil;
    }

    public void setEst_civil(String est_civil) {
        this.est_civil = est_civil;
    }

    public String getNom_depto() {
        return nom_depto;
    }

    public void setNom_depto(String nom_depto) {
        this.nom_depto = nom_depto;
    }

}
