package edu.daniel.martinez.proyecto.test;

import edu.daniel.martinez.proyecto.data.Buscador;
import edu.daniel.martinez.proyecto.data.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BuscadorTest {

    private Buscador buscador;
    private List<Libro> libros;

    @BeforeEach
    void setUp() {
        buscador = new Buscador();

        libros = List.of(
                new Libro("Java Básico", "Juan Pérez", 100, 1),
                new Libro("POO en Java", "María López", 200, 1),
                new Libro("Algoritmos", "Robert Martin", 150, 1)
        );
    }

    // ---------- BÚSQUEDA POR TÍTULO ----------

    @Test
    void buscarLibroPorTitulo_encuentraLibroExistente() {
        Libro resultado = buscador.buscarLibroPorTitulo(
                "Java Básico", libros);

        assertNotNull(resultado);
        assertEquals("Java Básico", resultado.getTitulo());
    }

    @Test
    void buscarLibroPorTitulo_noDistingueMayusculasMinusculas() {
        Libro resultado = buscador.buscarLibroPorTitulo(
                "java básico", libros);

        assertNotNull(resultado);
    }

    @Test
    void buscarLibroPorTitulo_libroNoExiste_retornaNull() {
        Libro resultado = buscador.buscarLibroPorTitulo(
                "Libro Inexistente", libros);

        assertNull(resultado,
                "Si no se encuentra el libro, debe retornar null");
    }

    // ---------- BÚSQUEDA POR AUTOR ----------

    @Test
    void buscarLibroPorAutor_encuentraLibroExistente() {
        Libro resultado = buscador.buscarLibroPorAutor(
                "María López", libros);

        assertNotNull(resultado);
        assertEquals("POO en Java", resultado.getTitulo());
    }

    @Test
    void buscarLibroPorAutor_noDistingueMayusculasMinusculas() {
        Libro resultado = buscador.buscarLibroPorAutor(
                "robert martin", libros);

        assertNotNull(resultado);
    }

    @Test
    void buscarLibroPorAutor_autorNoExiste_retornaNull() {
        Libro resultado = buscador.buscarLibroPorAutor(
                "Autor Fantasma", libros);

        assertNull(resultado,
                "Si no se encuentra el autor, debe retornar null");
    }
}