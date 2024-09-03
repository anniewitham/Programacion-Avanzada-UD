
package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Remiso;
import java.util.ArrayList;
import java.util.List;


public class ControlRemiso {
 
    // Lista para almacenar los remisos
    private List<Remiso> remisos;

    // Constructor
    public ControlRemiso() {
        // Inicializar la lista de remisos
        this.remisos = new ArrayList<>();
    }

    // Método para insertar un remiso
    public String insertarRemiso(Remiso remiso) {
        if (remiso == null) {
            throw new IllegalArgumentException("Error: El remiso no puede ser nulo.");
        }

        String cedula = remiso.getCedula();
        if (cedula == null || cedula.isEmpty()) {
            throw new IllegalArgumentException("Error: La cédula no puede ser nula o estar vacía.");
        }

        // Verificar si la cédula ya está en la lista
        for (Remiso r : remisos) {
            if (r.getCedula().equals(cedula)) {
                return "Error: El remiso con cédula " + cedula + " ya está registrado.";
            }
        }

        remisos.add(remiso);
        return "Remiso con cédula " + cedula + " insertado exitosamente.";
    }

    // Método para consultar un remiso por su cédula
    public Remiso consultarRemiso(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            throw new IllegalArgumentException("Error: La cédula no puede ser nula o estar vacía.");
        }

        // Buscar remiso en la lista
        for (Remiso r : remisos) {
            if (r.getCedula().equals(cedula)) {
                return r; // Remiso encontrado
            }
        }
        return null; // Remiso no encontrado
    }
}


