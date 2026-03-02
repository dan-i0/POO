package edu.daniel.martinez.proyecto.test;

import edu.daniel.martinez.proyecto.data.Libro;
import edu.daniel.martinez.proyecto.data.LibroVista;
import edu.daniel.martinez.proyecto.idioma.Idioma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroVistaTest {

    private Libro libro;
    private Idioma idioma;
    private LibroVista libroVista;

    @BeforeEach
    void setUp() {
        libro = new Libro("Java Básico", "Juan Pérez", 150.0, 3);
        libroVista = new LibroVista(libro, idioma);
    }

    @Test
    void constructor_guardaCorrectamenteElLibro() {
        assertEquals(libro, libroVista.getLibro(),
                "El libro devuelto debe ser el mismo que se pasó al constructor");
    }
}
