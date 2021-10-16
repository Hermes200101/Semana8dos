/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Wlfran
 */ 
public class Datos {
    private String nombre, fecha, vehiculo, servicio;

    public Datos(String fecha, String nombre, String vehiculo, String servicio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.servicio = servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public String getServicio() {
        return servicio;
    }

}
