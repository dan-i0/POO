package edu.daniel.martinez.proyecto.test;

import edu.daniel.martinez.proyecto.core.CarritoDeCompra;
import edu.daniel.martinez.proyecto.core.SistemaTienda;
import edu.daniel.martinez.proyecto.data.Libro;
import edu.daniel.martinez.proyecto.data.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTiendaTest {

    private SistemaTienda sistema;
    private CarritoDeCompra carrito;
    private Usuario usuario;

    @BeforeEach
    void setUp() {
        sistema = new SistemaTienda();
        carrito = new CarritoDeCompra();
        usuario = new Usuario("Pedro");
    }

    @Test
    void finalizarCompra_conCarritoVacio_noRegistraVentas() {
        sistema.finalizarCompra(carrito, usuario);

        assertTrue(sistema.getRegistroVentas().getVendidos().isEmpty(),
                "No deberían registrarse ventas si el carrito está vacío");
        assertTrue(carrito.getLibros().isEmpty(),
                "El carrito sigue vacío");
    }

    @Test
    void finalizarCompra_conCarritoConLibros_registraVentas() {
        Libro libro1 = new Libro("Java Básico", "Autor", 100, 2);
        Libro libro2 = new Libro("POO en Java", "Autor", 200, 2);

        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);

        sistema.finalizarCompra(carrito, usuario);

        assertEquals(2, sistema.getRegistroVentas().getVendidos().size(),
                "Deberían registrarse todos los libros vendidos");
    }

    @Test
    void finalizarCompra_vaciaElCarritoDespuesDeComprar() {
        Libro libro = new Libro("Java Básico", "Autor", 100, 1);
        carrito.agregarLibro(libro);

        sistema.finalizarCompra(carrito, usuario);

        assertTrue(carrito.getLibros().isEmpty(),
                "El carrito debería quedar vacío tras la compra");
    }

    @Test
    void finalizarCompra_registraExactamenteLosLibrosDelCarrito() {
        Libro libro1 = new Libro("Libro 1", "Autor", 50, 1);
        Libro libro2 = new Libro("Libro 2", "Autor", 75, 1);

        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);

        sistema.finalizarCompra(carrito, usuario);

        assertTrue(sistema.getRegistroVentas().getVendidos().contains(libro1));
        assertTrue(sistema.getRegistroVentas().getVendidos().contains(libro2));
    }
}