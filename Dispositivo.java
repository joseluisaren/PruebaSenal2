package com.example.pruebasenal;


import java.io.Serializable;

/**
 * Created by Carlos on 22/03/2015.
 */
public class Dispositivo implements Serializable {


    private String nombre;
    private double rssi;
    private double latitud;
    private double longitud;

    public Dispositivo(String nombre, double rssi, double latitud, double longitud) {
        this.nombre = nombre;
        this.rssi = rssi;
        this.latitud=latitud;
        this.longitud=longitud;
    }


    public Dispositivo(String nombre, double rssi) {
        this(nombre, rssi,0,0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRssi() {
        return rssi;
    }

    public void setRssi(double rssi) {
        this.rssi = rssi;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
