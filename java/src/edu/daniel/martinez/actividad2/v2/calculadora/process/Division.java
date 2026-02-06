package edu.daniel.martinez.actividad2.v2.calculadora.process;

/**
 *
 * @return la division de a entre b
 */

public class Division extends Resta {
    @Override
    public int apply(int a, int b) {
        int cociente = 0;
        while (a >= b) {
            a = super.apply(a, b);
            cociente++;
        }
        return cociente;
    }
}