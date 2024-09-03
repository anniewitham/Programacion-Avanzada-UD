
package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import java.util.List;

//Esta clase es la encargada de la lógica del proyecto
public class ControlPrincipal {

    private ControlReservista controlReservista;
    private ControlAplazado controlAplazado;
    private ControlRemiso controlRemiso;
    private ControlReclutado controlReclutado;

    public ControlPrincipal {
        this.controlReservista = new ControlReservista();
        this.controlAplazado = new ControlAplazado();
        this.controlRemiso = new ControlRemiso();
        this.controlReclutado = new ControlReclutado();
    }

    public String insertarPersona(Persona persona, EstadoSituacionMilitar estado) {
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
}
