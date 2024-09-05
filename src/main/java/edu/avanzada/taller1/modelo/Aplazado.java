package edu.avanzada.taller1.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

//Clase hija de Persona encargada de Aplazado
public class Aplazado extends Persona{
    //Declaración de atributos de Aplazado
    private Date fechaAplazamiento;

    //Método constructor
    public Aplazado(String nombre, String apellido, String cedula, Date fechaAplazamiento) {
        super(nombre, apellido, cedula);
        this.fechaAplazamiento = fechaAplazamiento;
    }

    //Getters y Setters
    public Date getFechaAplazamiento() {
        return fechaAplazamiento;
    }

    public void setFechaAplazamiento(Date fechaAplazamiento) {
        this.fechaAplazamiento = fechaAplazamiento;
    }
    
    public String mostrarDatos(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        return "<html>" +
            "<h2>APLAZADO</h2>" +
            "<p><strong>Nombre:</strong> " + super.getNombre() + "&emsp;" +
            "<strong>Apellido:</strong> " + super.getApellido() + "</p>" +
            "<p><strong>Cédula:</strong> " + super.getCedula() + "&emsp;" +
            "<strong>Fecha de Aplazamiento: " + formato.format(fechaAplazamiento) + "</p>" +
            "</html>";
    }
}


