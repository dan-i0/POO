package edu.daniel.martinez.actividad3.process.listaempleado;

/**
 * Esta clase representa a los empleados dentro de una lista
 * Tiene información como nombre, edad, salario y departamento de cada empleado
 **/

public class Empleado {
    private String nombre;
    private int edad;
    private int salario;
    private String departamento;

    public Empleado(String nombre, int edad, int salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public int getSalario() { return salario; }
    public String getDepartamento() { return departamento; }
}