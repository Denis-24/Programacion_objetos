package org.example;

public class Estudiantes {

    private static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public Estudiantes(String nombre, String curso, String emial){

        this.nombre=nombre;
        this.curso=curso;
        this.email=emial;
        nia = ++contadorEstudiantes;

    }

    public Estudiantes(String nombre){
        this(nombre,"","");

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", nia=" + nia +
                ", email='" + email + '\'' +
                '}';
    }
}
