package edu.avanzada.taller1.modelo;

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
}


