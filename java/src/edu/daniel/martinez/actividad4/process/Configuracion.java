package edu.daniel.martinez.actividad4.process;

/**
 * Esta clase almacena los parámetros iniciales del juego, siendo el idioma seleccionado y el modo de juego (CPU o multijugador).
 * Permite que otras clases accedan a la configuración elegida por el usuario.
 */
public class Configuracion {
    private String idioma;
    private boolean contraCPU;

    public Configuracion(String idioma, boolean contraCPU) {
        this.idioma = idioma;
        this.contraCPU = contraCPU;
    }

    public String getIdioma() {
        return idioma;
    }

    public boolean esContraCPU() {
        return contraCPU;
    }
}