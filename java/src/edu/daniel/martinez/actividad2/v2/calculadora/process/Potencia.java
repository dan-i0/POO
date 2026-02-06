package edu.daniel.martinez.actividad2.v2.calculadora.process;

/**
 *  Este metodo recibe un numerador y un exponente y devuelve su potencia
 *  @return la potencia de a
 */

public class Potencia extends Multiplicacion {
    @Override
    public int apply(int a, int b) {
        int potencia = 1;
        for (int i = 0; i<b; i++){
            potencia = super.apply(potencia, a);
        }
        return potencia;
    }
}