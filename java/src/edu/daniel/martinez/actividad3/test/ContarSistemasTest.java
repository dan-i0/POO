package edu.daniel.martinez.actividad3.test;

import edu.daniel.martinez.actividad3.process.listaempleado.Empleado;
import edu.daniel.martinez.actividad3.process.listaempleado.TodoEmpleado;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ContarSistemasTest {

    @Test
    public void testContarSistemas() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("André", 22, 20000, "ventas"),
                new Empleado("Marco", 35, 30000, "sistemas"),
                new Empleado("Marta", 35, 28000, "sistemas"),
                new Empleado("Pedro", 40, 15000, "administración")
        );
        int resultado = TodoEmpleado.contarSistemas(empleados);

        assertEquals(2, resultado);
    }
}