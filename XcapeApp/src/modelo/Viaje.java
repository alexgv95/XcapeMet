/*
VIAJE
 */
package modelo;

/**
 *
 * @author Alex
 */
public class Viaje {

    private int viaje_id, duracion;
    private String hotel, direccion_hotel, regimen, estacion_forfait;

    public Viaje(int viaje_id, int duracion, String hotel, String direccion_hotel, String regimen, String estacion_forfait) {
        this.viaje_id = viaje_id;
        this.duracion = duracion;
        this.hotel = hotel;
        this.direccion_hotel = direccion_hotel;
        this.regimen = regimen;
        this.estacion_forfait = estacion_forfait;
    }

    public Viaje(int duracion, String hotel, String direccion_hotel, String regimen, String estacion_forfait) {
        this.duracion = duracion;
        this.hotel = hotel;
        this.direccion_hotel = direccion_hotel;
        this.regimen = regimen;
        this.estacion_forfait = estacion_forfait;
    }

    public int getViaje_id() {
        return viaje_id;
    }

    public void setViaje_id(int viaje_id) {
        this.viaje_id = viaje_id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getDireccion_hotel() {
        return direccion_hotel;
    }

    public void setDireccion_hotel(String direccion_hotel) {
        this.direccion_hotel = direccion_hotel;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getEstacion_forfait() {
        return estacion_forfait;
    }

    public void setEstacion_forfait(String estacion_forfait) {
        this.estacion_forfait = estacion_forfait;
    }

    @Override
    public String toString() {
        return "Viaje{" + "viaje_id=" + viaje_id + ", duracion=" + duracion + ", hotel=" + hotel + ", direccion_hotel=" + direccion_hotel + ", regimen=" + regimen + ", estacion_forfait=" + estacion_forfait + '}';
    }

}
