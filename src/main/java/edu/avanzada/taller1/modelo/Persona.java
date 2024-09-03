package edu.avanzada.taller1.modelo;

//Clase padre y abstracta Persona
public abstract class Persona {
    //Declaración de los atributos de Persona
    private String nombre;
    private String apellido;
    private String cedula;

    //Métodos constructor
    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
            
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


