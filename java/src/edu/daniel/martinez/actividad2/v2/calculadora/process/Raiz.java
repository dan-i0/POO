package edu.daniel.martinez.actividad2.v2.calculadora.process;

/**
 *  Este metodo recibe dos operandos enteros y devuelve su raiz
 *  @return la raiz de a
 */

public class Raiz extends Potencia{
    @Override
    public int apply(int a, int b) {
        int resultado = 0;
        int i = 1;
        while (true) {
            int potencia = super.apply(i, b);
            if (potencia == a) {
                resultado = i;
                break;
            }
            if (potencia > a) {
                break;
            }
            i++;
        }
        return resultado;
    }
}