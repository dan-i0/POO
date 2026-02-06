package edu.daniel.martinez.actividad3.test;
import edu.daniel.martinez.actividad3.process.strings.Palindromo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void testEsPalindromoTrue() {
        String entrada = "radar";
        boolean resultado = Palindromo.esPalindromo(entrada);
        assertTrue(resultado);
    }

    @Test
    public void testEsPalindromoFalse() {
        String entrada = "Mamá";
        boolean resultado = Palindromo.esPalindromo(entrada);
        assertFalse(resultado);
    }
}