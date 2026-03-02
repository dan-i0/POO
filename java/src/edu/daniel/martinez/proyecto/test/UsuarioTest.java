package edu.daniel.martinez.proyecto.test;

import edu.daniel.martinez.proyecto.data.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void constructorUsuario_guardaCorrectamenteElNombre() {
        Usuario usuario = new Usuario("Pedro");

        assertEquals("Pedro", usuario.getNombre(),
                "El nombre del usuario debería coincidir con el constructor");
    }

    @Test
    void estudiante_esInstanciaDeUsuario() {
        Usuario estudiante = new Usuario.Estudiante("Ana");

        assertTrue(estudiante instanceof Usuario,
                "Estudiante debería ser una instancia de Usuario");
        assertEquals("Ana", estudiante.getNombre());
    }

    @Test
    void maestro_esInstanciaDeUsuario() {
        Usuario maestro = new Usuario.Maestro("Carlos");

        assertTrue(maestro instanceof Usuario,
                "Maestro debería ser una instancia de Usuario");
        assertEquals("Carlos", maestro.getNombre());
    }

    @Test
    void cliente_esInstanciaDeUsuario() {
        Usuario cliente = new Usuario.Cliente("Laura");

        assertTrue(cliente instanceof Usuario,
                "Cliente debería ser una instancia de Usuario");
        assertEquals("Laura", cliente.getNombre());
    }
}