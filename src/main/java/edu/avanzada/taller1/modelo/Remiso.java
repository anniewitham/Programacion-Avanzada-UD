package edu.avanzada.taller1.modelo;

//Clase hija de Persona encargada de Remiso
public class Remiso extends Persona{
    //Método constructor
    public Remiso(String nombre, String apellido, String cedula){
        super(nombre, apellido, cedula);
    }
    
    public String mostrarDatos(){
        return "<p>REMISO"
                + "<p>Nombre: " + super.getNombre() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;"
                + "Apellido: " + super.getApellido() + "<p> "
                + "<p>Cedula: " + super.getCedula() + "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;";
    }
}
