package edu.daniel.martinez.actividad2.calculadora.process;

/**
 *  Este metodo recibe dos operandos enteros y devuelve el logaritmo de a
 *  @return el logaritmo de a
 * */

public class Logaritmo {
    public static int realizarOperacion(int numero){
        int contador = 0;
        Division div = new Division();

        while (numero > 1){
            numero = div.realizarOperacion(numero, 2);
            contador ++;
        }
        return contador;
    }
}
