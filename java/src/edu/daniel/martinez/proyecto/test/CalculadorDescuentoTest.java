package edu.daniel.martinez.proyecto.test;

import edu.daniel.martinez.proyecto.calcular.CalculadorDescuento;
import edu.daniel.martinez.proyecto.data.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadorDescuentoTest {

    private CalculadorDescuento calculador;

    @BeforeEach
    void setUp() {
        calculador = new CalculadorDescuento();
    }

    @Test
    void debeAplicarDescuentoDeEstudiante() {
        Usuario estudiante = new Usuario.Estudiante("Ana");

        double descuento = calculador.calcularDescuento(estudiante);

        assertEquals(0.10, descuento);
    }

    @Test
    void debeAplicarDescuentoDeMaestro() {
        Usuario maestro = new Usuario.Maestro("Carlos");

        double descuento = calculador.calcularDescuento(maestro);

        assertEquals(0.15, descuento);
    }

    @Test
    void debeAplicarCeroDescuentoParaOtrosUsuarios() {
        Usuario usuarioGenerico = new Usuario("Pedro");

        double descuento = calculador.calcularDescuento(usuarioGenerico);

        assertEquals(0.0, descuento);
    }
}