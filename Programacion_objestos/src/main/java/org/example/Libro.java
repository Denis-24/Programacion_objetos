package org.example;

public class Libro {

    private static  int CANTIDAD_LIBROS=0;
    private static  int LIBROS_DISPONIBLES =0;
    private static int contadorLibros = 0;
    private static final String CADENA_ID = "LIB ";

    private String titulo;
    private String autor;
    private String id;
    private Boolean disponibilidad;


    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        generadorID();
        disponibilidad=true;
        CANTIDAD_LIBROS++;
        LIBROS_DISPONIBLES++;
        id = generadorID();

    }

    private String generadorID(){
        id="LIB " + (++contadorLibros);
        return CADENA_ID + CANTIDAD_LIBROS;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad() {
        disponibilidad = true;
    }

    public void prestar(){

        if (disponibilidad) {
            disponibilidad = false;
            System.out.println("El libro " + titulo + " ha sido prestado.");
            LIBROS_DISPONIBLES--;
        }else {
            System.out.println("El libro " + titulo + " no esta diponible");
        }

    }

    public void devolver(){
        if (!disponibilidad){
            disponibilidad=true;
            System.out.println("El libro " + titulo + " ha sid devuelto.");
            LIBROS_DISPONIBLES++;
        }else {
            System.out.println("El libro "+ titulo + " esta disponible. No se puede devolver.");
        }
    }

    public boolean estaDisponible(){
        return disponibilidad;
    }

    public static int getLibrosDisponibles() {
        return LIBROS_DISPONIBLES;
    }

    public static int getCantidadLibros() {
        return CANTIDAD_LIBROS;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
