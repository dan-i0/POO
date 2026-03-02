package edu.daniel.martinez.proyecto.test;

import edu.daniel.martinez.proyecto.data.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    private Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("Java Básico", "Juan Pérez", 150.0, 3);
    }

    @Test
    void constructor_inicializaCorrectamenteLosCampos() {
        assertEquals("Java Básico", libro.getTitulo());
        assertEquals("Juan Pérez", libro.getAutor());
        assertEquals(150.0, libro.getPrecio());
        assertEquals(3, libro.getStock());
    }

    // ---------- STOCK ----------

    @Test
    void hayStock_conStockMayorACero_devuelveTrue() {
        assertTrue(libro.hayStock(),
                "Debería haber stock disponible");
    }

    @Test
    void hayStock_conStockCero_devuelveFalse() {
        Libro sinStock = new Libro("Sin Stock", "Autor", 100, 0);

        assertFalse(sinStock.hayStock(),
                "No debería haber stock disponible");
    }

    @Test
    void reducirStock_conStockDisponible_reduceEnUno() {
        libro.reducirStock();

        assertEquals(2, libro.getStock(),
                "El stock debería reducirse en 1");
    }

    @Test
    void reducirStock_conStockCero_noDebeSerNegativo() {
        Libro sinStock = new Libro("Sin Stock", "Autor", 100, 0);

        sinStock.reducirStock();

        assertEquals(0, sinStock.getStock(),
                "El stock no debería ser negativo");
    }

    @Test
    void incrementarStock_aumentaStockEnUno() {
        libro.incrementarStock();

        assertEquals(4, libro.getStock(),
                "El stock debería incrementarse en 1");
    }
}