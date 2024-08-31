package Modelo;

import java.util.Date;

public class Aplazado extends Persona{
    private Date fechaAplazamiento;

    public Aplazado(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    public Date getFechaAplazamiento() {
        return fechaAplazamiento;
    }

    public void setFechaAplazamiento(Date fechaAplazamiento) {
        this.fechaAplazamiento = fechaAplazamiento;
    }
    
    
}
