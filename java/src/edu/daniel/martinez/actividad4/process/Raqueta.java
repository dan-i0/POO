package edu.daniel.martinez.actividad4.process;

/**
 * Esta clase representa las 'barras' utilizadas por los jugadores.
 * Controla su posición vertical, dimensiones, velocidad y límites de movimiento dentro de la pantalla.
 */
public class Raqueta {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private int velocidad = 10;
    private int limiteArriba = 0;
    private int limiteAbajo = 400 - 60;

    public Raqueta(int x) {
        this.x = x;
        y = 150;
        ancho = 10;
        alto = 60;
    }

    public void subir() {
        y = y - velocidad;
        if (y < limiteArriba) {
            y = limiteArriba;
        }
    }

    public void bajar() {
        y = y + velocidad;
        if (y > limiteAbajo) {
            y = limiteAbajo;
        }
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getAncho() { return ancho; }
    public int getAlto() { return alto; }
}