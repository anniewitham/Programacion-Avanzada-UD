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
    // Lista para almacenar el reporte de personas según su situación
    public ArrayList<Persona> reporte;
    // Controlador principal que maneja la lógica del sistema
    protected ControlPrincipal controlPrincipal;
    // Vista asociada a este controlador
    protected VistaGenerarReporte vistaGenerarReporte;
    // Variable para controlar el estado de la vista
    protected int c = 0;

    // Constructor del controlador, inicializa la lista de reporte
    public ControlGenerarReporte(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        reporte = new ArrayList<>();
    }
    
    // Método para crear la vista y asociar los botones a las acciones
    public void crearVistaGenerarReporte() {
        vistaGenerarReporte = new VistaGenerarReporte(this);
        vistaGenerarReporte.botonReporteAplazado.addActionListener(this);
        vistaGenerarReporte.botonReporteReclutados.addActionListener(this);
        vistaGenerarReporte.botonReporteRemiso.addActionListener(this);
        vistaGenerarReporte.botonReporteReservista.addActionListener(this);
        vistaGenerarReporte.botonSalir.addActionListener(this);
        vistaGenerarReporte.botonVolver.addActionListener(this);
        c = 1; // Indica que la vista ha sido creada
    }
    
    // Método para generar el reporte basado en la situación
    public void generarReporte(String situacion) {
        // Limpiar la lista de reporte
        reporte.clear();
        
        // Filtrar las personas según la situación
        for (Persona persona : controlPrincipal.personas) {
            if (situacion.equals(persona.getClass().getName())) {
                reporte.add(persona);
            }
        }

        // Construir el mensaje del reporte
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

        datos.append("</body></html>"); // Cerrar las etiquetas HTML
        // Mostrar el reporte en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, datos.toString());
    }

    // Manejo de eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Salir":
                // Cerrar la aplicación (evitar usar System.exit en aplicaciones modulares)
                System.exit(0);
                break;
            case "Reclutados":
                // Generar reporte de reclutados
                generarReporte("edu.avanzada.taller1.modelo.Reclutado");
                break;
            case "Reservistas":
                // Generar reporte de reservistas
                generarReporte("edu.avanzada.taller1.modelo.Reservista");
                break;
            case "Remisos":
                // Generar reporte de remisos
                generarReporte("edu.avanzada.taller1.modelo.Remiso");
                break;
            case "Aplazados":
                // Generar reporte de aplazados
                generarReporte("edu.avanzada.taller1.modelo.Aplazado");
                break;
            case "Volver":
                // Volver a la vista anterior
                if (c == 1) {
                    vistaGenerarReporte.dispose(); // Cerrar la vista actual
                    controlPrincipal.crearVista(); // Crear la vista principal
                }
                break;
            default:
                // Manejo de acción desconocida
                break;
        }
    }
}