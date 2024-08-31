package Modelo;

public class Reservista extends Persona {

    private String libreta;

    public Reservista(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    public String getLibreta() {
        return libreta;
    }

    public void setLibreta(String libreta) {
        this.libreta = libreta;
    }

}
