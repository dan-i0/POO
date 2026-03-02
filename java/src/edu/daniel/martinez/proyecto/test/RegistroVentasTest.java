package edu.daniel.martinez.proyecto.test;

import edu.daniel.martinez.proyecto.core.RegistroVentas;
import edu.daniel.martinez.proyecto.data.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroVentasTest {

    private RegistroVentas registro;
    private Libro libro1;
    private Libro libro2;

    @BeforeEach
    void setUp() {
        registro = new RegistroVentas();
        libro1 = new Libro("Java Básico", "Autor 1", 100, 1);
        libro2 = new Libro("POO en Java", "Autor 2", 200, 1);
    }

    @Test
    void registroDebeIniciarVacio() {
        assertTrue(registro.getVendidos().isEmpty(),
                "El registro de ventas debería iniciar vacío");
    }

    @Test
    void registrarVenta_agregaLibroAVendidos() {
        registro.registrarVenta(libro1);

        assertEquals(1, registro.getVendidos().size(),
                "Debería haber un libro vendido");
        assertTrue(registro.getVendidos().contains(libro1),
                "El libro vendido debería estar en la lista");
    }

    @Test
    void registrarVenta_permiteRegistrarMultiplesLibros() {
        registro.registrarVenta(libro1);
        registro.registrarVenta(libro2);

        assertEquals(2, registro.getVendidos().size(),
                "Deberían registrarse múltiples ventas");
    }
}