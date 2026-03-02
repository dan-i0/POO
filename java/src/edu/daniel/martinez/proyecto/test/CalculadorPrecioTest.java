package edu.daniel.martinez.proyecto.test;

import edu.daniel.martinez.proyecto.calcular.CalculadorPrecio;
import edu.daniel.martinez.proyecto.core.CarritoDeCompra;
import edu.daniel.martinez.proyecto.data.Libro;
import edu.daniel.martinez.proyecto.data.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadorPrecioTest {

    private CalculadorPrecio calculador;
    private CarritoDeCompra carrito;

    @BeforeEach
    void setUp() {
        calculador = new CalculadorPrecio();
        carrito = new CarritoDeCompra();
    }

    @Test
    void calcularTotal_sinDescuento_usuarioGenerico() {
        carrito.agregarLibro(new Libro("Libro 1", "Autor", 100, 1));
        carrito.agregarLibro(new Libro("Libro 2", "Autor", 200, 1));

        Usuario usuario = new Usuario("Pedro");

        double total = calculador.calcularTotal(carrito, usuario);

        assertEquals(300.0, total);
    }

    @Test
    void calcularTotal_conDescuentoEstudiante() {
        carrito.agregarLibro(new Libro("Libro 1", "Autor", 100, 1));
        carrito.agregarLibro(new Libro("Libro 2", "Autor", 200, 1));

        Usuario estudiante = new Usuario.Estudiante("Ana");

        double total = calculador.calcularTotal(carrito, estudiante);

        // Total = 300 - 10% = 270
        assertEquals(270.0, total);
    }

    @Test
    void calcularTotal_conDescuentoMaestro() {
        carrito.agregarLibro(new Libro("Libro 1", "Autor", 100, 1));
        carrito.agregarLibro(new Libro("Libro 2", "Autor", 200, 1));

        Usuario maestro = new Usuario.Maestro("Carlos");

        double total = calculador.calcularTotal(carrito, maestro);

        // Total = 300 - 15% = 255
        assertEquals(255.0, total);
    }

    @Test
    void calcularTotal_carritoVacio_devuelveCero() {
        Usuario usuario = new Usuario("Laura");

        double total = calculador.calcularTotal(carrito, usuario);

        assertEquals(0.0, total);
    }
}