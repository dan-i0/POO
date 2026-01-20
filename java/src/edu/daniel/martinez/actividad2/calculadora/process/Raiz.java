package edu.daniel.martinez.actividad2.calculadora.process;

/**
 *  Este metodo recibe un numero entero positivo y devuelve su raiz
 * */

public class Raiz {
    public static int realizarOperacion(int numero){
        int i = 1;
        Multiplicación mult = new Multiplicación();

        while (mult.realizarOperacion(i, i) <= numero){
            i++;
        }
        return i - 1;
    }
}
