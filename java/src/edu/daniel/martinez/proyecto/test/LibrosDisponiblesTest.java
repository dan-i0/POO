package edu.daniel.martinez.proyecto.test;

 import edu.daniel.martinez.proyecto.bd.LibrosDisponibles;
 import edu.daniel.martinez.proyecto.data.Libro;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.Test;

 import java.util.List;

 import static org.junit.jupiter.api.Assertions.*;

class LibrosDisponiblesTest {

    private LibrosDisponibles repositorio;

    @BeforeEach
    void setUp() {
        repositorio = new LibrosDisponibles();
    }

    @Test
    void constructor_debeInicializarListaDeLibros() {
        assertNotNull(repositorio.getLibros(),
                "La lista de libros no debería ser null");
    }

    @Test
    void constructor_debeCargarLibrosIniciales() {
        List<Libro> libros = repositorio.getLibros();
        assertFalse(libros.isEmpty(),
                "La lista de libros debería contener elementos");
    }

    @Test
    void constructor_debeCargarCantidadCorrectaDeLibros() {
        assertEquals(25, repositorio.getLibros().size(),
                "La cantidad inicial de libros no es la esperada");
    }

    @Test
    void agregarLibro_debeIncrementarLaLista() {
        int tamañoInicial = repositorio.getLibros().size();

        Libro nuevoLibro = new Libro(
                "Clean Code",
                "Robert C. Martin",
                350,
                5
        );

        repositorio.agregarLibro(nuevoLibro);

        assertEquals(tamañoInicial + 1, repositorio.getLibros().size());
    }

    @Test
    void agregarLibro_debeContenerElLibroAgregado() {
        Libro nuevoLibro = new Libro(
                "Clean Architecture",
                "Robert C. Martin",
                400,
                3
        );

        repositorio.agregarLibro(nuevoLibro);

        assertTrue(repositorio.getLibros().contains(nuevoLibro),
                "El libro agregado debería estar en la lista");
    }
}
