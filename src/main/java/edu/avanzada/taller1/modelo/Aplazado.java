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
        return "<p>APLAZADO"
                + "<p>Nombre: " + super.getNombre() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;"
                + "Apellido: " + super.getApellido() + "<p> "
                + "<p>Cedula: " + super.getCedula() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;"
                + "<p>Fecha de Aplazamiento: " + formato.format(fechaAplazamiento);
    }
}


