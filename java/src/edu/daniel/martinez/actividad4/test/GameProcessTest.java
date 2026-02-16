package edu.daniel.martinez.actividad4.test;
import edu.daniel.martinez.actividad4.process.GameProcess;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameProcessTest {

    private GameProcess juego;

    @BeforeEach
    void setUp() {
        juego = new GameProcess(false);
    }

    @Test
    void puntosInicianEnCero() {
        assertEquals(0, juego.getPuntos1());
        assertEquals(0, juego.getPuntos2());
    }

    @Test
    void pelotaDebeInicializarse() {
        assertNotNull(juego.getPelota());
    }

    @Test
    void raquetasDebenInicializarse() {
        assertNotNull(juego.getJugador1());
        assertNotNull(juego.getJugador2());
    }

    @Test
    void actualizarNoDebeRomperElJuego() {
        assertDoesNotThrow(() -> juego.actualizar());
    }

    @Test
    void multiplesActualizacionesNoGeneranErrores() {
        assertDoesNotThrow(() -> {
            for (int i = 0; i < 100; i++) {
                juego.actualizar();
            }
        });
    }

    @Test
    void nadieGanaAlInicio() {
        assertEquals(0, juego.obtenerGanador());
    }

    @Test
    void reiniciarJuegoPonePuntosEnCero() {
        juego.reiniciarJuego();
        assertEquals(0, juego.getPuntos1());
        assertEquals(0, juego.getPuntos2());
    }

    @Test
    void crearJuegoConCPUNoDebeRomperActualizacion() {
        GameProcess juegoCPU = new GameProcess(true);
        assertDoesNotThrow(() -> juegoCPU.actualizar());
    }
}