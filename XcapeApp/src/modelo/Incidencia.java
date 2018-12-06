/*
INCIDENCIA
 */
package modelo;

/**
 *
 * @author Alex
 */
public class Incidencia {
    private int incidencia_id, usuario_id, grupo_id;
    private String mensaje;

    public Incidencia(int incidencia_id, int usuario_id, int grupo_id, String mensaje) {
        this.incidencia_id = incidencia_id;
        this.usuario_id = usuario_id;
        this.grupo_id = grupo_id;
        this.mensaje = mensaje;
    }

    public Incidencia(int usuario_id, int grupo_id, String mensaje) {
        this.usuario_id = usuario_id;
        this.grupo_id = grupo_id;
        this.mensaje = mensaje;
    }

    public int getIncidencia_id() {
        return incidencia_id;
    }

    public void setIncidencia_id(int incidencia_id) {
        this.incidencia_id = incidencia_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(int grupo_id) {
        this.grupo_id = grupo_id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Incidencia{" + "incidencia_id=" + incidencia_id + ", usuario_id=" + usuario_id + ", grupo_id=" + grupo_id + ", mensaje=" + mensaje + '}';
    }
    
    
}
