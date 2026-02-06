package edu.daniel.martinez.actividad3.test;

import java.util.Arrays;
import java.util.List;

import edu.daniel.martinez.actividad3.process.listaempleado.Empleado;
import edu.daniel.martinez.actividad3.process.listaempleado.TodoEmpleado;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PromedioSalarioTest {
    @Test
    public void testPromedioSalario() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("André", 22, 20000, "ventas"),
                new Empleado("Marco", 35, 30000, "sistemas"),
                new Empleado("Marta", 35, 28000, "sistemas"),
                new Empleado("Pedro", 40, 15000, "administración")
        );
        int resultado = TodoEmpleado.promedioSalario(empleados);
        assertEquals(23250, resultado);

    }
}