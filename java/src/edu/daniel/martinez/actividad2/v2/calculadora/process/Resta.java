package edu.daniel.martinez.actividad2.v2.calculadora.process;

import edu.daniel.martinez.actividad2.v2.calculadora.operacion.Operacion;

/**
 *  Este metodo recibe dos operandos enteros y devuelve su resta
 *  @return la resta de a entre b
 */

public class Resta extends Operacion {
    @Override
    public int apply (int a, int b) {
        return a-b;
    }
}