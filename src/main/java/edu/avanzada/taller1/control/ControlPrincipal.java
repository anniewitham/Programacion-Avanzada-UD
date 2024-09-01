
package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import java.util.List;


public class ControlPrincipal {
    
    private List<Persona> personas;
    
    //insertar
    public String insertarPersona(Persona persona) {
         if (persona == null) {
            throw new IllegalArgumentException("Error: La persona no puede ser nula.");
        }

        String cedula = persona.getCedula();
        if (cedula == null) {
            throw new IllegalArgumentException("Error: La cédula no puede ser nula.");
        }

        if (cedula.isEmpty()) {
            throw new IllegalArgumentException("Error: La cédula no puede estar vacía.");
        }

        // Verificar si la cédula ya está en la lista
        for (Persona p : personas) {
            if (p.getCedula().equals(cedula)) {
                return "Error: La persona con cédula " + cedula + " ya está registrada.";
            }
        }

        personas.add(persona);
        return "Persona con cédula " + cedula + " insertada exitosamente.";
    
    }
    
    public Persona consultarPersona(String cedula) {
       if (cedula == null) {
            throw new IllegalArgumentException("Error: La cédula no puede ser nula.");
        }

        if (cedula.isEmpty()) {
            throw new IllegalArgumentException("Error: La cédula no puede estar vacía.");
        }

        // Buscar persona en la lista
        for (Persona p : personas) {
            if (p.getCedula().equals(cedula)) {
                return p; // Persona encontrada
            }
        }

        return null; // Persona no encontrada
    }
    
     
}
