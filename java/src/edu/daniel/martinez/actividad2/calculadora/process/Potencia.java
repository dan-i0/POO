package edu.daniel.martinez.actividad2.calculadora.process;

/**
 *  Este metodo recibe un numerador y un exponente y devuelve su potencia
 *  @return la potencia de a
 * */

public class Potencia {
    public static int realizarOperacion(int base, int exponente){
        int resultado = 1;
        Multiplicación mult = new Multiplicación();

        for (int i = 0; i < exponente; i++){
            resultado = mult.realizarOperacion(resultado, base);
        }
        return resultado;
    }
}
