
package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import java.util.List;

//Esta clase es la encargada de la lógica del proyecto
public class ControlPrincipal {
    
    private List<Persona> personas;
    
    //Método para insertar personas para poder trabajar con las mismas
    public String insertarPersona(Persona persona) {
         if (persona == null) {
             
             //Esta excepción nos ayuda a verificar que 
             //no se quiere insertar una persina sin datos
             
            throw new IllegalArgumentException("Error: La persona no puede ser nula.");
        }

        String cedula = persona.getCedula();
        if (cedula == null) {
            //Al ser la cedula en dato más importante, no se debe registrar una persona sin cedula
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
    //Finalmente, si persona tiene los datos completos, se dejará insertar
    }
    //Método para consultar personas ya registradas
    public Persona consultarPersona(String cedula) {
       if (cedula == null) {
           //En esta excepción verificamos que no se trate de consultar una persona sin colocar su cedula
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
