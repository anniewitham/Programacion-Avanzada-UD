package edu.avanzada.taller1.modelo;

//Clase hija de Persona encargada de Reclutado
public class Reclutado extends Persona {
    //Declaración de atributos de Reclutados
    private String codigoReclutamiento;

    //Método constructor
    public Reclutado(String nombre, String apellido, String cedula, String codigoReclutamiento) {
        super(nombre, apellido, cedula);
        this.codigoReclutamiento = codigoReclutamiento;
    }

    //Getters y Setters
    public String getCodigoReclutamiento() {
        return codigoReclutamiento;
    }

    public void setCodigoReclutamiento(String codigoReclutamiento) {
        this.codigoReclutamiento = codigoReclutamiento;
    }
    
    public String mostrarDatos(){
        return "<p>RECLUTA"
                + "<p>Nombre: " + super.getNombre() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;"
                + "Apellido: " + super.getApellido() + "<p> "
                + "<p>Cedula: " + super.getCedula() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;"
                + "Codigo de Reclutamiento: " + codigoReclutamiento + "<p>";
    }
}