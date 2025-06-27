package org.eclipse.jakarta.model;

public class Estudiante {

    public Estudiante(){}

    public Estudiante(int edad, String apellido, String nombre) {
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    private String id;

    private String nombre;

    private String apellido;

    private int edad;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
