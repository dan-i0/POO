package edu.daniel.martinez.actividad2.v2.calculadora.process;

/**
 *  Este metodo recibe dos operandos enteros y devuelve el logaritmo de a
 *  @return el logaritmo de a
 */

public class Logaritmo extends Division{
    @Override
    public int apply(int a, int b) {
        int resultado = 0;
        while (a > 1) {
            if (a < b) {
                break;
            }
            a = super.apply(a, b);
            resultado++;
        }
        return resultado;
    }
}