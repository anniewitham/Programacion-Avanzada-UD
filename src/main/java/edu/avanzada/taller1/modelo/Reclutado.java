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
        return "<html>" +
            "<h2>RECLUTA</h2>" +
            "<p><strong>Nombre:</strong> " + super.getNombre() + "&emsp;" +
            "<strong>Apellido:</strong> " + super.getApellido() + "</p>" +
            "<p><strong>Cédula:</strong> " + super.getCedula() + "&emsp;" +
            "<strong>Código de Reclutamiento:</strong> " + codigoReclutamiento + "</p>" +
            "</html>";
    }
}