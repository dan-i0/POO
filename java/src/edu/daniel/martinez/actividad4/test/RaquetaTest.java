package edu.daniel.martinez.actividad4.test;
import edu.daniel.martinez.actividad4.process.Raqueta;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RaquetaTest {
    private Raqueta raqueta;

    @BeforeEach
    void setUp() {
        raqueta = new Raqueta(10);
    }

    @Test
    void posicionInicialCorrecta() {
        assertEquals(10, raqueta.getX());
        assertEquals(150, raqueta.getY());
    }

    @Test
    void dimensionesCorrectas() {
        assertEquals(10, raqueta.getAncho());
        assertEquals(60, raqueta.getAlto());
    }

    @Test
    void subirDebeReducirY() {
        int yInicial = raqueta.getY();
        raqueta.subir();
        assertEquals(yInicial - 10, raqueta.getY());
    }

    @Test
    void bajarDebeAumentarY() {
        int yInicial = raqueta.getY();
        raqueta.bajar();
        assertEquals(yInicial + 10, raqueta.getY());
    }

    @Test
    void noDebeSubirMasAllaDelLimiteSuperior() {
        for (int i = 0; i < 30; i++) {
            raqueta.subir();
        }

        assertEquals(0, raqueta.getY());
    }

    @Test
    void subirEnLimiteSuperiorSeMantieneEnCero() {
        for (int i = 0; i < 30; i++) {
            raqueta.subir();
        }

        int yAntes = raqueta.getY();
        raqueta.subir();

        assertEquals(yAntes, raqueta.getY());
    }

    @Test
    void noDebeBajarMasAllaDelLimiteInferior() {
        for (int i = 0; i < 50; i++) {
            raqueta.bajar();
        }

        assertEquals(340, raqueta.getY());
    }

    @Test
    void bajarEnLimiteInferiorSeMantieneEnLimite() {
        for (int i = 0; i < 50; i++) {
            raqueta.bajar();
        }

        int yAntes = raqueta.getY();
        raqueta.bajar();

        assertEquals(yAntes, raqueta.getY());
    }
}