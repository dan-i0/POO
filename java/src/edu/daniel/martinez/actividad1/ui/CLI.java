package edu.daniel.martinez.actividad1.ui;

import edu.daniel.martinez.actividad1.data.Auto;
import edu.daniel.martinez.actividad1.data.Ticket;

import java.util.Scanner;

/**
 * En este CLI se solicita el nombre del comprador y la fecha, captura el auto que se dea comprar y evita no aceptar una opcion invalida
 * */

public class CLI {

    public void start(){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es el nombre del cliente?: ");
        String nombreCliente = sc.nextLine();

        System.out.println("¿Cuál es la fecha?: ");
        String fechaHoy = sc.nextLine();

        Ticket ticket = new Ticket(nombreCliente, fechaHoy);

        Auto auto1 = new Auto("Picanto", "Rojo", 2020, 220000);
        Auto auto2 = new Auto("Rio", "Negro", 2022, 285000);
        Auto auto3 = new Auto("Soul", "Blanco", 2021, 335000);
        Auto auto4 = new Auto("Seltos", "Gris", 2023, 420000);
        Auto auto5 = new Auto("Sportage", "Azul", 2024, 520000);

        System.out.println("¿Bienvenid@, le gustaría comprar uno de los siguientes autos?");
        System.out.println("1 Picanto rojo.");
        System.out.println("2 Rio negro.");
        System.out.println("3 Soul blanco.");
        System.out.println("4 Seltos gris.");
        System.out.println("5 Sportage azul.");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                ticket.setAuto(auto1);
                break;
            case 2:
                ticket.setAuto(auto2);
                break;
            case 3:
                ticket.setAuto(auto3);
                break;
            case 4:
                ticket.setAuto(auto4);
                break;
            case 5:
                ticket.setAuto(auto5);
                break;
            default:
                System.out.println("Lo sentimos selecciono una opción no válida");
        }
        ticket.printTicket();
    }
}
