package edu.daniel.martinez.actividad2.calculadora.process;

/**
 *  Este metodo recibe dos operandos enteros y devuelve su multiplicación
 *  @return la multiplicación de a y b
 *  @param a primer operando
 *  @param b segundo operando
 * */

public class Multiplicacion {
    public static int realizarOperacion(int a, int b){
        int resultado = 0;
        Suma suma = new Suma();

        for (int i = 0; i < b; i++){
            resultado = suma.realizarOperacion (resultado, a);
        }
        return resultado;
    }
}
