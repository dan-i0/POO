package edu.daniel.martinez.actividad1.Data;

/**
 *  Esta clase almacena la información de los autos que se venden
 * */

public class Datos {

    public static Auto[] getCars() {
        return new Auto[] {
                new Auto("Picanto", "Rojo", 2020, 220000),
                new Auto("Rio", "Negro", 2022, 285000),
                new Auto("Soul", "Blanco", 2021, 335000),
                new Auto("Seltos", "Gris", 2023, 420000),
                new Auto("Sportage", "Azul", 2024, 520000)
        };
    }
}
