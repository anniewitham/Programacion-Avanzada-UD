package Modelo;

import java.util.Date;

public class Aplazado extends Persona{
    private String fechaAplazamiento;

    public Aplazado(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    public String getFechaAplazamiento() {
        return fechaAplazamiento;
    }

    public void setFechaAplazamiento(String fechaAplazamiento) {
        this.fechaAplazamiento = fechaAplazamiento;
    }

 
    
    
}
