package edu.daniel.martinez.proyecto.calcular;

import edu.daniel.martinez.proyecto.core.CarritoDeCompra;
import edu.daniel.martinez.proyecto.data.Libro;
import edu.daniel.martinez.proyecto.data.Usuario;

/**
 * La clase CalculadorPrecio se encarga de calcular
 * el total a pagar de un carrito de compras aplicando
 * el descuento correspondiente según el tipo de usuario.
 * El proceso es:
 * Sumar el precio de todos los libros del carrito
 * Obtener el porcentaje de descuento del usuario
 * Aplicar el descuento al total
 */
public class CalculadorPrecio {
    private CalculadorDescuento calculadorDescuento = new CalculadorDescuento();
    /**
     * Calcula el total final del carrito aplicando el descuento.
     *
     * @param carrito Carrito de compras con los libros seleccionados.
     * @param usuario Usuario que realiza la compra.
     * @return Total final con descuento aplicado.
     */
    public double calcularTotal(CarritoDeCompra carrito, Usuario usuario) {
        double total = 0;

        for (Libro l : carrito.getLibros()) {
            total += l.getPrecio();
        }

        double descuento = calculadorDescuento.calcularDescuento(usuario);

        return total - (total * descuento);
    }
}