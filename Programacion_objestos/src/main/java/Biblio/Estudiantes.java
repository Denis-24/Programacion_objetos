package Biblio;

import java.util.ArrayList;

public class Estudiantes {

    private static final String CORREO_FROMATO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> listadelibro;

    public Estudiantes(String nombre, String curso, String email){

        this.nombre=nombre;
        this.curso=curso;
        this.email= email;
        setNia();
        listadelibro = new ArrayList<>();

    }

    public void insertarLibro(Libro libro){
        listadelibro.add(libro);
    }

    public void eliminarLibro(Libro libro){
        listadelibro.remove(libro);
    }

    public Estudiantes(String nombre){
        this(nombre,"","");

    }

    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;

    }

    public static boolean validaremail(String correo){
        if (correo.matches(CORREO_FROMATO)){
            return true;
        }else {
            return false;
        }
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

    private void setNia() {
        nia = ++contadorEstudiantes ;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Libro> getListadelibro() {
        return listadelibro;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.listadelibro = libro;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", nia=" + nia +
                ", email='" + email + '\'' +
//                ", libro=" + listadelibro +
                '}';
    }
}
