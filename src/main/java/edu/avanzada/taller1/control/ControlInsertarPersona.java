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

public class ControlInsertarPersona implements ActionListener{

    private ControlPrincipal controlPrincipal;
    private VistaMenuInsertarPersona vistaInsertarPersona;
    private VistaInsertarRecluta vistaInsertarRecluta;
    private VistaInsertarReservista vistaInsertarReservista;
    private VistaInsertarRemiso vistaInsertarRemiso;
    private VistaInsertarAplazado vistaInsertarAplazado;
    private int c = 0;
    
    public ControlInsertarPersona(ControlPrincipal controlPrincipal){
        this.controlPrincipal = controlPrincipal;
    }
    
    public void crearVistaInsertarPersona(){
        vistaInsertarPersona = new VistaMenuInsertarPersona(this);
        vistaInsertarPersona.botonInsertarReclutado.addActionListener(this);
        vistaInsertarPersona.botonInsertarAplazado.addActionListener(this);
        vistaInsertarPersona.botonInsertarRemiso.addActionListener(this);
        vistaInsertarPersona.botonInsertarReservista.addActionListener(this);
        vistaInsertarPersona.botonSalir.addActionListener(this);
        vistaInsertarPersona.botonVolver.addActionListener(this);
        c = 1;
    }
    
    public void crearVistaInsertarRecluta(){
        vistaInsertarRecluta = new VistaInsertarRecluta(this);
        vistaInsertarRecluta.botonInsertarRecluta.addActionListener(this);
        vistaInsertarRecluta.botonSalir.addActionListener(this);
        vistaInsertarRecluta.botonVolver.addActionListener(this);
        c = 2;
    }
    
    public void crearVistaInsertarReservista(){
        vistaInsertarReservista = new VistaInsertarReservista(this);
        vistaInsertarReservista.botonInsertarReservista.addActionListener(this);
        vistaInsertarReservista.botonSalir.addActionListener(this);
        vistaInsertarReservista.botonVolver.addActionListener(this);
        c = 3;
    }
    
    public void crearVistaInsertarRemiso(){
        vistaInsertarRemiso = new VistaInsertarRemiso(this);
        vistaInsertarRemiso.botonInsertarRemiso.addActionListener(this);
        vistaInsertarRemiso.botonSalir.addActionListener(this);
        vistaInsertarRemiso.botonVolver.addActionListener(this);
        c = 4;
    }
    
    public void crearVistaInsertarAplazado(){
        vistaInsertarAplazado = new VistaInsertarAplazado(this);
        vistaInsertarAplazado.botonInsertarAplazado.addActionListener(this);
        vistaInsertarAplazado.botonSalir.addActionListener(this);
        vistaInsertarAplazado.botonVolver.addActionListener(this);
        c = 5;
    }
    
    private boolean validarRegistro(String cedula) {
        for (Persona persona : controlPrincipal.personas) {
            if (persona.getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Salir".equals(e.getActionCommand())) {
            System.exit(0);
        }
        if ("Reclutado".equals(e.getActionCommand())) {
            vistaInsertarPersona.dispose();
            crearVistaInsertarRecluta();
        }
        if ("Insertar Recluta".equals(e.getActionCommand())) {
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
        }
        if ("Reservista".equals(e.getActionCommand())) {
            vistaInsertarPersona.dispose();
            crearVistaInsertarReservista();
        }
        if ("Insertar Reservista".equals(e.getActionCommand())){
            String cedulaRecluta = vistaInsertarRecluta.CedulaRecluta.getText();
            if (validarRegistro(cedulaRecluta)) {
                JOptionPane.showMessageDialog(null, "La persona con cédula " + cedulaRecluta + " ya está registrada.");
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
        }
        if ("Remiso".equals(e.getActionCommand())) {
            vistaInsertarPersona.dispose();
            crearVistaInsertarRemiso();
        }
        if ("Insertar Remiso".equals(e.getActionCommand())){
            String cedulaRecluta = vistaInsertarRecluta.CedulaRecluta.getText();
            if (validarRegistro(cedulaRecluta)) {
                JOptionPane.showMessageDialog(null, "La persona con cédula " + cedulaRecluta + " ya está registrada.");
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
        }
        if ("Aplazado".equals(e.getActionCommand())) {
            vistaInsertarPersona.dispose();
            crearVistaInsertarAplazado();
        }
        if ("Insertar Aplazado".equals(e.getActionCommand())){
            String cedulaRecluta = vistaInsertarRecluta.CedulaRecluta.getText();
            if (validarRegistro(cedulaRecluta)) {
                JOptionPane.showMessageDialog(null, "La persona con cédula " + cedulaRecluta + " ya está registrada.");
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
        }
        if ("Volver".equals(e.getActionCommand())) {
            switch (c) {
                case 1 -> {
                    vistaInsertarPersona.dispose();
                    controlPrincipal.crearVista();
                }
                case 2 -> {
                    vistaInsertarRecluta.dispose();
                    crearVistaInsertarPersona();
                }
                case 3 -> {
                    vistaInsertarReservista.dispose();
                    crearVistaInsertarPersona();
                }
                case 4 -> {
                    vistaInsertarRemiso.dispose();
                    crearVistaInsertarPersona();
                }
                case 5 -> {
                    vistaInsertarAplazado.dispose();
                    crearVistaInsertarPersona();
                }
            }
        }
    }
    
}
