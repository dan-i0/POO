package edu.daniel.martinez.actividad4.test;
import edu.daniel.martinez.actividad4.process.Configuracion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConfiguracionTest {
    @Test
    void debeGuardarIdiomaCorrectamente() {
        Configuracion config = new Configuracion("ES", true);
        assertEquals("ES", config.getIdioma());
    }

    @Test
    void debeGuardarModoContraCPUTrue() {
        Configuracion config = new Configuracion("ES", true);
        assertTrue(config.esContraCPU());
    }

    @Test
    void debeGuardarModoContraCPUFalse() {
        Configuracion config = new Configuracion("EN", false);
        assertFalse(config.esContraCPU());
    }

    @Test
    void debePermitirIdiomaIngles() {
        Configuracion config = new Configuracion("EN", true);
        assertEquals("EN", config.getIdioma());
    }

    @Test
    void debePermitirIdiomaEspanol() {
        Configuracion config = new Configuracion("ES", false);
        assertEquals("ES", config.getIdioma());
    }
}