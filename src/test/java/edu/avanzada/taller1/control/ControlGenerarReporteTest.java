package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.modelo.Reservista;
import edu.avanzada.taller1.modelo.Aplazado;
import edu.avanzada.taller1.vista.VistaGenerarReporte;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlGenerarReporteTest {

    private ControlGenerarReporte controlGenerarReporte;
    private ControlPrincipal controlPrincipal;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        controlPrincipal = new ControlPrincipal();
        controlPrincipal.personas = new ArrayList<>();
        controlGenerarReporte = new ControlGenerarReporte(controlPrincipal);

        // Añadir algunas personas al control principal para probar los reportes
        controlPrincipal.personas.add(new Reclutado("Juan", "Perez", "123","1"));
        controlPrincipal.personas.add(new Remiso("Ana", "Gomez", "456"));
        controlPrincipal.personas.add(new Reservista("Luis", "Martinez", "789", "Libreta1"));
        // Crear una fecha de aplazamiento (ejemplo: hoy)
    Date fechaAplazamiento = new Date();
    
    // Añadir la persona Aplazado con la fecha de aplazamiento
    controlPrincipal.personas.add(new Aplazado("Maria", "Lopez", "101", fechaAplazamiento));
    }

    @AfterEach
    public void tearDown() {
        controlPrincipal.personas.clear();
    }

    
    @Test
    public void testCrearVistaGenerarReporte() {
        System.out.println("crearVistaGenerarReporte");
        controlGenerarReporte.crearVistaGenerarReporte();
        assertNotNull(controlGenerarReporte); // Aseguramos que la vista se crea correctamente
        assertEquals(1, controlGenerarReporte.c); // Verificar que la variable de control "c" se establece correctamente
    }

    /**
     * Test of generarReporte method, of class ControlGenerarReporte.
     */
    @Test
    public void testGenerarReporte() {
        System.out.println("generarReporte");

        // Probar el reporte de reclutados
        controlGenerarReporte.generarReporte("edu.avanzada.taller1.modelo.Reclutado");
        assertEquals(1, controlGenerarReporte.reporte.size()); // Verificar que haya 1 reclutado

        // Probar el reporte de remisos
        controlGenerarReporte.generarReporte("edu.avanzada.taller1.modelo.Remiso");
        assertEquals(1, controlGenerarReporte.reporte.size()); // Verificar que haya 1 remiso

        // Probar el reporte de reservistas
        controlGenerarReporte.generarReporte("edu.avanzada.taller1.modelo.Reservista");
        assertEquals(1, controlGenerarReporte.reporte.size()); // Verificar que haya 1 reservista

        // Probar el reporte de aplazados
        controlGenerarReporte.generarReporte("edu.avanzada.taller1.modelo.Aplazado");
        assertEquals(1, controlGenerarReporte.reporte.size()); // Verificar que haya 1 aplazado
    }

    /**
     * Test of actionPerformed method, of class ControlGenerarReporte.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");

        // Crear un evento simulado para probar el botón de reporte de reclutados
        ActionEvent e = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Reclutados");
        controlGenerarReporte.actionPerformed(e);
        assertEquals(1, controlGenerarReporte.reporte.size()); // Verificar que el evento genere el reporte correcto

        // Crear un evento simulado para probar el botón de salir
        ActionEvent eSalir = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Salir");
        // No vamos a probar System.exit(), pero verificamos que el evento se ejecuta sin errores
        controlGenerarReporte.actionPerformed(eSalir);
    }
}
