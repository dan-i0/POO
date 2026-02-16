package edu.daniel.martinez.actividad4.process;

/**
 * Esta clase presenta el objeto principal de nuestro juego.
 * Esta se mueve por la pantalla y rebota contra paredes y raquetas.
 * Controla su posición, tamaño y dirección de movimiento.
 */
public class Pelota{

    private int x = 300;
    private int y = 200;
    private int tamano = 15;

    private int dx = 3;
    private int dy = 3;

    public void mover() {
        x += dx;
        y += dy;
    }
    public void rebotarHorizontal() {
        dx = -dx;
    }
    public void rebotarVertical() {
        dy = -dy;
    }
    public void reiniciar() {
        x = 300;
        y = 200;
        dx = -dx;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getTamano() { return tamano; }
}