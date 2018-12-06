/*
PAGOS
 */
package modelo;

/**
 *
 * @author Alex
 */
public class Pagos {

    private int pago_id, usuario_id;
    private String metodo_pago, primer_pago, segundo_pago, dni;

    public Pagos(int pago_id, int usuario_id, String metodo_pago, String primer_pago, String segundo_pago, String dni) {
        this.pago_id = pago_id;
        this.usuario_id = usuario_id;
        this.metodo_pago = metodo_pago;
        this.primer_pago = primer_pago;
        this.segundo_pago = segundo_pago;
        this.dni = dni;
    }

    public Pagos(int usuario_id, String metodo_pago, String primer_pago, String segundo_pago, String dni) {
        this.usuario_id = usuario_id;
        this.metodo_pago = metodo_pago;
        this.primer_pago = primer_pago;
        this.segundo_pago = segundo_pago;
        this.dni = dni;
    }

    public int getPago_id() {
        return pago_id;
    }

    public void setPago_id(int pago_id) {
        this.pago_id = pago_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getPrimer_pago() {
        return primer_pago;
    }

    public void setPrimer_pago(String primer_pago) {
        this.primer_pago = primer_pago;
    }

    public String getSegundo_pago() {
        return segundo_pago;
    }

    public void setSegundo_pago(String segundo_pago) {
        this.segundo_pago = segundo_pago;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Pagos{" + "pago_id=" + pago_id + ", usuario_id=" + usuario_id + ", metodo_pago=" + metodo_pago + ", primer_pago=" + primer_pago + ", segundo_pago=" + segundo_pago + ", dni=" + dni + '}';
    }

}
