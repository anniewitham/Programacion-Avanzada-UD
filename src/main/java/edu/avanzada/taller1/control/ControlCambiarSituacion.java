package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.modelo.Reservista;
import edu.avanzada.taller1.vista.VistaCambiarSituacion;
import edu.avanzada.taller1.vista.VistaMenuCambiarSituacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import edu.avanzada.taller1.vista.VistaInsertarRecluta;
import edu.avanzada.taller1.vista.VistaInsertarRemiso;
import edu.avanzada.taller1.vista.VistaInsertarReservista;

public class ControlCambiarSituacion implements ActionListener {
    // Referencia al controlador principal que maneja la lógica del sistema
    protected ControlPrincipal controlPrincipal;
    // Vistas asociadas a este controlador
    protected VistaCambiarSituacion vistaCambiarSituacion;
    protected VistaMenuCambiarSituacion vistaMenuCambiarSituacion;
    protected VistaInsertarRecluta vistaInsertarRecluta;
    protected VistaInsertarReservista vistaInsertarReservista;
    protected VistaInsertarRemiso vistaInsertarRemiso;
    // Persona cuyo estado se va a cambiar
    protected Persona personaCambiar;
    // Variable para controlar el estado de las vistas
    protected int c = 0;

    // Constructor del controlador
    public ControlCambiarSituacion(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        personaCambiar = null;
    }
    
    // Método para crear y configurar la vista para cambiar la situación
    public void crearVistaCambiarSituacion() {
        vistaCambiarSituacion = new VistaCambiarSituacion(this);
        vistaCambiarSituacion.botonActualizarSituacion.addActionListener(this);
        vistaCambiarSituacion.botonSalir.addActionListener(this);
        vistaCambiarSituacion.botonVolver.addActionListener(this);
        c = 1; // Indica que la vista de cambiar situación ha sido creada
    }
    
    // Método para crear y configurar la vista de menú para cambiar la situación de una persona
    public void crearVistaMenuCambiarSituacion(String cedula) {
        // Buscar la persona con la cédula proporcionada
        for (Persona persona : controlPrincipal.personas) {
            if (cedula.equals(persona.getCedula())) {
                personaCambiar = persona;
                break;
            }
        }
        vistaMenuCambiarSituacion = new VistaMenuCambiarSituacion(this);
        vistaMenuCambiarSituacion.botonCambiarSituacion.addActionListener(this);
        vistaMenuCambiarSituacion.botonSalir.addActionListener(this);
        vistaMenuCambiarSituacion.botonVolver.addActionListener(this);
        vistaMenuCambiarSituacion.casillaAplazado.addActionListener(this);
        vistaMenuCambiarSituacion.casillaRemiso.addActionListener(this);
        vistaMenuCambiarSituacion.casillaReservista.addActionListener(this);
        vistaMenuCambiarSituacion.casillaReclutado.addActionListener(this);
        // Configurar los campos de la vista con los datos de la persona
        vistaMenuCambiarSituacion.nombre.setText(personaCambiar.getNombre());
        vistaMenuCambiarSituacion.situacion.setText(personaCambiar.getClass().getSimpleName());
        vistaMenuCambiarSituacion.validarOpciones();
        c = 2; // Indica que la vista de menú para cambiar la situación ha sido creada
    }
    
    // Método para crear y configurar la vista de inserción de un Remiso
    public void crearVistaInsertarRemiso(Persona personaCambiar) {
        vistaInsertarRemiso = new VistaInsertarRemiso(this);
        vistaInsertarRemiso.botonInsertarRemiso.addActionListener(this);
        vistaInsertarRemiso.botonSalir.addActionListener(this);
        vistaInsertarRemiso.botonVolver.addActionListener(this);
        // Configurar los campos de la vista con los datos de la persona
        vistaInsertarRemiso.NombreRemiso.setText(personaCambiar.getNombre());
        vistaInsertarRemiso.CedulaRemiso.setText(personaCambiar.getCedula());
        vistaInsertarRemiso.ApellidoRemiso.setText(personaCambiar.getApellido());
        c = 3; // Indica que la vista de inserción de Remiso ha sido creada
    }
    
    // Método para crear y configurar la vista de inserción de un Recluta
    public void crearVistaInsertarRecluta(Persona personaCambiar) {
        vistaInsertarRecluta = new VistaInsertarRecluta(this);
        vistaInsertarRecluta.botonInsertarRecluta.addActionListener(this);
        vistaInsertarRecluta.botonSalir.addActionListener(this);
        vistaInsertarRecluta.botonVolver.addActionListener(this);
        // Configurar los campos de la vista con los datos de la persona
        vistaInsertarRecluta.NombreRecluta.setText(personaCambiar.getNombre());
        vistaInsertarRecluta.CedulaRecluta.setText(personaCambiar.getCedula());
        vistaInsertarRecluta.ApellidoRecluta.setText(personaCambiar.getApellido());
        c = 4; // Indica que la vista de inserción de Recluta ha sido creada
    }
    
