
package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Aplazado;
import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.modelo.Reservista;
import edu.avanzada.taller1.vista.VistaConsultarPersona;
import edu.avanzada.taller1.vista.VistaMostrarConsulta;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.JTextField;

public class ControlConsultarPersonaTest {

    private ControlConsultarPersona control;
    private ControlPrincipal controlPrincipal;
    private VistaConsultarPersona vistaConsultarPersona;
    private VistaMostrarConsulta vistaMostrarConsulta;

    @BeforeEach
    public void setUp() {
        controlPrincipal = new ControlPrincipal();
        control = new ControlConsultarPersona(controlPrincipal);
        vistaConsultarPersona = new VistaConsultarPersona(control);
        vistaMostrarConsulta = new VistaMostrarConsulta(control);
        
        controlPrincipal.personas.add(new Reclutado("John", "Doe", "12345", "001"));
        controlPrincipal.personas.add(new Reservista("Jane", "Doe", "67890", "A123"));
        controlPrincipal.personas.add(new Remiso("Joe", "Smith", "54321"));
        controlPrincipal.personas.add(new Aplazado("Anna", "Brown", "98765", new java.util.Date()));
    }

    @Test
    public void testCrearVistaConsultarPersona() {
        control.crearVistaConsultarPersona();
        assertNotNull(control.vistaConsultarPersona, "La vista de consulta no debería ser nula");
        assertNotNull(control.vistaConsultarPersona.botonConsultarCedula.getActionListeners(), 
                "El botón Consultar Cedula debería tener un ActionListener asociado");
        assertNotNull(control.vistaConsultarPersona.botonSalir.getActionListeners(), 
                "El botón Salir debería tener un ActionListener asociado");
        assertNotNull(control.vistaConsultarPersona.botonVolverMenu.getActionListeners(), 
                "El botón Volver al Menú debería tener un ActionListener asociado");
    }

    @Test
    public void testCrearVistaMostrarConsulta() {
        control.crearVistaMostrarConsulta("Test data");
        assertNotNull(control.mostrarConsulta, "La vista de mostrar consulta no debería ser nula");
        assertEquals("<html>Test data</html>", control.mostrarConsulta.datosConsulta.getText(), 
                "Los datos mostrados en la vista de consulta deberían ser correctos");
    }

    @Test
    public void testConsultarPersona_Encontrado() {
        control.crearVistaConsultarPersona();
        vistaConsultarPersona.jTextFieldConsultarCedula.setText("12345");
        
        control.actionPerformed(new ActionEvent(vistaConsultarPersona.botonConsultarCedula, ActionEvent.ACTION_PERFORMED, "Consultar Cedula"));
        
        assertNotNull(control.mostrarConsulta, "La vista de mostrar consulta debería haberse creado");
        assertEquals("<html>Nombre: John<br>Apellido: Doe<br>Cédula: 12345<br>Código: 001</html>", 
                control.mostrarConsulta.datosConsulta.getText(), "Los datos de la persona consultada deberían ser correctos");
    }

    @Test
    public void testConsultarPersona_NoEncontrado() {
        control.crearVistaConsultarPersona();
        vistaConsultarPersona.jTextFieldConsultarCedula.setText("99999");
        
        control.actionPerformed(new ActionEvent(vistaConsultarPersona.botonConsultarCedula, ActionEvent.ACTION_PERFORMED, "Consultar Cedula"));
        
        // Verificar que se muestre el mensaje de que la cédula no fue encontrada
        assertTrue(JOptionPane.getRootFrame().isVisible(), "El cuadro de diálogo de 'Cedula no encontrada' debería estar visible");
    }

    @Test
    public void testActionPerformed_VolverDesdeMostrarConsulta() {
        control.crearVistaMostrarConsulta("Test data");
        
        control.actionPerformed(new ActionEvent(vistaMostrarConsulta.botonVolverMenu, ActionEvent.ACTION_PERFORMED, "Volver"));
        
        assertTrue(control.vistaConsultarPersona.isVisible(), "La vista de consultar persona debería estar visible después de 'Volver'");
    }

    @Test
    public void testActionPerformed_Salir() {
        // No se puede probar System.exit(0) directamente.
       
    }
}