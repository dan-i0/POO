package edu.daniel.martinez.proyecto.test;

import edu.daniel.martinez.proyecto.core.CarritoDeCompra;
import edu.daniel.martinez.proyecto.data.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarritoDeCompraTest {

    private CarritoDeCompra carrito;
    private Libro libro;

    @BeforeEach
    void setUp() {
        carrito = new CarritoDeCompra();
        libro = new Libro("Java Básico", "Autor", 100, 2);
    }

    @Test
    void carritoDebeIniciarVacio() {
        assertTrue(carrito.getLibros().isEmpty(),
                "El carrito debería iniciar vacío");
    }

    @Test
    void agregarLibro_conStock_agregaAlCarritoYReduceStock() {
        carrito.agregarLibro(libro);

        assertEquals(1, carrito.getLibros().size(),
                "El libro debería agregarse al carrito");
        assertEquals(1, libro.getStock(),
                "El stock debería reducirse en 1");
    }

    @Test
    void quitarLibro_eliminaDelCarritoYAumentaStock() {
        carrito.agregarLibro(libro);

        carrito.quitarLibro(libro);

        assertTrue(carrito.getLibros().isEmpty(),
                "El carrito debería quedar vacío");
        assertEquals(2, libro.getStock(),
                "El stock debería volver a su valor original");
    }

    @Test
    void calcularSubtotal_conVariosLibros() {
        Libro libro2 = new Libro("POO en Java", "Autor", 200, 1);

        carrito.agregarLibro(libro);
        carrito.agregarLibro(libro2);

        double subtotal = carrito.calcularSubtotal();

        assertEquals(300.0, subtotal,
                "El subtotal debería ser la suma de los precios");
    }

    @Test
    void calcularSubtotal_carritoVacio_devuelveCero() {
        double subtotal = carrito.calcularSubtotal();

        assertEquals(0.0, subtotal,
                "El subtotal de un carrito vacío debe ser 0");
    }

    @Test
    void vaciarCarrito_eliminaTodosLosLibros() {
        carrito.agregarLibro(libro);
        carrito.vaciarCarrito();

        assertTrue(carrito.getLibros().isEmpty(),
                "El carrito debería quedar vacío tras vaciarlo");
    }
}