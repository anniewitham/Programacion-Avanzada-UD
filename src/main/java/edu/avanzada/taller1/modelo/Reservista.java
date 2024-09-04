package edu.avanzada.taller1.modelo;

//Clase hija de Persona encargada de Reservista
public class Reservista extends Persona {
    //Declaración de atributos de Reservista
    private String libreta;

    //Método constructor
    public Reservista(String nombre, String apellido, String cedula, String libreta) {
        super(nombre, apellido, cedula);
        this.libreta = libreta;
    }

    //Getters y Setters
    public String getLibreta() {
        return libreta;
    }

    public void setLibreta(String libreta) {
        this.libreta = libreta;
    }
    
    public String mostrarDatos(){
        return "<p>RESERVISTA"
                + "<p>Nombre: " + super.getNombre() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;"
                + "Apellido: " + super.getApellido() + "<p> "
                + "<p>Cedula: " + super.getCedula() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;"
                + "<p>Libreta: " + libreta;
    }
}

