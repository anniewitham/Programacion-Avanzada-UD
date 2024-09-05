package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Aplazado;
import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.modelo.Reservista;
import edu.avanzada.taller1.vista.VistaInsertarAplazado;
import edu.avanzada.taller1.vista.VistaInsertarRecluta;
import edu.avanzada.taller1.vista.VistaInsertarRemiso;
import edu.avanzada.taller1.vista.VistaInsertarReservista;
import edu.avanzada.taller1.vista.VistaMenuInsertarPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlInsertarPersona implements ActionListener {

    // Referencia al controlador principal
    protected ControlPrincipal controlPrincipal;
    // Vistas para insertar personas y el menú de inserción
    protected VistaMenuInsertarPersona vistaInsertarPersona;
    protected VistaInsertarRecluta vistaInsertarRecluta;
    protected VistaInsertarReservista vistaInsertarReservista;
    protected VistaInsertarRemiso vistaInsertarRemiso;
    protected VistaInsertarAplazado vistaInsertarAplazado;
    // Variable para controlar la vista actual
    private int c = 0;
    
    // Constructor del controlador
    public ControlInsertarPersona(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }
    
    // Método para crear y configurar la vista del menú de inserción de persona
    public void crearVistaInsertarPersona() {
        vistaInsertarPersona = new VistaMenuInsertarPersona(this);
        vistaInsertarPersona.botonInsertarReclutado.addActionListener(this);
        vistaInsertarPersona.botonInsertarAplazado.addActionListener(this);
        vistaInsertarPersona.botonInsertarRemiso.addActionListener(this);
        vistaInsertarPersona.botonInsertarReservista.addActionListener(this);
        vistaInsertarPersona.botonSalir.addActionListener(this);
        vistaInsertarPersona.botonVolver.addActionListener(this);
        c = 1; // Indica que la vista actual es el menú de inserción de persona
    }
    
    // Método para crear y configurar la vista de inserción de reclutado
    public void crearVistaInsertarRecluta() {
        vistaInsertarRecluta = new VistaInsertarRecluta(this);
        vistaInsertarRecluta.botonInsertarRecluta.addActionListener(this);
        vistaInsertarRecluta.botonSalir.addActionListener(this);
        vistaInsertarRecluta.botonVolver.addActionListener(this);
        c = 2; // Indica que la vista actual es la inserción de reclutado
    }
    
    // Método para crear y configurar la vista de inserción de reservista
    public void crearVistaInsertarReservista() {
        vistaInsertarReservista = new VistaInsertarReservista(this);
        vistaInsertarReservista.botonInsertarReservista.addActionListener(this);
        vistaInsertarReservista.botonSalir.addActionListener(this);
        vistaInsertarReservista.botonVolver.addActionListener(this);
        c = 3; // Indica que la vista actual es la inserción de reservista
    }
    
    // Método para crear y configurar la vista de inserción de remiso
    public void crearVistaInsertarRemiso() {
        vistaInsertarRemiso = new VistaInsertarRemiso(this);
        vistaInsertarRemiso.botonInsertarRemiso.addActionListener(this);
        vistaInsertarRemiso.botonSalir.addActionListener(this);
        vistaInsertarRemiso.botonVolver.addActionListener(this);
        c = 4; // Indica que la vista actual es la inserción de remiso
    }
    
    // Método para crear y configurar la vista de inserción de aplazado
    public void crearVistaInsertarAplazado() {
        vistaInsertarAplazado = new VistaInsertarAplazado(this);
        vistaInsertarAplazado.botonInsertarAplazado.addActionListener(this);
        vistaInsertarAplazado.botonSalir.addActionListener(this);
        vistaInsertarAplazado.botonVolver.addActionListener(this);
        c = 5; // Indica que la vista actual es la inserción de aplazado
    }
    
    // Método para validar si una cédula ya está registrada
    public  boolean validarRegistro(String cedula) {
        for (Persona persona : controlPrincipal.personas) {
            if (persona.getCedula().equals(cedula)) {
                return true; // La cédula ya está registrada
            }
        }
        return false; // La cédula no está registrada
    }
    
    // Manejo de eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Salir":
                // Cerrar la aplicación (evitar usar System.exit en aplicaciones modulares)
                System.exit(0);
                break;
            case "Reclutado":
                // Mostrar vista para insertar reclutado
                vistaInsertarPersona.dispose();
                crearVistaInsertarRecluta();
                break;
            case "Insertar Recluta":
                // Insertar un nuevo reclutado
                String cedulaRecluta = vistaInsertarRecluta.CedulaRecluta.getText();
                if (validarRegistro(cedulaRecluta)) {
                    JOptionPane.showMessageDialog(null, "La persona con cédula " + cedulaRecluta + " ya está registrada.");
                    return;
                }
                Reclutado recluta = new Reclutado(
                        vistaInsertarRecluta.NombreRecluta.getText(),
                        vistaInsertarRecluta.ApellidoRecluta.getText(),
                        vistaInsertarRecluta.CedulaRecluta.getText(),
                        vistaInsertarRecluta.CodigoReclutamientoRecluta.getText()
                );
                controlPrincipal.personas.add(recluta);
                vistaInsertarRecluta.dispose();
                crearVistaInsertarPersona();
                break;
            case "Reservista":
                // Mostrar vista para insertar reservista
                vistaInsertarPersona.dispose();
                crearVistaInsertarReservista();
                break;
            case "Insertar Reservista":
                // Insertar un nuevo reservista
                String cedulaReservista = vistaInsertarReservista.CedulaReservista.getText();
                if (validarRegistro(cedulaReservista)) {
                    JOptionPane.showMessageDialog(null, "La persona con cédula " + cedulaReservista + " ya está registrada.");
                    return;
                }
                Reservista reservista = new Reservista(
                        vistaInsertarReservista.NombreReservista.getText(),
                        vistaInsertarReservista.ApellidoReservista.getText(),
                        vistaInsertarReservista.CedulaReservista.getText(),
                        vistaInsertarReservista.LibretaMilitar.getText()
                );
                controlPrincipal.personas.add(reservista);
                vistaInsertarReservista.dispose();
                crearVistaInsertarPersona();
                break;
            case "Remiso":
                // Mostrar vista para insertar remiso
                vistaInsertarPersona.dispose();
                crearVistaInsertarRemiso();
                break;
            case "Insertar Remiso":
                // Insertar un nuevo remiso
                String cedulaRemiso = vistaInsertarRemiso.CedulaRemiso.getText();
                if (validarRegistro(cedulaRemiso)) {
                    JOptionPane.showMessageDialog(null, "La persona con cédula " + cedulaRemiso + " ya está registrada.");
                    return;
                }
                Remiso remiso = new Remiso(
                        vistaInsertarRemiso.NombreRemiso.getText(),
                        vistaInsertarRemiso.ApellidoRemiso.getText(),
                        vistaInsertarRemiso.CedulaRemiso.getText()
                );
                controlPrincipal.personas.add(remiso);
                vistaInsertarRemiso.dispose();
                crearVistaInsertarPersona();
                break;
            case "Aplazado":
                // Mostrar vista para insertar aplazado
                vistaInsertarPersona.dispose();
                crearVistaInsertarAplazado();
                break;
            case "Insertar Aplazado":
                // Insertar un nuevo aplazado
                String cedulaAplazado = vistaInsertarAplazado.CedulaAplazado.getText();
                if (validarRegistro(cedulaAplazado)) {
                    JOptionPane.showMessageDialog(null, "La persona con cédula " + cedulaAplazado + " ya está registrada.");
                    return;
                }
                Aplazado aplazado = new Aplazado(
                        vistaInsertarAplazado.NombreAplazado.getText(),
                        vistaInsertarAplazado.ApellidoAplazado.getText(),
                        vistaInsertarAplazado.CedulaAplazado.getText(),
                        vistaInsertarAplazado.FechaAplazamiento.getDate()
                );
                controlPrincipal.personas.add(aplazado);
                vistaInsertarAplazado.dispose();
                crearVistaInsertarPersona();
                break;
            case "Volver":
                // Volver a la vista anterior según el estado actual
                switch (c) {
                    case 1:
                        vistaInsertarPersona.dispose();
                        controlPrincipal.crearVista();
                        break;
                    case 2:
                        vistaInsertarRecluta.dispose();
                        crearVistaInsertarPersona();
                        break;
                    case 3:
                        vistaInsertarReservista.dispose();
                        crearVistaInsertarPersona();
                        break;
                    case 4:
                        vistaInsertarRemiso.dispose();
                        crearVistaInsertarPersona();
                        break;
                    case 5:
                        vistaInsertarAplazado.dispose();
                        crearVistaInsertarPersona();
                        break;
                }
                break;
            default:
                // Manejo de acción desconocida
                break;
        }
    }
}

