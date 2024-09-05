package edu.avanzada.taller1.control;

import edu.avanzada.taller1.vista.VistaMenu;
import java.awt.event.ActionEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlPrincipalTest {

    private ControlPrincipal instance;
    private static VistaMenu menuMock; // Un mock de la vista para realizar pruebas específicas

    @BeforeAll
    public static void setUpClass() {
        // Este método se ejecuta una sola vez antes de todas las pruebas
        // Podrías utilizarlo para configurar cosas que necesitas para todas las pruebas
        menuMock = new VistaMenu(null); // Crear una instancia de VistaMenu para usarla en las pruebas
    }
    
    @AfterAll
    public static void tearDownClass() {
        // Este método se ejecuta una sola vez después de todas las pruebas
        // Libera recursos que fueron inicializados en setUpClass
        menuMock = null; // Limpiar el recurso compartido
    }
    
    @BeforeEach
    public void setUp() {
        // Este método se ejecuta antes de cada prueba individual
        instance = new ControlPrincipal(); // Crear una nueva instancia de ControlPrincipal antes de cada prueba
    }
    
    @AfterEach
    public void tearDown() {
        // Este método se ejecuta después de cada prueba individual
        instance = null; // Limpiar la instancia después de cada prueba
    }

    /**
     * Test of crearVista method, of class ControlPrincipal.
     */
    @Test
    public void testCrearVista() {
        instance.crearVista();
        
        assertNotNull(instance.menu, "La vista del menú no debería ser nula");
        
        assertNotNull(instance.menu.botonSituacionMilitar.getActionListeners(), 
                "El botón Situación Militar debería tener un ActionListener asociado");
        assertNotNull(instance.menu.botonConsultarPersona.getActionListeners(), 
                "El botón Consultar Persona debería tener un ActionListener asociado");
        assertNotNull(instance.menu.botonInsertarPersona.getActionListeners(), 
                "El botón Insertar Persona debería tener un ActionListener asociado");
        assertNotNull(instance.menu.botonReporte.getActionListeners(), 
                "El botón Generar Reporte debería tener un ActionListener asociado");
        assertNotNull(instance.menu.botonSalir.getActionListeners(), 
                "El botón Salir debería tener un ActionListener asociado");
    }

    
    @Test
    public void testActionPerformed_InsertarPersona() {
        ActionEvent e = new ActionEvent(instance.menu.botonInsertarPersona, ActionEvent.ACTION_PERFORMED, "Insertar Persona");
        instance.actionPerformed(e);
        
        assertFalse(instance.menu.isVisible(), "El menú debería estar cerrado después de 'Insertar Persona'");
    }

    @Test
    public void testActionPerformed_ConsultarPersona() {
        ActionEvent e = new ActionEvent(instance.menu.botonConsultarPersona, ActionEvent.ACTION_PERFORMED, "Consultar Persona");
        instance.actionPerformed(e);
        
        assertFalse(instance.menu.isVisible(), "El menú debería estar cerrado después de 'Consultar Persona'");
    }

    @Test
    public void testActionPerformed_CambiarSituacionMilitar() {
        ActionEvent e = new ActionEvent(instance.menu.botonSituacionMilitar, ActionEvent.ACTION_PERFORMED, "Cambiar situacion militar");
        instance.actionPerformed(e);
        
        assertFalse(instance.menu.isVisible(), "El menú debería estar cerrado después de 'Cambiar situacion militar'");
    }

    @Test
    public void testActionPerformed_GenerarReporte() {
        ActionEvent e = new ActionEvent(instance.menu.botonReporte, ActionEvent.ACTION_PERFORMED, "Generar reporte de estado");
        instance.actionPerformed(e);
        
        assertFalse(instance.menu.isVisible(), "El menú debería estar cerrado después de 'Generar reporte de estado'");
    }

    @Test
    public void testActionPerformed_Salir() {
      
    }
}


