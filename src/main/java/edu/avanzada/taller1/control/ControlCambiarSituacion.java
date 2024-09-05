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

public class ControlCambiarSituacion implements ActionListener{
    private ControlPrincipal controlPrincipal;
    private VistaCambiarSituacion vistaCambiarSituacion;
    private VistaMenuCambiarSituacion vistaMenuCambiarSituacion;
    private VistaInsertarRecluta vistaInsertarRecluta;
    private VistaInsertarReservista vistaInsertarReservista;
    private VistaInsertarRemiso vistaInsertarRemiso;
    private Persona personaCambiar;
    private int c = 0;

    public ControlCambiarSituacion(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        personaCambiar = null;
    }
    
    public void crearVistaCambiarSituacion(){
        vistaCambiarSituacion = new VistaCambiarSituacion(this);
        vistaCambiarSituacion.botonActualizarSituacion.addActionListener(this);
        vistaCambiarSituacion.botonSalir.addActionListener(this);
        vistaCambiarSituacion.botonVolver.addActionListener(this);
        c = 1;
    }
    
    public void crearVistaMenuCambiarSituacion(String cedula){
        for(Persona persona : controlPrincipal.personas){
            if(cedula.equals(persona.getCedula())){
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
        vistaMenuCambiarSituacion.nombre.setText(personaCambiar.getNombre());
        vistaMenuCambiarSituacion.situacion.setText(personaCambiar.getClass().getSimpleName());
        vistaMenuCambiarSituacion.validarOpciones();
        c = 2;
    }
    
    public void crearVistaInsertarRemiso(Persona personaCambiar){
        vistaInsertarRemiso = new VistaInsertarRemiso(this);
        vistaInsertarRemiso.botonInsertarRemiso.addActionListener(this);
        vistaInsertarRemiso.botonSalir.addActionListener(this);
        vistaInsertarRemiso.botonVolver.addActionListener(this);
        vistaInsertarRemiso.NombreRemiso.setText(personaCambiar.getNombre());
        vistaInsertarRemiso.CedulaRemiso.setText(personaCambiar.getCedula());
        vistaInsertarRemiso.ApellidoRemiso.setText(personaCambiar.getApellido());
        c = 3;
    }
    
    public void crearVistaInsertarRecluta(Persona personaCambiar){
        vistaInsertarRecluta = new VistaInsertarRecluta(this);
        vistaInsertarRecluta.botonInsertarRecluta.addActionListener(this);
        vistaInsertarRecluta.botonSalir.addActionListener(this);
        vistaInsertarRecluta.botonVolver.addActionListener(this);
        vistaInsertarRecluta.NombreRecluta.setText(personaCambiar.getNombre());
        vistaInsertarRecluta.CedulaRecluta.setText(personaCambiar.getCedula());
        vistaInsertarRecluta.ApellidoRecluta.setText(personaCambiar.getApellido());
        c = 4;
    }
    
    public void crearVistaInsertarReservista(Persona personaCambiar){
        vistaInsertarReservista = new VistaInsertarReservista(this);
        vistaInsertarReservista.botonInsertarReservista.addActionListener(this);
        vistaInsertarReservista.botonSalir.addActionListener(this);
        vistaInsertarReservista.botonVolver.addActionListener(this);
        vistaInsertarReservista.NombreReservista.setText(personaCambiar.getNombre());
        vistaInsertarReservista.CedulaReservista.setText(personaCambiar.getCedula());
        vistaInsertarReservista.ApellidoReservista.setText(personaCambiar.getApellido());
        c = 5;
    }
    
    public void cambiarSituacion(int caso){
        switch(caso){
            case 1 -> crearVistaInsertarRemiso(personaCambiar);
            case 2 -> crearVistaInsertarRecluta(personaCambiar);
            case 3 -> crearVistaInsertarReservista(personaCambiar);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Salir".equals(e.getActionCommand())) {
            System.exit(0);
        }
        if ("Consultar Cedula".equals(e.getActionCommand())) {
            if((controlPrincipal.personas.size())>0){
                vistaCambiarSituacion.dispose();
                crearVistaMenuCambiarSituacion(vistaCambiarSituacion.campoCedula.getText());
            }
            else {
                JOptionPane.showMessageDialog(null, "Aun no hay datos registrados en el sistema");
            }
        }
        if ("Cambiar".equals(e.getActionCommand())) {
            if(vistaMenuCambiarSituacion.casillaRemiso.isSelected()){
                cambiarSituacion(1);
            }
            if(vistaMenuCambiarSituacion.casillaReclutado.isSelected()){
                cambiarSituacion(2);
            }
            if(vistaMenuCambiarSituacion.casillaReservista.isSelected()){
                cambiarSituacion(3);
            }
            vistaMenuCambiarSituacion.dispose();
        }
        if ("Insertar Remiso".equals(e.getActionCommand())) {
            for(Persona persona : controlPrincipal.personas){
                if((vistaInsertarRemiso.CedulaRemiso.getText()).equals(persona.getCedula())){
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
        }
        if ("Insertar Recluta".equals(e.getActionCommand())) {
            for(Persona persona : controlPrincipal.personas){
                if((vistaInsertarRecluta.CedulaRecluta.getText()).equals(persona.getCedula())){
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
        }
        if ("Insertar Reservista".equals(e.getActionCommand())) {
            for(Persona persona : controlPrincipal.personas){
                if((vistaInsertarReservista.CedulaReservista.getText()).equals(persona.getCedula())){
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
        }
        if ("Volver".equals(e.getActionCommand())) {
            switch (c){
                case 1 -> {
                    vistaCambiarSituacion.dispose();
                    controlPrincipal.crearVista();
                }
                case 2 -> {
                    vistaMenuCambiarSituacion.dispose();
                    crearVistaCambiarSituacion();
                }
                case 3 -> {
                    vistaInsertarRemiso.dispose();
                    crearVistaCambiarSituacion();
                }
                case 4 -> {
                    vistaInsertarRecluta.dispose();
                    crearVistaCambiarSituacion();
                }
                case 5 -> {
                    vistaInsertarReservista.dispose();
                    crearVistaCambiarSituacion();
                }
            }
        }
    }
}
