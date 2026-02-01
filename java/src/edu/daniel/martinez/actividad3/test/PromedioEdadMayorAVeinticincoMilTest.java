package edu.daniel.martinez.actividad3.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

import edu.daniel.martinez.actividad3.process.listaempleado.Empleado;
import edu.daniel.martinez.actividad3.process.listaempleado.TodoEmpleado;
import org.junit.jupiter.api.Test;

public class PromedioEdadMayorAVeinticincoMilTest {

    @Test
    public void testPromedioEdadMayorAVeinticincoMil() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("André", 22, 20000, "ventas"),
                new Empleado("Marco", 35, 30000, "sistemas"),
                new Empleado("Marta", 35, 28000, "sistemas"),
                new Empleado("Pedro", 40, 15000, "administración")
        );
        int resultado = (int) TodoEmpleado.promedioEdadMayorAVeinticincoMil(empleados);
        assertEquals(35, resultado);
    }
}