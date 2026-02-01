package edu.daniel.martinez.actividad3.process.strings;

/**
 * Esta clase invierte el orden de los caracteres de un texto
 * @return la cadena de texto invertida
 **/

public class Invertido{
    public static String invertir(String palabra) {
        String resultado = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            resultado = resultado + palabra.charAt(i);
        }
        return resultado;
    }
}