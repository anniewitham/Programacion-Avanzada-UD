package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.vista.ActulizarSituacion;
import edu.avanzada.taller1.vista.CambiarSituacion;
import edu.avanzada.taller1.vista.ConsultarPersona;
import edu.avanzada.taller1.vista.ElegirSituacionReporte;
import edu.avanzada.taller1.vista.InsertarAplazado;
import edu.avanzada.taller1.vista.InsertarPersona;
import edu.avanzada.taller1.vista.InsertarRecluta;
import edu.avanzada.taller1.vista.InsertarRemiso;
import edu.avanzada.taller1.vista.InsertarReservista;
import edu.avanzada.taller1.vista.Menu;
import edu.avanzada.taller1.vista.MostrarConsultaCedula;
import edu.avanzada.taller1.vista.MostrarReporte;
import edu.avanzada.taller1.vista.VentanaEmergente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * ControlPrincipal. Clase principal que gestiona el funcionamiento del
 * programa, implementa la clase ActionListener que permite escuchar los eventos
 * de la interfaz.
 */
public class ControlPrincipal implements ActionListener {

    private ControlReservista controlReservista;
    private ControlAplazado controlAplazado;
    private ControlRemiso controlRemiso;
    private ControlReclutado controlReclutado;

    private Menu menu;

    private InsertarPersona inserPersona;
    private InsertarReservista inserReservista;
    private InsertarRecluta inserReclutado;
    private InsertarAplazado inserAplazado;
    private InsertarRemiso inserRemiso;

    private ConsultarPersona consultarPersona;
    private MostrarConsultaCedula mostrarConsultaPersona;

    private CambiarSituacion cambiarSituacion;
    private ActulizarSituacion actualizarSituacion;

    private ElegirSituacionReporte elegirSituacionReporte;
    private MostrarReporte mostrarReporte;

    VentanaEmergente ventanaEmergente;

    public ControlPrincipal() {
        controlReservista = new ControlReservista(this);
        controlAplazado = new ControlAplazado(this);
        controlRemiso = new ControlRemiso(this);
        controlReclutado = new ControlReclutado(this);

        //Agregar funcionalidad a los botones de las interfaces
        menu = new Menu(this);
        menu.addSalirListener(this);
        menu.addInsertarPersonaListener(this);
        menu.addConsultarPersonaListener(this);
        menu.addCambiarSituacionMilitarListener(this);
        menu.addReporteEstadoListener(this);

        inserPersona = new InsertarPersona(this);
        inserPersona.addSalirListener(this);
        inserPersona.addInsertarReservistaListener(this);
        inserPersona.addInsertarReclutadoListener(this);
        inserPersona.addInsertarAplazadoListener(this);
        inserPersona.addInsertarRemisoListener(this);

        inserReclutado = new InsertarRecluta(this);
        inserReclutado.addSalirListener(this);
        inserReclutado.addVolverMenuListener(this);
        inserReclutado.addInsertarReclutaListener(this);

        inserReservista = new InsertarReservista(this);
        inserReservista.addSalirListener(this);
        inserReservista.addVolverMenuListener(this);
        inserReservista.addInsertarReclutaListener(this);

        inserAplazado = new InsertarAplazado(this);
        inserAplazado.addSalirListener(this);
        inserAplazado.addVolverMenuListener(this);
        inserAplazado.addInsertarAplazadoistener(this);

        inserRemiso = new InsertarRemiso(this);
        inserRemiso.addSalirListener(this);
        inserRemiso.addVolverMenuListener(this);
        inserRemiso.addInsertarRemisoListener(this);

        consultarPersona = new ConsultarPersona(this);
        consultarPersona.addSalirListener(this);
        consultarPersona.addvolverMenuListener(this);
        consultarPersona.addConsultarPersonaListener(this);

        mostrarConsultaPersona = new MostrarConsultaCedula(this);
        mostrarConsultaPersona.addSalirListener(this);
        mostrarConsultaPersona.addvolverMenuListener(this);

        cambiarSituacion = new CambiarSituacion(this);
        cambiarSituacion.addSalirListener(this);
        cambiarSituacion.addVolverMenuListener(this);
        cambiarSituacion.addCambiarSituacionListener(this);

        actualizarSituacion = new ActulizarSituacion(this);
        actualizarSituacion.addSalirListener(this);
        actualizarSituacion.addvolverMenuListener(this);
        actualizarSituacion.addActualizarSituacionListener(this);

        elegirSituacionReporte = new ElegirSituacionReporte(this);
        elegirSituacionReporte.addSalirListener(this);
        elegirSituacionReporte.addvolverMenuListener(this);
        elegirSituacionReporte.addReporteReservistasListener(this);
        elegirSituacionReporte.addReporteReclutadosListener(this);
        elegirSituacionReporte.addReporteAplazadosListener(this);
        elegirSituacionReporte.addReporteRemisosListener(this);

        mostrarReporte = new MostrarReporte(this);
        mostrarReporte.addSalirListener(this);
    }

    /*  public String insertarPersona(Persona persona, EstadoSituacionMilitar estado) {
        switch (estado) {
            case RESERVISTA:
                return controlReservista.insertarReservista(persona);
            case APLAZADO:
                return controlAplazado.insertarAplazado(persona);
            case REMISO:
                return controlRemiso.insertarRemiso((Remiso) persona);
            case RECLUTADO:
                return controlReclutado.insertarReclutado((Reclutado) persona);
            default:
                return "Estado no reconocido.";
        }
    }
    
    public Persona consultarPersona(String cedula, EstadoSituacionMilitar estado) {
        switch (estado) {
            case RESERVISTA:
                return controlReservista.consultarReservista(cedula);
            case APLAZADO:
                return controlAplazado.consultarAplazado(cedula);
            case REMISO:
                return controlRemiso.consultarRemiso(cedula);
            case RECLUTADO:
                return controlReclutado.consultarReclutado(cedula);
            default:
                return null;
        }
    }

    // Lógica para el menú
    public void mostrarMenu() {
        // 1. Insertar persona
        // 2. Consultar persona
        // 3. Cambiar estado
        // 4. Generar reporte
        // Se delega la acción al control específico según la opción seleccionada
    }
     */
    
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
        if ("Volver Menu".equals(e.getActionCommand())) {
           inserAplazado.setVisible(false);
           inserAplazado.resetearCamposAplazado();
           inserReclutado.setVisible(false);
           inserReclutado.resetearCamposRecluta();
           inserRemiso.setVisible(false);
           inserRemiso.resetearCamposRemiso();
           inserReservista.setVisible(false);
           inserReservista.resetearCamposReservista();
           
           consultarPersona.setVisible(false);
           consultarPersona.resetearCampos();
           mostrarConsultaPersona.setVisible(false);
           
           actualizarSituacion.setVisible(false);
           actualizarSituacion.resetearCampos();
           cambiarSituacion.setVisible(false);
           cambiarSituacion.resetearCampos();
           
           elegirSituacionReporte.setVisible(false);
           mostrarReporte.setVisible(false);
        }
        
        if ("Insertar Persona".equals(e.getActionCommand())) {
           
        }
        if ("Consultar Persona".equals(e.getActionCommand())) {
          
        }
        if ("Cambiar situacion militar".equals(e.getActionCommand())) {
            
        }
        if ("Generar reporte de estado".equals(e.getActionCommand())) {
            
        }
        
        
    }
    /**
     * getVentanaEmergente. Método que retorna la ventana emergente.
     *
     * @return VentanaEmergente
     */
    public VentanaEmergente getVentanaEmergente() {
        return ventanaEmergente;
    }
}
