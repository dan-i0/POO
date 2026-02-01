package edu.daniel.martinez.actividad3.test;
import edu.daniel.martinez.actividad3.process.listanumero.NumeroPar;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class NumeroParTest {

    @Test
    public void testContarPares() {
        List<Integer> entrada = Arrays.asList(3, 4, 5, 7, 6);
        int esperado = 2;

        int resultado = NumeroPar.contarPares(entrada);

        assertEquals(esperado, resultado);
    }
}