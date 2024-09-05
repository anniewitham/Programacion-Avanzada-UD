package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlCambiarSituacionTest {
    
    private ControlPrincipal controlPrincipal;
    private ControlCambiarSituacion controlCambiarSituacion;

    @BeforeEach
    public void setUp() {
        controlPrincipal = new ControlPrincipal();
        controlPrincipal.personas = new ArrayList<>();
        controlCambiarSituacion = new ControlCambiarSituacion(controlPrincipal);
    }

    @AfterEach
    public void tearDown() {
        controlPrincipal = null;
        controlCambiarSituacion = null;
    }

    @Test
    public void testCrearVistaCambiarSituacion() {
        controlCambiarSituacion.crearVistaCambiarSituacion();
        assertNotNull(controlCambiarSituacion.vistaCambiarSituacion);
        assertEquals(1, controlCambiarSituacion.c);
    }

    @Test
    public void testCrearVistaMenuCambiarSituacion() {
        Persona persona = new Persona("John", "Doe", "123") {};
        controlPrincipal.personas.add(persona);
        controlCambiarSituacion.crearVistaMenuCambiarSituacion("123");
        assertNotNull(controlCambiarSituacion.vistaMenuCambiarSituacion);
        assertEquals(persona, controlCambiarSituacion.personaCambiar);
        assertEquals(2, controlCambiarSituacion.c);
    }

    @Test
    public void testCrearVistaInsertarRemiso() {
        Persona persona = new Persona("Jane", "Doe", "456") {};
        controlCambiarSituacion.crearVistaInsertarRemiso(persona);
        assertNotNull(controlCambiarSituacion.vistaInsertarRemiso);
        assertEquals(3, controlCambiarSituacion.c);
    }

    @Test
    public void testCrearVistaInsertarRecluta() {
        Persona persona = new Persona("Jane", "Doe", "456") {};
        controlCambiarSituacion.crearVistaInsertarRecluta(persona);
        assertNotNull(controlCambiarSituacion.vistaInsertarRecluta);
        assertEquals(4, controlCambiarSituacion.c);
    }

    @Test
    public void testCrearVistaInsertarReservista() {
        Persona persona = new Persona("Jane", "Doe", "456") {};
        controlCambiarSituacion.crearVistaInsertarReservista(persona);
        assertNotNull(controlCambiarSituacion.vistaInsertarReservista);
        assertEquals(5, controlCambiarSituacion.c);
    }

    @Test
    public void testCambiarSituacion() {
        Persona persona = new Persona("Jane", "Doe", "789") {};
        controlCambiarSituacion.personaCambiar = persona;

        controlCambiarSituacion.cambiarSituacion(1);
        assertNotNull(controlCambiarSituacion.vistaInsertarRemiso);

        controlCambiarSituacion.cambiarSituacion(2);
        assertNotNull(controlCambiarSituacion.vistaInsertarRecluta);

        controlCambiarSituacion.cambiarSituacion(3);
        assertNotNull(controlCambiarSituacion.vistaInsertarReservista);
    }
}

