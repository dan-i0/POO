package edu.daniel.martinez.actividad3.process.listaempleado;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase TodoEmpleado es usada para diferentes operaciones y cálculos sobre una lista de empleados
 **/
public class TodoEmpleado {
    /**
     * Devuelve el empleado con el salario más alto
     * @param empleados lista de empleados
     * @return el empleado con mayor salario
     **/
    public static Empleado mayorSalario(List<Empleado> empleados) {
        Empleado mayor = empleados.get(0);
        for (Empleado s : empleados) {
            if (s.getSalario() > mayor.getSalario()) {
                mayor = s;
            }
        }
        return mayor;
    }

    /**
     * Calcula la edad más común de los empleados.
     * @param empleados lista de empleados
     * @return la edad que más se repite
     **/
    public static int edadMasComun(List<Empleado> empleados) {
        int[] conteo = new int[100];

        for (Empleado e : empleados) {
            conteo[e.getEdad()]++;
        }

        int edadComun = 0;
        int max = 0;
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > max) {
                max = conteo[i];
                edadComun = i;
            }
        }
        return edadComun;
    }

    /**
     * Calcula el promedio de edad de los empleados.
     * @param empleados lista de empleados
     * @return promedio de edad de los empleados
     **/
    public static short promedioEdad(List<Empleado> empleados) {
        short suma = 0;
        for (Empleado e : empleados) {
            suma += e.getEdad();
        }
        return (short) (suma / empleados.size());
    }

    /**
     * Calcula el promedio de salario de los empleados.
     * @param empleados lista de empleados
     * @return promedio de salario de los empleados
     **/
    public static int promedioSalario(List<Empleado> empleados) {
        int suma = 0;
        for (Empleado e : empleados) {
            suma += e.getSalario();
        }
        return suma / empleados.size();
    }

    /**
     * Calcula el promedio de edad de los empleados cuyo salario sea mayor a 25,000
     * @param empleados lista de empleados
     * @return promedio de edad de los empleados con salario mayor a 25,000
     **/
    public static int promedioEdadMayorAVeinticincoMil(List<Empleado> empleados) {
        int suma = 0;
        int contador = 0;

        for (Empleado e : empleados) {
            if (e.getSalario() > 25000) {
                suma += e.getEdad();
                contador++;
            }
        }
        return suma / contador;
    }

    /**
     * Dice que empleados son menores a 25 años
     * @param empleados lista de empleados
     * @return lista de empleados con edad menor a 25
     **/
    public static List<Empleado> menoresDeVeinticinco(List<Empleado> empleados) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado e : empleados) {
            if (e.getEdad() < 25) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    /**
     * Cuenta cuantos empleados son del departamento de sistemas
     * @param empleados lista de empleados
     * @return número de empleados del departamento de sistemas
     **/
    public static int contarSistemas(List<Empleado> empleados) {

        int contador = 0;

        for (int i = 0; i < empleados.size(); i++) {

            Empleado empleado = empleados.get(i);

            if (empleado.getDepartamento().equals("sistemas")) {
                contador = contador + 1;
            }
        }
        return contador;
    }

    /**
     * Obtiene el empleado mayor de 30 años con el salario más alto.
     * @param empleados lista de empleados
     * @return el empleado con mayor salario y edad mayor a 30
     **/
    public static Empleado mayorSalarioMayorATreintaTest(List<Empleado> empleados) {
        Empleado mayor = empleados.get(0);

        for (Empleado e : empleados) {
            if (e.getEdad() > 30) {
                mayor = e;
                break;
            }
        }
        for (Empleado e : empleados) {
            if (e.getEdad() > 30) {
                if (e.getSalario() > mayor.getSalario()) {
                    mayor = e;
                }
            }
        }
        return mayor;
    }

    /**
     * Obtiene el empleado con la menor edad y salario
     * @param empleados lista de empleados
     * @return el empleado con menor edad y menor salario
     **/
    public static Empleado menorSalarioEdadMinima(List<Empleado> empleados) {
        Empleado menor = empleados.get(0);

        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            if (empleado.getEdad() < menor.getEdad()) {
                menor = empleado;
            }
            if (empleado.getEdad() == menor.getEdad()) {
                if (empleado.getSalario() < menor.getSalario()) {
                    menor = empleado;
                }
            }
        }
        return menor;
    }
}