package edu.daniel.martinez.actividad1.data;

public class Auto {
    private String modelo;
    private String color;
    private int anio;
    private double precio;

    /**
     * El siguiente metodo obtiene los valores guardados en "Datos"
     * */

    public Auto(String modelo, String color, int anio, double precio) {
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.precio = precio;
    }
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getInfo() {
        return modelo + " / " + color + " / " + anio + " / $" + precio;
    }
}
