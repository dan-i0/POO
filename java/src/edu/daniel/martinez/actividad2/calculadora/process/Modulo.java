package edu.daniel.martinez.actividad2.calculadora.process;

/**
 *  Este metodo recibe dos operandos enteros y devuelve su modulo
 *  @return el modulo de a entre b
 * */

public class Modulo {
    public static int realizarOperacion(int a, int b){
        while (a >= b){
            a = a - b;
        }
        return a;
    }
}
