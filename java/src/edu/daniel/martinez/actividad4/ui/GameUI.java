package edu.daniel.martinez.actividad4.ui;
import edu.daniel.martinez.actividad4.process.GameProcess;
import edu.daniel.martinez.actividad4.process.Configuracion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameUI extends JPanel implements ActionListener, KeyListener {
    private GameProcess juego;
    private Timer timer;
    private Configuracion config;
    private boolean wPresionado = false;
    private boolean sPresionado = false;
    private boolean upPresionado = false;
    private boolean downPresionado = false;

    public GameUI(Configuracion config) {
        this.config = config;

        juego = new GameProcess(config.esContraCPU());

        timer = new Timer(10, this);
        timer.start();

        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Movimientos del jugador 1
        if (wPresionado) {
            juego.getJugador1().subir();
        }
        if (sPresionado) {
            juego.getJugador1().bajar();
        }

        // Movimientos del jugador 2
        if (!config.esContraCPU()) {
            if (upPresionado) {
                juego.getJugador2().subir();
            }
            if (downPresionado) {
                juego.getJugador2().bajar();
            }
        }

        juego.actualizar();

        int ganador = juego.obtenerGanador();

        if (ganador != 0) {
            timer.stop();

            String mensaje;

            if (config.getIdioma().equals("EN")) {
                mensaje = "Player " + ganador + " you're winner!\nDo you want to play again?";
            } else {
                mensaje = "¡Jugador " + ganador + " eres el ganador!\n¿Quieres jugar de nuevo?";
            }
            Object[] opciones;

            if (config.getIdioma().equals("EN")) {
                opciones = new Object[]{"Yes", "No"};
            } else {
                opciones = new Object[]{"Sí", "No"};
            }

            int opcion = JOptionPane.showOptionDialog(
                    this,
                    mensaje,
                    "Fin del juego",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (opcion == JOptionPane.YES_OPTION) {
                juego.reiniciarJuego();
                timer.start();
            } else {
                System.exit(0);
            }
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 600, 400);

        g.setColor(Color.WHITE);

        // Pelota
        g.fillOval(
                juego.getPelota().getX(),
                juego.getPelota().getY(),
                juego.getPelota().getTamano(),
                juego.getPelota().getTamano()
        );

        // Jugador 1
        g.fillRect(
                juego.getJugador1().getX(),
                juego.getJugador1().getY(),
                juego.getJugador1().getAncho(),
                juego.getJugador1().getAlto()
        );

        // Jugador 2
        g.fillRect(
                juego.getJugador2().getX(),
                juego.getJugador2().getY(),
                juego.getJugador2().getAncho(),
                juego.getJugador2().getAlto()
        );

        // Puntos individuales de los jugadores
        if (config.getIdioma().equals("EN")) {
            g.drawString("Player 1: " + juego.getPuntos1(), 50, 20);
            g.drawString("Player 2: " + juego.getPuntos2(), 450, 20);
        } else {
            g.drawString("Jugador 1: " + juego.getPuntos1(), 50, 20);
            g.drawString("Jugador 2: " + juego.getPuntos2(), 450, 20);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Jugador 1
        if (e.getKeyCode() == KeyEvent.VK_W) {
            wPresionado = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            sPresionado = true;
        }

        if (!config.esContraCPU()) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upPresionado = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downPresionado = true;
        }
    }
}

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            wPresionado = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            sPresionado = false;
        }

        if (!config.esContraCPU()) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                upPresionado = false;
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                downPresionado = false;
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}