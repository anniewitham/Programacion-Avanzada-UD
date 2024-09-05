package edu.avanzada.taller1.modelo;

//Clase hija de Persona encargada de Remiso
public class Remiso extends Persona{
    //Método constructor
    public Remiso(String nombre, String apellido, String cedula){
        super(nombre, apellido, cedula);
    }
    
    public String mostrarDatos(){
        return "<html>" +
            "<h2>REMISO</h2>" +
            "<p><strong>Nombre:</strong> " + super.getNombre() + "&emsp;" +
            "<strong>Apellido:</strong> " + super.getApellido() + "</p>" +
            "<p><strong>Cédula:</strong> " + super.getCedula() + "&emsp;" +
            "</html>";
    }
}
