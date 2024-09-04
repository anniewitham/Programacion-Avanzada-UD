package edu.avanzada.taller1.control;

import edu.avanzada.taller1.vista.VistaCambiarSituacion;
import edu.avanzada.taller1.vista.VistaMenuCambiarSituacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCambiarSituacion implements ActionListener{
    private ControlPrincipal controlPrincipal;
    private VistaCambiarSituacion vistaCambiarSituacion;
    private VistaMenuCambiarSituacion vistaMenuCambiarSituacion;
    private int c = 0;

    public ControlCambiarSituacion(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }
    
    public void crearVistaCambiarSituacion(){
        vistaCambiarSituacion = new VistaCambiarSituacion(this);
        vistaCambiarSituacion.botonActualizarSituacion.addActionListener(this);
        vistaCambiarSituacion.botonSalir.addActionListener(this);
        vistaCambiarSituacion.botonVolver.addActionListener(this);
        c = 1;
    }
    
    public void crearVistaMenuCambiarSituacion(){
        vistaMenuCambiarSituacion = new VistaMenuCambiarSituacion(this);
        vistaMenuCambiarSituacion.botonCambiarSituacion.addActionListener(this);
        vistaMenuCambiarSituacion.botonSalir.addActionListener(this);
        vistaMenuCambiarSituacion.botonVolver.addActionListener(this);
        vistaMenuCambiarSituacion.casillaAplazado.addActionListener(this);
        vistaMenuCambiarSituacion.casillaRemiso.addActionListener(this);
        vistaMenuCambiarSituacion.casillaReservista.addActionListener(this);
        vistaMenuCambiarSituacion.casillasReclutado.addActionListener(this);
        c = 2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Salir".equals(e.getActionCommand())) {
            System.exit(0);
        }
        if ("Consultar Cedula".equals(e.getActionCommand())) {
            vistaCambiarSituacion.dispose();
            crearVistaMenuCambiarSituacion();
        }
        if ("Volver".equals(e.getActionCommand())) {
            switch (c){
                case 1:
                    vistaCambiarSituacion.dispose();
                    controlPrincipal.crearVista();
                    break;
                case 2:
                    vistaMenuCambiarSituacion.dispose();
                    crearVistaCambiarSituacion();
                    break;
            }
        }
    }
    
}
