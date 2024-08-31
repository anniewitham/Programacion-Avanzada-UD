package Modelo;

public class Reclutado extends Persona {
    private String codigoReclutamiento;

    public Reclutado(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    public String getCodigoReclutamiento() {
        return codigoReclutamiento;
    }

    public void setCodigoReclutamiento(String codigoReclutamiento) {
        this.codigoReclutamiento = codigoReclutamiento;
    }
    
    
}
