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
import javax.swing.JOptionPane;

public class ControlGenerarReporte implements ActionListener {
    public ArrayList<Persona> reporte;
    private ControlPrincipal controlPrincipal;
    private VistaGenerarReporte vistaGenerarReporte;
    private int c = 0;

    public ControlGenerarReporte(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        reporte = new ArrayList<>();
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
        reporte.clear();
        
        for (Persona persona : controlPrincipal.personas) {
            if (situacion.equals(persona.getClass().getName())) {
                reporte.add(persona);
            }
        }

        StringBuilder datos = new StringBuilder("<html><body>");

        for (Persona persona : reporte) {
            if (persona instanceof Reclutado) {
                datos.append(((Reclutado) persona).mostrarDatos());
            } else if (persona instanceof Aplazado) {
                datos.append(((Aplazado) persona).mostrarDatos());
            } else if (persona instanceof Remiso) {
                datos.append(((Remiso) persona).mostrarDatos());
            } else if (persona instanceof Reservista) {
                datos.append(((Reservista) persona).mostrarDatos());
            }
        }

        JOptionPane.showMessageDialog(null, datos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Salir".equals(e.getActionCommand())) {
            System.exit(0);
        }
        if ("Reclutados".equals(e.getActionCommand())) {
            generarReporte("edu.avanzada.taller1.modelo.Reclutado");
        }
        if ("Reservistas".equals(e.getActionCommand())) {
            generarReporte("edu.avanzada.taller1.modelo.Reservista");
        }
        if ("Remisos".equals(e.getActionCommand())) {
            generarReporte("edu.avanzada.taller1.modelo.Remiso");
        }
        if ("Aplazados".equals(e.getActionCommand())) {
            generarReporte("edu.avanzada.taller1.modelo.Aplazado");
        }
        if ("Volver".equals(e.getActionCommand())) {
            switch(c){
                case 1 -> {
                    vistaGenerarReporte.dispose();
                    controlPrincipal.crearVista();
                }
            }
        }
    }
    
}
