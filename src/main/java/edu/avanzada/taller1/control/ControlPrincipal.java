package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.vista.VistaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * ControlPrincipal. Clase principal que gestiona el funcionamiento del
 * programa, implementa la clase ActionListener que permite escuchar los eventos
 * de la interfaz.
 */
public class ControlPrincipal implements ActionListener {
    
    // Controladores para manejar diferentes aspectos de la aplicación
    protected ControlInsertarPersona controlInsertar;
    protected ControlConsultarPersona controlConsultar;
    protected ControlCambiarSituacion controlCambiarSituacion;
    protected ControlGenerarReporte controlGenerarReporte;
    
    // Vista principal del menú
    protected VistaMenu menu;
    
    // Lista de personas gestionadas en la aplicación
    public ArrayList<Persona> personas;
    
    /**
     * Constructor de ControlPrincipal. Inicializa los controladores y la lista de personas,
     * y crea la vista del menú principal.
     */
    public ControlPrincipal() {
        // Inicialización de los controladores
        controlInsertar = new ControlInsertarPersona(this);
        controlConsultar = new ControlConsultarPersona(this);
        controlCambiarSituacion = new ControlCambiarSituacion(this);
        controlGenerarReporte = new ControlGenerarReporte(this);
        
        // Inicialización de la lista de personas
        personas = new ArrayList<>();
        
        // Creación de la vista principal
        crearVista();
    }
    
    /**
     * Método para instanciar y configurar la vista del menú principal.
     * Agrega los listeners a los botones de la interfaz.
     */
    public void crearVista() {
        menu = new VistaMenu(this);
        menu.botonSituacionMilitar.addActionListener(this);
        menu.botonConsultarPersona.addActionListener(this);
        menu.botonInsertarPersona.addActionListener(this);
        menu.botonReporte.addActionListener(this);
        menu.botonSalir.addActionListener(this);
    }
    
    /**
     * Método encargado de manejar los eventos de la interfaz.
     *
     * @param e Evento que se recibe al interactuar con la interfaz.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Manejo del evento de salir
        if ("Salir".equals(e.getActionCommand())) {
            System.exit(0);
        }
        
        // Manejo del evento para insertar una persona
        if ("Insertar Persona".equals(e.getActionCommand())) {
            menu.dispose(); // Cierra la vista del menú
            controlInsertar.crearVistaInsertarPersona(); // Crea la vista para insertar persona
        }
        
        // Manejo del evento para consultar una persona
        if ("Consultar Persona".equals(e.getActionCommand())) {
            menu.dispose(); // Cierra la vista del menú
            controlConsultar.crearVistaConsultarPersona(); // Crea la vista para consultar persona
        }
        
        // Manejo del evento para cambiar la situación militar
        if ("Cambiar situacion militar".equals(e.getActionCommand())) {
            menu.dispose(); // Cierra la vista del menú
            controlCambiarSituacion.crearVistaCambiarSituacion(); // Crea la vista para cambiar la situación militar
        }
        
        // Manejo del evento para generar un reporte de estado
        if ("Generar reporte de estado".equals(e.getActionCommand())) {
            menu.dispose(); // Cierra la vista del menú
            controlGenerarReporte.crearVistaGenerarReporte(); // Crea la vista para generar reporte
        }
    }
}
