package edu.daniel.martinez.actividad3.test;

import edu.daniel.martinez.actividad3.process.listanumero.CeroDerecha;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CeroDerechaTest {

    @Test
    public void testMoverCerosADerecha() {
        List<Integer> entrada = Arrays.asList(0, 2, 1, 4, 0, 2);
        List<Integer> esperado = Arrays.asList(2, 1, 4, 2, 0, 0);

        List<Integer> resultado = CeroDerecha.ceroDerecha(entrada);

        assertEquals(esperado, resultado);
    }
}