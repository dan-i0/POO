package edu.daniel.martinez.actividad3.process.listanumero;

import java.util.ArrayList;
import java.util.List;


/**
 * Esta clase reordena una lista de números enteros moviendo todos los ceros a la derecha
 * @return una nueva lista con los ceros ubicados a la derecha
 **/
public class CeroDerecha {

    public static List<Integer> ceroDerecha(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        int ceros = 0;

        for (int n : numeros) {
            if (n == 0) {
                ceros++;
            } else {
                resultado.add(n);
            }
        }

        for (int i = 0; i < ceros; i++) {
            resultado.add(0);
        }
        return resultado;
    }
}