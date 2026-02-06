package edu.daniel.martinez.actividad2.v2.calculadora.process;

import edu.daniel.martinez.actividad2.v2.calculadora.operacion.Operacion;

/**
 * Este metodo recibe dos operandos enteros y devuelve su suma
 * @return la suma de a más b
 */

public class Suma extends Operacion {
    @Override
    public int apply (int a, int b) {
        return a+b;
    }
}