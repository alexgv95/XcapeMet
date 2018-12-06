/*
GRUPO
 */
package modelo;

/**
 *
 * @author Alex
 */
public class Grupo {

    private int grupo_id, responsable_id, viaje_id;
    private String nombre;

    public Grupo(int grupo_id, int responsable_id, int viaje_id, String nombre) {
        this.grupo_id = grupo_id;
        this.responsable_id = responsable_id;
        this.viaje_id = viaje_id;
        this.nombre = nombre;
    }

    public Grupo(int responsable_id, int viaje_id, String nombre) {
        this.responsable_id = responsable_id;
        this.viaje_id = viaje_id;
        this.nombre = nombre;
    }

    public int getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(int grupo_id) {
        this.grupo_id = grupo_id;
    }

    public int getResponsable_id() {
        return responsable_id;
    }

    public void setResponsable_id(int responsable_id) {
        this.responsable_id = responsable_id;
    }

    public int getViaje_id() {
        return viaje_id;
    }

    public void setViaje_id(int viaje_id) {
        this.viaje_id = viaje_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Grupo{" + "grupo_id=" + grupo_id + ", responsable_id=" + responsable_id + ", viaje_id=" + viaje_id + ", nombre=" + nombre + '}';
    }

}
