package edu.daniel.martinez.proyecto.data;

import edu.daniel.martinez.proyecto.idioma.Idioma;

public class LibroVista {
    private Libro libro;
    private Idioma idioma;

    public LibroVista(Libro libro, Idioma idioma) {
        this.libro = libro;
        this.idioma = idioma;
    }

    public Libro getLibro() {
        return libro;
    }

    @Override
    public String toString() {
        return libro.mostrar(idioma);
    }
}