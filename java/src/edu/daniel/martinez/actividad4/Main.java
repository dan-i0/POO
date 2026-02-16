package edu.daniel.martinez.actividad4;
import edu.daniel.martinez.actividad4.process.Configuracion;
import edu.daniel.martinez.actividad4.ui.GameUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] idiomas = {"Español", "English"};
        int selIdioma = JOptionPane.showOptionDialog(
                null,
                "Selecciona un idioma / Select a language",
                "Idioma",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                idiomas,
                idiomas[0]
        );

        String idioma = (selIdioma == 1) ? "EN" : "ES";

        String mensajeModo;
        String tituloModo;
        String[] modos;

        if (idioma.equals("EN")) {
            mensajeModo = "Please select a game mode";
            tituloModo = "Mode";
            modos = new String[]{"Multiplayer", "CPU"};
        } else {
            mensajeModo = "Por favor, selecciona un modo de juego";
            tituloModo = "Modo";
            modos = new String[]{"Multijugador", "CPU"};
        }
        int seleccionaModo = JOptionPane.showOptionDialog(
                null,
                mensajeModo,
                tituloModo,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                modos,
                modos[0]
        );

        boolean contraCPU = (seleccionaModo == 1);

        Configuracion config = new Configuracion(idioma, contraCPU);

        String mensaje;

        if (config.getIdioma().equals("EN")) {
            mensaje = "Controls:\n\n"
                    + "Player 1: W (Up) / S (Down)\n"
                    + "Player 2: ↑ (Up) / ↓ (Down)\n\n"
                    + "Press OK to start the game.";
        } else {
            mensaje = "Controles:\n\n"
                    + "Jugador 1: W (Subir) / S (Bajar)\n"
                    + "Jugador 2: ↑ (Subir) / ↓ (Bajar)\n\n"
                    + "Presiona OK para iniciar el juego.";
        }
        JOptionPane.showMessageDialog( null,
                mensaje,
                "Instructions / Instrucciones",
                JOptionPane.INFORMATION_MESSAGE
        );

        JFrame ventana = new JFrame("Ping Pong");
        ventana.setSize(600, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.add(new GameUI(config));
        ventana.setVisible(true);
    }
}