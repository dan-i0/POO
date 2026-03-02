package edu.daniel.martinez.proyecto.core;

import edu.daniel.martinez.proyecto.calcular.CalculadorPrecio;
import edu.daniel.martinez.proyecto.data.Libro;
import edu.daniel.martinez.proyecto.data.Usuario;

/**
 * La clase SistemaTienda coordina el proceso de compra.
 * Se encarga de:
 * Calcular el total de la compra aplicando descuentos.
 * Mostrar un resumen en consola.
 * Registrar los libros vendidos.
 * Vaciar el carrito después de la compra.
 * Si el carrito está vacío, la compra no se procesa.
 */
public class SistemaTienda {
    private CalculadorPrecio calculadorPrecio;
    private RegistroVentas registroVentas;

    /**
     * Constructor que inicializa el sistema
     * con un calculador de precios y un registro de ventas.
     */
    public SistemaTienda() {
        calculadorPrecio = new CalculadorPrecio();
        registroVentas = new RegistroVentas();
    }

    /**
     * Finaliza el proceso de compra.
     * @param carrito Carrito de compras del usuario.
     * @param usuario Usuario que realiza la compra.
     */
    public void finalizarCompra(CarritoDeCompra carrito, Usuario usuario) {

        if (carrito.getLibros().isEmpty()) {
            System.out.println("No puedes comprar con el carrito vacío.");
            return;
        }

        double total = calculadorPrecio.calcularTotal(carrito, usuario);

        System.out.println("----- RESUMEN DE COMPRA -----");
        carrito.mostrarCarrito();

        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Total final a pagar: $" + total);

        for (Libro l : carrito.getLibros()) {
            registroVentas.registrarVenta(l);
        }

        carrito.vaciarCarrito();

        System.out.println("Compra realizada con éxito.");
    }

    /**
     * Devuelve el registro de ventas del sistema.
     * @return RegistroVentas con los libros vendidos.
     */
    public RegistroVentas getRegistroVentas() {
        return registroVentas;
    }
}