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
    private ControlInsertarPersona ControlInsertar;
    private ControlConsultarPersona ControlConsultar;
    private VistaMenu menu;
    protected ArrayList<Persona> personas;
    
    public ControlPrincipal() {
        ControlInsertar = new ControlInsertarPersona(this);
        ControlConsultar = new ControlConsultarPersona(this);
        
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
            ControlInsertar.crearVistaInsertarPersona();
        }
        if ("Consultar Persona".equals(e.getActionCommand())) {
            menu.dispose();
            ControlConsultar.crearVistaConsultarPersona();
        }
        if ("Cambiar situacion militar".equals(e.getActionCommand())) {
            menu.dispose();
        }
        if ("Generar reporte de estado".equals(e.getActionCommand())) {
            menu.dispose();
        }
    }
}