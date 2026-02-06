package edu.daniel.martinez.actividad3.test;

import edu.daniel.martinez.actividad3.process.listaempleado.Empleado;
import edu.daniel.martinez.actividad3.process.listaempleado.TodoEmpleado;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MenoresDeVeinticincoTest {

    @Test
    public void testMenoresDeVeinticinco() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("André", 22, 20000, "ventas"),
                new Empleado("Marco", 35, 30000, "sistemas"),
                new Empleado("Marta", 35, 28000, "sistemas"),
                new Empleado("Pedro", 40, 15000, "administración")
        );
        List<Empleado> resultado = TodoEmpleado.menoresDeVeinticinco(empleados);

        assertEquals(1, resultado.size());
        assertEquals("André", resultado.get(0).getNombre());
    }
}