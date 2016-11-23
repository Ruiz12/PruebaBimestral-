/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNO;

/**
 * EDISON RUIZ
 */
public class Alumno {

    private String nombre;
    private String apellido;
    private Docente doc_programacion;
    private Docente doc_base_de_datos;

    public Alumno(String nombre, String apellido, Docente doc_programacion, Docente doc_base_de_datos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.doc_programacion = doc_programacion;
        this.doc_base_de_datos = doc_base_de_datos;
    }

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

    public Docente getDoc_programacion() {
        return doc_programacion;
    }

    public void setDoc_programacion(Docente doc_programacion) {
        this.doc_programacion = doc_programacion;
    }

    public Docente getDoc_base_de_datos() {
        return doc_base_de_datos;
    }

    public void setDoc_base_de_datos(Docente doc_base_de_datos) {
        this.doc_base_de_datos = doc_base_de_datos;
    }

    @Override
    public String toString() {
        return String.format("ESTUDIANTE:\nNombre: %s\nApellido: %s\n"
                + "Docente Porgramacion:\nNombre: %s\nApellido: %s\nTitulo: %s"
                + "\nDocente Base De Datos:\nNombre: %s\nApellido: %s\nTitulo: %s",
                getNombre(), getApellido(),
                getDoc_programacion().getNombre(),
                getDoc_programacion().getApellido(),
                getDoc_programacion().getTitulo(),
                getDoc_base_de_datos().getNombre(),
                getDoc_base_de_datos().getApellido(),
                getDoc_base_de_datos().getTitulo());

    }
 
}
