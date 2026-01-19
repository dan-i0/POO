package edu.daniel.martinez.actividad1.process;

/**
 *  Guarda la lista de autos de los que se dispponen
 * */

import edu.daniel.martinez.actividad1.Data.Auto;
import edu.daniel.martinez.actividad1.Data.Datos;
import edu.daniel.martinez.actividad1.Data.Ticket;

public class ShopManager {
    private Auto[] datos;

    public ShopManager() {
        datos = Datos.getCars();
    }
}