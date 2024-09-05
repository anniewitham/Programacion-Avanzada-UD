package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Aplazado;
import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.modelo.Reservista;
import edu.avanzada.taller1.vista.VistaConsultarPersona;
import edu.avanzada.taller1.vista.VistaMostrarConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlConsultarPersona implements ActionListener {
    // Referencia al controlador principal que maneja la lógica del sistema
    protected ControlPrincipal controlPrincipal;
    // Vistas asociadas a este controlador
    protected VistaConsultarPersona vistaConsultarPersona;
    protected VistaMostrarConsulta mostrarConsulta;
    // Variables de estado
    private int c = 0; // Variable para controlar el estado de las vistas
    private boolean personaNoEncontrada = false; // Indicador de si la persona no fue encontrada

    // Constructor del controlador
    public ControlConsultarPersona(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }
    
    // Método para crear y configurar la vista de consulta de persona
    public void crearVistaConsultarPersona() {
        vistaConsultarPersona = new VistaConsultarPersona(this);
        vistaConsultarPersona.botonConsultarCedula.addActionListener(this);
        vistaConsultarPersona.botonSalir.addActionListener(this);
        vistaConsultarPersona.botonVolverMenu.addActionListener(this);
        c = 1; // Indica que la vista de consulta de persona ha sido creada
    }
    
    // Método para crear y configurar la vista de mostrar consulta con los datos de la persona
    public void crearVistaMostrarConsulta(String datos) {
        mostrarConsulta = new VistaMostrarConsulta(this);
        mostrarConsulta.botonSalir.addActionListener(this);
        mostrarConsulta.botonVolverMenu.addActionListener(this);
        mostrarConsulta.datosConsulta.setText("<html>" + datos + "</html>");
        c = 2; // Indica que la vista de mostrar consulta ha sido creada
    }
    
    // Método para consultar una persona por su cédula
    public void consultarPersona(String cedula) {
        Persona persona;
        personaNoEncontrada = true; // Inicialmente asumimos que la persona no fue encontrada
        for (int i = 0; i < controlPrincipal.personas.size(); i++) {
            if (cedula.equals(controlPrincipal.personas.get(i).getCedula())) {
                persona = controlPrincipal.personas.get(i);
                String caso = persona.getClass().getName();
                switch (caso) {
                    case "edu.avanzada.taller1.modelo.Reclutado":
                        Reclutado recluta = (Reclutado) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(recluta.mostrarDatos());
                        personaNoEncontrada = false;
                        break;
                    case "edu.avanzada.taller1.modelo.Reservista":
                        Reservista reservista = (Reservista) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(reservista.mostrarDatos());
                        personaNoEncontrada = false;
                        break;
                    case "edu.avanzada.taller1.modelo.Remiso":
                        Remiso remiso = (Remiso) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(remiso.mostrarDatos());
                        personaNoEncontrada = false;
                        break;
                    case "edu.avanzada.taller1.modelo.Aplazado":
                        Aplazado aplazado = (Aplazado) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(aplazado.mostrarDatos());
                        personaNoEncontrada = false;
                        break;
                }
            }
        }
    }

    // Manejo de eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Salir":
                // Cerrar la aplicación (evitar usar System.exit en aplicaciones modulares)
                System.exit(0);
                break;
            case "Consultar Cedula":
                // Consultar la cédula ingresada y mostrar los datos
                consultarPersona(vistaConsultarPersona.jTextFieldConsultarCedula.getText());
                if (!personaNoEncontrada) {
                    vistaConsultarPersona.dispose(); // Cerrar la vista si la persona es encontrada
                } else {
                    JOptionPane.showMessageDialog(null, "Cédula " + vistaConsultarPersona.jTextFieldConsultarCedula.getText() + " no encontrada en el sistema");
                }
                break;
            case "Volver":
                // Volver a la vista anterior según el estado
                switch (c) {
                    case 1:
                        vistaConsultarPersona.dispose();
                        controlPrincipal.crearVista();
                        break;
                    case 2:
                        mostrarConsulta.dispose();
                        crearVistaConsultarPersona();
                        break;
                }
                break;
            default:
                // Manejo de acción desconocida
                break;
        }
    }
}

