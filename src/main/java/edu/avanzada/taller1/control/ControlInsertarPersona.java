package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.vista.VistaInsertarRecluta;
import edu.avanzada.taller1.vista.VistaMenuInsertarPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlInsertarPersona implements ActionListener{

    private ControlPrincipal controlPrincipal;
    public VistaMenuInsertarPersona vistaInsertarPersona;
    private VistaInsertarRecluta vistaInsertarRecluta;
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
            Reclutado recluta = new Reclutado(
                    vistaInsertarRecluta.NombreRecluta.getText(),
                    vistaInsertarRecluta.ApellidoRecluta.getText(),
                    vistaInsertarRecluta.CedulaRecluta.getText(),
                    vistaInsertarRecluta.CodigoReclutamientoRecluta.getText()
            );
            controlPrincipal.personas.add(recluta);
            vistaInsertarRecluta.limpiarRecluta();
        }
        if ("Reservista".equals(e.getActionCommand())) {
            vistaInsertarPersona.dispose();
        }
        if ("Remiso".equals(e.getActionCommand())) {
            vistaInsertarPersona.dispose();
        }
        if ("Aplazado".equals(e.getActionCommand())) {
            vistaInsertarPersona.dispose();
        }
        if ("Volver".equals(e.getActionCommand())) {
            switch (c) {
                case 1:
                    vistaInsertarPersona.dispose();
                    controlPrincipal.crearVista();
                    break;
                case 2:
                    vistaInsertarRecluta.dispose();
                    crearVistaInsertarPersona();
                    break;
            }
        }
    }
    
}
