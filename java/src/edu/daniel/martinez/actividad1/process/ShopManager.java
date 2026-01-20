package edu.daniel.martinez.actividad1.process;

import edu.daniel.martinez.actividad1.data.Auto;
import edu.daniel.martinez.actividad1.data.Datos;

/**
 *  Guarda la lista de autos de los que se dispponen
 * */

public class ShopManager {
    private Auto[] datos;

    public ShopManager() {
        datos = Datos.getCars();
    }
}
