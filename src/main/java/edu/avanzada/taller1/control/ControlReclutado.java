
package edu.avanzada.taller1.control;

import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import java.util.ArrayList;
import java.util.List;


public class ControlReclutado {

    private List<Reclutado> reclutados;
    private ControlPrincipal control;

    // Constructor
    public ControlReclutado(ControlPrincipal control) {
        // Inicializar la lista de reclutados
        this.reclutados = new ArrayList<>();
        this.control = control;
    }

    // Método para insertar un reclutado
    public String insertarReclutado(Reclutado reclutado) {
        if (reclutado == null) {
            throw new IllegalArgumentException("Error: El reclutado no puede ser nulo.");
        }

        String cedula = reclutado.getCedula();
        if (cedula == null || cedula.isEmpty()) {
            throw new IllegalArgumentException("Error: La cédula no puede ser nula o estar vacía.");
        }

        // Verificar si la cédula ya está en la lista
        for (Reclutado r : reclutados) {
            if (r.getCedula().equals(cedula)) {
                return "Error: El reclutado con cédula " + cedula + " ya está registrado.";
            }
        }

        reclutados.add(reclutado);
        return "Reclutado con cédula " + cedula + " insertado exitosamente.";
    }

    // Método para consultar un reclutado por su cédula
    public Reclutado consultarReclutado(String cedula) {
        if (cedula == null || cedula.isEmpty()) {
            throw new IllegalArgumentException("Error: La cédula no puede ser nula o estar vacía.");
        }

        // Buscar reclutado en la lista
        for (Reclutado r : reclutados) {
            if (r.getCedula().equals(cedula)) {
                return r; // Reclutado encontrado
            }
        }
        return null; // Reclutado no encontrado
    }
}

