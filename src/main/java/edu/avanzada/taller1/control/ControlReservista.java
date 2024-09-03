
package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import java.util.ArrayList;
import java.util.List;


public class ControlReservista {
    private List<Persona> reservistas;

    public ControlReservista() {
        this.reservistas = new ArrayList<>();
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
