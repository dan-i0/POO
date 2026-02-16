package edu.daniel.martinez.actividad4.process;

/**
 * Esta clase gestiona los efectos de audio de nuestro juego.
 * Utiliza el sistema MIDI de Java.
 * Produce sonidos diferentes para:
 * Rebotes
 * Puntos anotados
 */
import javax.sound.midi.*;

public class Sonido {

    private static Synthesizer sintetizador;
    private static MidiChannel canal;

    static {
        try {
            sintetizador = MidiSystem.getSynthesizer();
            sintetizador.open();
            canal = sintetizador.getChannels()[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void rebote() {
        new Thread(() -> {
            canal.programChange(80);
            canal.noteOn(90, 100);
            try { Thread.sleep(80); } catch (Exception ignored) {}
            canal.noteOff(90);
        }).start();
    }

    public static void punto() {
        new Thread(() -> {
            canal.programChange(56);
            canal.noteOn(60, 120);
            try { Thread.sleep(200); } catch (Exception ignored) {}
            canal.noteOff(60);
        }).start();
    }
}