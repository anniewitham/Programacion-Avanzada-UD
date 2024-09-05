package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.*;
import edu.avanzada.taller1.vista.*;
import org.junit.jupiter.api.*;
import java.awt.event.ActionEvent;
import static org.junit.jupiter.api.Assertions.*;

public class ControlInsertarPersonaTest {

    private ControlInsertarPersona controlInsertarPersona;
    private ControlPrincipal controlPrincipal;
    
    @BeforeEach
    public void setUp() {
        controlPrincipal = new ControlPrincipal();
        controlInsertarPersona = new ControlInsertarPersona(controlPrincipal);
    }
    
    @AfterEach
    public void tearDown() {
        controlInsertarPersona = null;
        controlPrincipal = null;
    }

    @Test
    public void testCrearVistaInsertarPersona() {
        controlInsertarPersona.crearVistaInsertarPersona();
        
        assertNotNull(controlInsertarPersona.vistaInsertarPersona, "La vista de insertar persona no debería ser nula");
        assertNotNull(controlInsertarPersona.vistaInsertarPersona.botonInsertarReclutado.getActionListeners(), 
                "El botón Insertar Reclutado debería tener un ActionListener asociado");
    }

    @Test
    public void testCrearVistaInsertarRecluta() {
        controlInsertarPersona.crearVistaInsertarRecluta();
        
        assertNotNull(controlInsertarPersona.vistaInsertarRecluta, "La vista de insertar recluta no debería ser nula");
        assertNotNull(controlInsertarPersona.vistaInsertarRecluta.botonInsertarRecluta.getActionListeners(), 
                "El botón Insertar Recluta debería tener un ActionListener asociado");
    }

    @Test
    public void testCrearVistaInsertarReservista() {
        controlInsertarPersona.crearVistaInsertarReservista();
        
        assertNotNull(controlInsertarPersona.vistaInsertarReservista, "La vista de insertar reservista no debería ser nula");
        assertNotNull(controlInsertarPersona.vistaInsertarReservista.botonInsertarReservista.getActionListeners(), 
                "El botón Insertar Reservista debería tener un ActionListener asociado");
    }

    @Test
    public void testCrearVistaInsertarRemiso() {
        controlInsertarPersona.crearVistaInsertarRemiso();
        
        assertNotNull(controlInsertarPersona.vistaInsertarRemiso, "La vista de insertar remiso no debería ser nula");
        assertNotNull(controlInsertarPersona.vistaInsertarRemiso.botonInsertarRemiso.getActionListeners(), 
                "El botón Insertar Remiso debería tener un ActionListener asociado");
    }

    @Test
    public void testCrearVistaInsertarAplazado() {
        controlInsertarPersona.crearVistaInsertarAplazado();
        
        assertNotNull(controlInsertarPersona.vistaInsertarAplazado, "La vista de insertar aplazado no debería ser nula");
        assertNotNull(controlInsertarPersona.vistaInsertarAplazado.botonInsertarAplazado.getActionListeners(), 
                "El botón Insertar Aplazado debería tener un ActionListener asociado");
    }

    @Test
    public void testActionPerformed_InsertarRecluta() {
        VistaInsertarRecluta vistaRecluta = new VistaInsertarRecluta(controlInsertarPersona);
        vistaRecluta.NombreRecluta.setText("John");
        vistaRecluta.ApellidoRecluta.setText("Doe");
        vistaRecluta.CedulaRecluta.setText("123456789");
        vistaRecluta.CodigoReclutamientoRecluta.setText("ABC123");
        controlInsertarPersona.vistaInsertarRecluta = vistaRecluta;

        ActionEvent e = new ActionEvent(vistaRecluta.botonInsertarRecluta, ActionEvent.ACTION_PERFORMED, "Insertar Recluta");

        controlInsertarPersona.actionPerformed(e);

        assertTrue(controlPrincipal.personas.stream().anyMatch(p -> 
            p instanceof Reclutado &&
            "John".equals(((Reclutado)p).getNombre()) &&
            "Doe".equals(((Reclutado)p).getApellido()) &&
            "123456789".equals(((Reclutado)p).getCedula()) &&
            "ABC123".equals(((Reclutado)p).getCodigoReclutamiento())
        ), "El recluta no fue agregado correctamente");
    }

