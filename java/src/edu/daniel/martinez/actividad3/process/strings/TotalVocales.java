package edu.daniel.martinez.actividad3.process.strings;

import java.util.ArrayList;

/**
 * Esta clase cuenta el número de vocales seam mayúsculas o minúsculas de una palabra
 * @return cantidad total de vocales encontradas en la palabra
 **/

public class TotalVocales {

    public static int contarVocales(String palabra) {
        ArrayList<Character> vocales = new ArrayList<>();

        vocales.add('a');
        vocales.add('e');
        vocales.add('i');
        vocales.add('o');
        vocales.add('u');
        vocales.add('A');
        vocales.add('E');
        vocales.add('I');
        vocales.add('O');
        vocales.add('U');

        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (vocales.contains(palabra.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
}
