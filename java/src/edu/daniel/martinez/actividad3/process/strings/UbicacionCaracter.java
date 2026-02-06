package edu.daniel.martinez.actividad3.process.strings;

/**
 * Obtiene la primera posición en la que aparece un carácter dentro de una palabra
 * @return la posición del carácter si se encuentra en la palabra
 * @return -1 si el carácter no aparece en la palabra
 **/

public class UbicacionCaracter {
    public static int primerPosicion(String palabra, char caracter) {

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == caracter) {
                return i;
            }
        }
        return -1;
    }
}