    // Método para crear y configurar la vista de inserción de un Reservista
    public void crearVistaInsertarReservista(Persona personaCambiar) {
        vistaInsertarReservista = new VistaInsertarReservista(this);
        vistaInsertarReservista.botonInsertarReservista.addActionListener(this);
        vistaInsertarReservista.botonSalir.addActionListener(this);
        vistaInsertarReservista.botonVolver.addActionListener(this);
        // Configurar los campos de la vista con los datos de la persona
        vistaInsertarReservista.NombreReservista.setText(personaCambiar.getNombre());
        vistaInsertarReservista.CedulaReservista.setText(personaCambiar.getCedula());
        vistaInsertarReservista.ApellidoReservista.setText(personaCambiar.getApellido());
        c = 5; // Indica que la vista de inserción de Reservista ha sido creada
    }
    
    // Método para cambiar la situación de la persona según el caso
    public void cambiarSituacion(int caso) {
        switch (caso) {
            case 1 -> crearVistaInsertarRemiso(personaCambiar); // Cambiar a Remiso
            case 2 -> crearVistaInsertarRecluta(personaCambiar); // Cambiar a Recluta
            case 3 -> crearVistaInsertarReservista(personaCambiar); // Cambiar a Reservista
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
                // Consultar la cédula y cambiar a la vista de menú si hay datos
                if (!controlPrincipal.personas.isEmpty()) {
                    vistaCambiarSituacion.dispose();
                    crearVistaMenuCambiarSituacion(vistaCambiarSituacion.campoCedula.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Aun no hay datos registrados en el sistema");
                }
                break;
            case "Cambiar":
                // Cambiar la situación según la opción seleccionada
                if (vistaMenuCambiarSituacion.casillaRemiso.isSelected()) {
                    cambiarSituacion(1);
                }
                if (vistaMenuCambiarSituacion.casillaReclutado.isSelected()) {
                    cambiarSituacion(2);
                }
                if (vistaMenuCambiarSituacion.casillaReservista.isSelected()) {
                    cambiarSituacion(3);
                }
                vistaMenuCambiarSituacion.dispose();
                break;
            case "Insertar Remiso":
                // Actualizar a Remiso y regresar a la vista de cambiar situación
                for (Persona persona : controlPrincipal.personas) {
                    if (vistaInsertarRemiso.CedulaRemiso.getText().equals(persona.getCedula())) {
                        controlPrincipal.personas.remove(persona);
                        break;
                    }
                }
                Remiso remiso = new Remiso(
                    vistaInsertarRemiso.NombreRemiso.getText(),
                    vistaInsertarRemiso.ApellidoRemiso.getText(),
                    vistaInsertarRemiso.CedulaRemiso.getText()
                );
                controlPrincipal.personas.add(remiso);
                vistaInsertarRemiso.dispose();
                crearVistaCambiarSituacion();
                break;
            case "Insertar Recluta":
                // Actualizar a Recluta y regresar a la vista de cambiar situación
                for (Persona persona : controlPrincipal.personas) {
                    if (vistaInsertarRecluta.CedulaRecluta.getText().equals(persona.getCedula())) {
                        controlPrincipal.personas.remove(persona);
                        break;
                    }
                }
                Reclutado recluta = new Reclutado(
                    vistaInsertarRecluta.NombreRecluta.getText(),
                    vistaInsertarRecluta.ApellidoRecluta.getText(),
                    vistaInsertarRecluta.CedulaRecluta.getText(),
                    vistaInsertarRecluta.CodigoReclutamientoRecluta.getText()
                );
                controlPrincipal.personas.add(recluta);
                vistaInsertarRecluta.dispose();
                crearVistaCambiarSituacion();
                break;
            case "Insertar Reservista":
                // Actualizar a Reservista y regresar a la vista de cambiar situación
                for (Persona persona : controlPrincipal.personas) {
                    if (vistaInsertarReservista.CedulaReservista.getText().equals(persona.getCedula())) {
                        controlPrincipal.personas.remove(persona);
                        break;
                    }
                }
                Reservista reservista = new Reservista(
                    vistaInsertarReservista.NombreReservista.getText(),
                    vistaInsertarReservista.ApellidoReservista.getText(),
                    vistaInsertarReservista.CedulaReservista.getText(),
                    vistaInsertarReservista.LibretaMilitar.getText()
                );
                controlPrincipal.personas.add(reservista);
                vistaInsertarReservista.dispose();
                crearVistaCambiarSituacion();
                break;
            case "Volver":
                // Volver a la vista anterior según el estado
                switch (c) {
                    case 1:
                        vistaCambiarSituacion.dispose();
                        controlPrincipal.crearVista();
                        break;
                    case 2:
                        vistaMenuCambiarSituacion.dispose();
                        crearVistaCambiarSituacion();
                        break;
                    case 3:
                        vistaInsertarRemiso.dispose();
                        crearVistaCambiarSituacion();
                        break;
                    case 4:
                        vistaInsertarRecluta.dispose();
                        crearVistaCambiarSituacion();
                        break;
                    case 5:
                        vistaInsertarReservista.dispose();
                        crearVistaCambiarSituacion();
                        break;
                }
                break;
            default:
                // Manejo de acción desconocida
                break;
        }
    }
}

