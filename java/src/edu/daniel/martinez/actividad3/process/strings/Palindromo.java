package edu.daniel.martinez.actividad3.process.strings;

/**
 * Esta clase verifica si una cadena de texto es un palíndromo
 * @return true si la cadena es un palíndromo
 * @return false si no es palindromo
 **/

public class Palindromo {
    public static boolean esPalindromo(String palabra){
        int izquierda = 0;
        int derecha = palabra.length() -1;

        while (izquierda < derecha){
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)){
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}