package edu.daniel.martinez.actividad1.Data;

import java.time.LocalDate;

/**
 *  En esta funcion se va a generar el ticket de compra
 * */

public class Ticket {
    private Auto auto;
    private String nombreCliente;
    private String fechaHoy;

    public Ticket (String nombreCliente, String fechaHoy){
        this.nombreCliente = nombreCliente;
        this.fechaHoy = fechaHoy;
        this.auto = null;
    }

    public Ticket(String nombreCliente) {
    }

    public void setAuto(Auto auto){
        this.auto = auto;
    }

    public void printTicket() {
        System.out.println("Ticket");
        System.out.println("Cliente" + nombreCliente);
        System.out.println("Fecha" + fechaHoy);

        if (auto != null) {
            System.out.println("Modelo" + auto.getModelo());
            System.out.println("Color" + auto.getColor());
            System.out.println("Año" + auto.getAnio());
            System.out.println("Precio $" + auto.getPrecio());
        } else {
            System.out.println("No selecciono un auto");
        }
    }
}

