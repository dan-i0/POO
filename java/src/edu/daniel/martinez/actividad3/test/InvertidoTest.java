package edu.daniel.martinez.actividad3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.daniel.martinez.actividad3.process.strings.Invertido;
import org.junit.jupiter.api.Test;

public class InvertidoTest {

    @Test
    public void testInvertido() {
        String entrada = "caramelo";
        String esperado = "olemarac";

        String resultado = Invertido.invertir(entrada);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testInvertidoConEspacios() {
        String entrada = "hola mundo";
        String esperado = "odnum aloh";

        String resultado = Invertido.invertir(entrada);

        assertEquals(esperado, resultado);
    }
}