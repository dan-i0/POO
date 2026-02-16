package edu.daniel.martinez.actividad4.test;
import edu.daniel.martinez.actividad4.process.Sonido;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SonidoTest {
    @Test
    void reboteNoDebeLanzarExcepcion() {
        assertDoesNotThrow(() -> Sonido.rebote());
    }

    @Test
    void puntoNoDebeLanzarExcepcion() {
        assertDoesNotThrow(() -> Sonido.punto());
    }
}