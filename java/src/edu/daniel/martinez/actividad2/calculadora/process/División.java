package edu.daniel.martinez.actividad2.calculadora.process;

/**
 *  Este metodo recibe dos operandos enteros y devuelve su división
 *  @return la división de a y b
 *  @param a primer operando
 *  @param b segundo operando
 * */

public class Division {
    public static int realizarOperacion(int a, int b){
        int contador = 0;
        Resta resta = new Resta();

        while (a >= b){
            a = resta.realizarOperacion(a, b);
            contador++;
        }
        return contador;
    }
}
