package edu.daniel.martinez.actividad2.v2.calculadora.process;

/**
 *  Este metodo recibe dos operandos enteros y devuelve su multiplicación
 *  @return la multiplicación de a entre b
 */

public class Multiplicacion extends Suma {
    @Override
    public int apply(int a, int b){
        int producto = 0;
        for(int i = 0; i<b; i++){
            producto = super.apply(producto, a);
        }
        return producto;
    }
}