    @Test
    public void testActionPerformed_InsertarReservista() {
        VistaInsertarReservista vistaReservista = new VistaInsertarReservista(controlInsertarPersona);
        vistaReservista.NombreReservista.setText("Jane");
        vistaReservista.ApellidoReservista.setText("Doe");
        vistaReservista.CedulaReservista.setText("987654321");
        vistaReservista.LibretaMilitar.setText("LM456");
        controlInsertarPersona.vistaInsertarReservista = vistaReservista;

        ActionEvent e = new ActionEvent(vistaReservista.botonInsertarReservista, ActionEvent.ACTION_PERFORMED, "Insertar Reservista");

        controlInsertarPersona.actionPerformed(e);

        assertTrue(controlPrincipal.personas.stream().anyMatch(p -> 
            p instanceof Reservista &&
            "Jane".equals(((Reservista)p).getNombre()) &&
            "Doe".equals(((Reservista)p).getApellido()) &&
            "987654321".equals(((Reservista)p).getCedula()) &&
            "LM456".equals(((Reservista)p).getLibreta())
        ), "El reservista no fue agregado correctamente");
    }

    @Test
    public void testActionPerformed_InsertarRemiso() {
        VistaInsertarRemiso vistaRemiso = new VistaInsertarRemiso(controlInsertarPersona);
        vistaRemiso.NombreRemiso.setText("Jim");
        vistaRemiso.ApellidoRemiso.setText("Beam");
        vistaRemiso.CedulaRemiso.setText("456789123");
        controlInsertarPersona.vistaInsertarRemiso = vistaRemiso;

        ActionEvent e = new ActionEvent(vistaRemiso.botonInsertarRemiso, ActionEvent.ACTION_PERFORMED, "Insertar Remiso");

        controlInsertarPersona.actionPerformed(e);

        assertTrue(controlPrincipal.personas.stream().anyMatch(p -> 
            p instanceof Remiso &&
            "Jim".equals(((Remiso)p).getNombre()) &&
            "Beam".equals(((Remiso)p).getApellido()) &&
            "456789123".equals(((Remiso)p).getCedula())
        ), "El remiso no fue agregado correctamente");
    }

    @Test
    public void testActionPerformed_InsertarAplazado() {
        VistaInsertarAplazado vistaAplazado = new VistaInsertarAplazado(controlInsertarPersona);
        vistaAplazado.NombreAplazado.setText("Jack");
        vistaAplazado.ApellidoAplazado.setText("Sparrow");
        vistaAplazado.CedulaAplazado.setText("321654987");
        vistaAplazado.FechaAplazamiento.setDate(new java.util.Date()); // Establecer una fecha actual
        controlInsertarPersona.vistaInsertarAplazado = vistaAplazado;

        ActionEvent e = new ActionEvent(vistaAplazado.botonInsertarAplazado, ActionEvent.ACTION_PERFORMED, "Insertar Aplazado");

        controlInsertarPersona.actionPerformed(e);

        assertTrue(controlPrincipal.personas.stream().anyMatch(p -> 
            p instanceof Aplazado &&
            "Jack".equals(((Aplazado)p).getNombre()) &&
            "Sparrow".equals(((Aplazado)p).getApellido()) &&
            "321654987".equals(((Aplazado)p).getCedula())
        ), "El aplazado no fue agregado correctamente");
    }

    @Test
    public void testActionPerformed_VolverDesdeRecluta() {
        VistaInsertarRecluta vistaRecluta = new VistaInsertarRecluta(controlInsertarPersona);
        controlInsertarPersona.vistaInsertarRecluta = vistaRecluta;
        controlInsertarPersona.crearVistaInsertarPersona(); // Inicializar la vista de insertar persona

        ActionEvent e = new ActionEvent(vistaRecluta.botonVolver, ActionEvent.ACTION_PERFORMED, "Volver");

        controlInsertarPersona.actionPerformed(e);

        assertTrue(controlInsertarPersona.vistaInsertarPersona.isVisible(), "La vista de insertar persona debería estar visible después de 'Volver'");
    }

    @Test
    public void testActionPerformed_Salir() {
        VistaInsertarRecluta vistaRecluta = new VistaInsertarRecluta(controlInsertarPersona);
        controlInsertarPersona.vistaInsertarRecluta = vistaRecluta;
        
        ActionEvent e = new ActionEvent(vistaRecluta.botonSalir, ActionEvent.ACTION_PERFORMED, "Salir");

        controlInsertarPersona.actionPerformed(e);

        // No hay una forma directa de verificar que la aplicación ha cerrado, pero podrías verificar que la vista ha sido ocultada
        assertFalse(controlInsertarPersona.vistaInsertarRecluta.isVisible(), "La vista debería estar oculta después de 'Salir'");
    }
    
    
}

