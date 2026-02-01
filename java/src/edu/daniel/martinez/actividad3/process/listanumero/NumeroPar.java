package edu.daniel.martinez.actividad3.process.listanumero;

import java.util.List;

/**
 * Esta clase cuenta la cantidad de números pares en una lista de enteros.
 * @return cantidad de números pares de una lista
 **/

public class NumeroPar {
    public static int contarPares(List<Integer> numeros) {
        int contador = 0;

        for (int n : numeros) {
            if (n % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}