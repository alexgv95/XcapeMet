/*
RESPONSABLE
 */
package modelo;

/**
 *
 * @author Alex
 */
public class Responsable {

    private int responsable_id, movil;
    private String nombre, apellido;

    public Responsable(int responsable_id, int movil, String nombre, String apellido) {
        this.responsable_id = responsable_id;
        this.movil = movil;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Responsable(int movil, String nombre, String apellido) {
        this.movil = movil;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getResponsable_id() {
        return responsable_id;
    }

    public void setResponsable_id(int responsable_id) {
        this.responsable_id = responsable_id;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
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

    @Override
    public String toString() {
        return "Responsable{" + "responsable_id=" + responsable_id + ", movil=" + movil + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
