package edu.daniel.martinez.actividad4.test;
import edu.daniel.martinez.actividad4.process.Pelota;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PelotaTest {
    private Pelota pelota;

    @BeforeEach
    void setUp() {
        pelota = new Pelota();
    }

    @Test
    void moverDebeCambiarX() {
        int xInicial = pelota.getX();
        pelota.mover();
        assertNotEquals(xInicial, pelota.getX());
    }

    @Test
    void moverDebeCambiarY() {
        int yInicial = pelota.getY();
        pelota.mover();
        assertNotEquals(yInicial, pelota.getY());
    }

    @Test
    void rebotarHorizontalDebeInvertirDireccion() {
        pelota.mover();
        int xAntes = pelota.getX();
        pelota.rebotarHorizontal();
        pelota.mover();
        assertTrue(pelota.getX() < xAntes);
    }

    @Test
    void rebotarVerticalDebeInvertirDireccion() {
        pelota.mover();
        int yAntes = pelota.getY();
        pelota.rebotarVertical();
        pelota.mover();
        assertTrue(pelota.getY() < yAntes);
    }

    @Test
    void reiniciarDebeVolverAlCentro() {
        pelota.mover();
        pelota.reiniciar();

        assertEquals(300, pelota.getX());
        assertEquals(200, pelota.getY());
    }

    @Test
    void reiniciarDebeCambiarDireccionHorizontal() {
        pelota.mover();
        int xAntes = pelota.getX();

        pelota.reiniciar();
        pelota.mover();

        assertNotEquals(xAntes + 3, pelota.getX());
    }
}