package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Aplazado;
import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.modelo.Reservista;
import edu.avanzada.taller1.vista.VistaGenerarReporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControlGenerarReporte implements ActionListener {
    public ArrayList<Persona> reporte;
    private ControlPrincipal controlPrincipal;
    private VistaGenerarReporte vistaGenerarReporte;
    private int c = 0;

    public ControlGenerarReporte(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }
    
    public void crearVistaGenerarReporte(){
        vistaGenerarReporte = new VistaGenerarReporte(this);
        vistaGenerarReporte.botonReporteAplazado.addActionListener(this);
        vistaGenerarReporte.botonReporteReclutados.addActionListener(this);
        vistaGenerarReporte.botonReporteRemiso.addActionListener(this);
        vistaGenerarReporte.botonReporteReservista.addActionListener(this);
        vistaGenerarReporte.botonSalir.addActionListener(this);
        vistaGenerarReporte.botonVolver.addActionListener(this);
        c = 1;
    }
    
    public void generarReporte(String situacion){
        Persona persona;
        for(int i=0;i<controlPrincipal.personas.size();i++){
            if(cedula.equals(controlPrincipal.personas.get(i).getCedula())){
                persona = controlPrincipal.personas.get(i);
                String caso = persona.getClass().getName();
                switch(caso){
                    case "edu.avanzada.taller1.modelo.Reclutado":
                        Reclutado recluta = (Reclutado) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(recluta.mostrarDatos());
                        break;
                    case "edu.avanzada.taller1.modelo.Reservista":
                        Reservista reservista = (Reservista) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(reservista.mostrarDatos());
                        break;
                    case "edu.avanzada.taller1.modelo.Remiso":
                        Remiso remiso = (Remiso) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(remiso.mostrarDatos());
                        break;
                    case "edu.avanzada.taller1.modelo.Aplazado":
                        Aplazado aplazado = (Aplazado) controlPrincipal.personas.get(i);
                        crearVistaMostrarConsulta(aplazado.mostrarDatos());
                        break;
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Salir".equals(e.getActionCommand())) {
            System.exit(0);
        }
        if ("Reclutados".equals(e.getActionCommand())) {
            generarReporte("edu.avanzada.taller1.modelo.Reclutado");
        }
        if ("Salir".equals(e.getActionCommand())) {
            System.exit(0);
        }
        if ("Salir".equals(e.getActionCommand())) {
            System.exit(0);
        }
        if ("Volver".equals(e.getActionCommand())) {
            switch(c){
                case 1:
                    vistaGenerarReporte.dispose();
                    controlPrincipal.crearVista();
                    break;
            }
        }
    }
    
}
