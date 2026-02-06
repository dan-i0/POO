package edu.daniel.martinez.actividad2.v2.calculadora.process;

/**
 *  Este metodo recibe dos operandos enteros y devuelve su modulo
 *  @return el modulo de a entre b
 */

public class Modulo extends Resta{
    @Override
    public int apply(int a, int b) {
        while (a >= b) {
            a = super.apply(a, b);
        }
        return a;
    }
}