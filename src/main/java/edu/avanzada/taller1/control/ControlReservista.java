
package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import java.util.ArrayList;
import java.util.List;


public class ControlReservista {
    private List<Persona> reservistas;
    private ControlPrincipal control;

    public ControlReservista(ControlPrincipal control) {
        this.reservistas = new ArrayList<>();
          this.control = control;
    }

    public String insertarReservista(Persona persona) {
        // Lógica específica para insertar un reservista
        return "Reservista insertado correctamente.";
    }

    public Persona consultarReservista(String cedula) {
        // Lógica específica para consultar un reservista
        return null;
    }
}
