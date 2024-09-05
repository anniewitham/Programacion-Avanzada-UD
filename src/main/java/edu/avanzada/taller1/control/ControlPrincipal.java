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
    private ControlInsertarPersona controlInsertar;
    private ControlConsultarPersona controlConsultar;
    private ControlCambiarSituacion controlCambiarSituacion;
    private ControlGenerarReporte controlGenerarReporte;
    protected VistaMenu menu;
    public ArrayList<Persona> personas;
    
    public ControlPrincipal() {
        controlInsertar = new ControlInsertarPersona(this);
        controlConsultar = new ControlConsultarPersona(this);
        controlCambiarSituacion = new ControlCambiarSituacion(this);
        controlGenerarReporte = new ControlGenerarReporte(this);
        
        personas = new ArrayList<>();
        
        crearVista();
    }
    
    /*
        Este metodo instancia la vista del Menú principal
    */
    public void crearVista(){
        //Agregar funcionalidad a los botones de las interfaces
        menu = new VistaMenu(this);
        menu.botonSituacionMilitar.addActionListener(this);
        menu.botonConsultarPersona.addActionListener(this);
        menu.botonInsertarPersona.addActionListener(this);
        menu.botonReporte.addActionListener(this);
        menu.botonSalir.addActionListener(this);
    }
    
    /**
     * actionPerformed. Método encargado de "escuchar" los cambios en la
     * interfaz.
     *
     * @param e Variable que recibe los eventos de la interfaz.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Salir".equals(e.getActionCommand())) {
            System.exit(0);
        }
        if ("Insertar Persona".equals(e.getActionCommand())) {
            menu.dispose();
            controlInsertar.crearVistaInsertarPersona();
        }
        if ("Consultar Persona".equals(e.getActionCommand())) {
            menu.dispose();
            controlConsultar.crearVistaConsultarPersona();
        }
        if ("Cambiar situacion militar".equals(e.getActionCommand())) {
            menu.dispose();
            controlCambiarSituacion.crearVistaCambiarSituacion();
            
        }
        if ("Generar reporte de estado".equals(e.getActionCommand())) {
            menu.dispose();
            controlGenerarReporte.crearVistaGenerarReporte();
        }
    }
}