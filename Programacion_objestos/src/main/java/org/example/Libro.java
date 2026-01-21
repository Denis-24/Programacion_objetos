package org.example;

public class Libro {

    private static final int CANTIDAD_LIBROS=0;
    private static final int LIBROS_DISPONIBLES =0;
    private static final boolean DEF_DISPONIBLE=true;
    private static int contadorLibros = 0;

    private String titulo;
    private String autor;
    private String id;
    private Boolean disponibilidad;


    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        id=generadorID();
        setDisponibilidad();

    }

    public String generadorID(){
        id="LIB " + (++contadorLibros);
        
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
        disponibilidad = DEF_DISPONIBLE;
    }





}
