package edu.daniel.martinez.actividad3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.daniel.martinez.actividad3.process.strings.TotalVocales;
import org.junit.jupiter.api.Test;

public class TotalVocalesTest {

    @Test
    public void testContarVocales() {
        String entrada = "fuego";
        int esperado = 3;

        int resultado = TotalVocales.contarVocales(entrada);

        assertEquals(esperado, resultado);
    }
}