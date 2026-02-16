package edu.daniel.martinez.actividad4.process;

/**
 * Esta clase gestiona la lógica principal del juego.
 * Se encarga de:
 * Actualizar el movimiento de la pelota.
 * Detectar colisiones de las raquetas.
 * Controlar los rebotes.
 * Administrar el puntaje.
 * Anunciar el ganador.
 * Controlar el movimiento que tiene la CPU.
 */
public class GameProcess {
    private Pelota pelota;
    private Raqueta jugador1;
    private Raqueta jugador2;
    private int puntos1;
    private int puntos2;
    private boolean contraCPU;

    private int ANCHO_PANTALLA = 600;
    private int ALTO_PANTALLA = 370;

    public GameProcess(boolean contraCPU) {
        this.contraCPU = contraCPU;

        pelota = new Pelota();

        // Posiciones de los raquetas
        jugador1 = new Raqueta(10);
        jugador2 = new Raqueta(560);

        puntos1 = 0;
        puntos2 = 0;
    }

    public void actualizar() {
        pelota.mover();

        // Rebote de arriba hacia abajo
        if (pelota.getY() <= 0) {
            pelota.rebotarVertical();
            Sonido.rebote();
        }

        if (pelota.getY() >= ALTO_PANTALLA - pelota.getTamano()) {
            pelota.setY(ALTO_PANTALLA - pelota.getTamano());
            pelota.rebotarVertical();
            Sonido.rebote();
        }

        // Colisión del jugador 1
        if (pelota.getX() <= jugador1.getX() + jugador1.getAncho()) {
            if (pelota.getY() >= jugador1.getY() &&
                    pelota.getY() <= jugador1.getY() + jugador1.getAlto()) {
                pelota.rebotarHorizontal();
                Sonido.rebote();
            }
        }

        // Colisión del jugador 2
        if (pelota.getX() + pelota.getTamano() >= jugador2.getX()) {
            if (pelota.getY() >= jugador2.getY() &&
                    pelota.getY() <= jugador2.getY() + jugador2.getAlto()) {
                pelota.rebotarHorizontal();
                Sonido.rebote();
            }
        }

        // Puntos del jugador 2
        if (pelota.getX() <= 0) {
            puntos2++;
            Sonido.punto();
            pelota.reiniciar();
        }

        // Puntos del jugador 1
        if (pelota.getX() >= ANCHO_PANTALLA - pelota.getTamano()) {
            puntos1++;
            Sonido.punto();
            pelota.reiniciar();
        }

        // Movimiento de la CPU
        if (contraCPU) {
            int margen = 7;
            if (pelota.getY() + margen < jugador2.getY()) {
                jugador2.subir();
            }
            else if (pelota.getY() > jugador2.getY() + jugador2.getAlto() - margen) {
                jugador2.bajar();
            }
        }
    }

    public int obtenerGanador() {
        if (puntos1 >= 10) return 1;
        if (puntos2 >= 10) return 2;
        return 0;
    }

    public void reiniciarJuego() {
        puntos1 = 0;
        puntos2 = 0;
        pelota.reiniciar();
    }

    public Pelota getPelota() { return pelota; }
    public Raqueta getJugador1() { return jugador1; }
    public Raqueta getJugador2() { return jugador2; }

    public int getPuntos1() { return puntos1; }
    public int getPuntos2() { return puntos2; }
}