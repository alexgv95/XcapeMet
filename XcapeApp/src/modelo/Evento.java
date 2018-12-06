/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alex
 */
public class Evento {

    private int evento_id, listas;
    private String nombre, direccion, ciudad, fecha;

    public Evento(int listas, String nombre, String direccion, String ciudad, String fecha) {
        this.listas = listas;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.fecha = fecha;
    }

    public Evento(int evento_id, int listas, String nombre, String direccion, String ciudad, String fecha) {
        this.evento_id = evento_id;
        this.listas = listas;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.fecha = fecha;
    }

    public int getEvento_id() {
        return evento_id;
    }

    public void setEvento_id(int evento_id) {
        this.evento_id = evento_id;
    }

    public int getListas() {
        return listas;
    }

    public void setListas(int listas) {
        this.listas = listas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Evento{" + "evento_id=" + evento_id + ", listas=" + listas + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad + ", fecha=" + fecha + '}';
    }

}
