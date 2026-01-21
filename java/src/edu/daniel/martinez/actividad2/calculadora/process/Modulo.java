package edu.daniel.martinez.actividad2.calculadora.process;

/**
 *  Este metodo recibe dos operandos enteros y devuelve su modulo
 *  @return el modulo de a entre b
 * */

public class Modulo {
    public static int realizarOperacion(int a, int b){
        Resta resta = new Resta();
        
        while (a >= b){
            a = resta.realizarOperacion (a, b);
        }
        return a;
    }
}
