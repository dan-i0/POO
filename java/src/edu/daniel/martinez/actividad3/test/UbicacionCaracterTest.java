package edu.daniel.martinez.actividad3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.daniel.martinez.actividad3.process.strings.UbicacionCaracter;
import org.junit.jupiter.api.Test;

public class UbicacionCaracterTest {

    @Test
    public void testCaracterEncontrado() {
        String texto = "marea";
        char caracter = 'a';
        int esperado = 1;

        int resultado = UbicacionCaracter.primerPosicion(texto, caracter);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testCaracterNoEncontrado() {
        String texto = "correa";
        char caracter = 's';
        int esperado = -1;

        int resultado = UbicacionCaracter.primerPosicion(texto, caracter);

        assertEquals(esperado, resultado);
    }
}