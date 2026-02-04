package Biblio;

public class Libro {

    private static  int CANTIDAD_LIBROS=0;
    private static  int LIBROS_DISPONIBLES =0;
    private static int contadorLibros = 0;
    private static final String CADENA_ID = "LIB ";

    private String titulo;
    private String autor;
    private String id;
    private Boolean disponibilidad;
    private Estudiantes estudiantesPrestado;
    private Editorial editorial;


    public Libro(String titulo, String autor, Editorial editorial){
        this.titulo=titulo;
        this.autor=autor;
        disponibilidad=true;
        CANTIDAD_LIBROS++;
        LIBROS_DISPONIBLES++;
        id = generadorID();
        estudiantesPrestado = null;
        this.editorial = editorial;


    }

    private String generadorID(){
        id="LIB" + (++contadorLibros);
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

    public Prestamo prestar(Estudiantes estudiantes) {

        Prestamo prestamo = null;

        if (disponibilidad && !estudiantes.getListadelibro().contains(this)) {
            disponibilidad = false;
            System.out.println("El libro " + titulo + " ha sido prestado a " + estudiantes.getNombre() + " del curso " + estudiantes.getCurso());
            LIBROS_DISPONIBLES--;
            estudiantesPrestado = estudiantes;
            estudiantes.insertarLibro(this);
            prestamo = new Prestamo(this, estudiantes);
            System.out.println("Prestamo realizado con exito");
        } else if (estudiantes.getListadelibro().contains(this)) {
            System.out.println("El studiante " + estudiantes.getNombre() + " ya tiene el libro " + titulo + " prestado");
        }else {
            System.out.println("El libro " + titulo + " no esta diponible");
        }
        return prestamo;
    }

    public void devolver(){
        if (!disponibilidad){
            disponibilidad=true;
            System.out.println("El libro " + titulo + " ha sid devuelto por " + estudiantesPrestado.getNombre() + " de curso " + estudiantesPrestado.getCurso());
            LIBROS_DISPONIBLES++;
            estudiantesPrestado.eliminarLibro(this);
            estudiantesPrestado=null;
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


    public Estudiantes getEstudiantesPrestado() {
        return estudiantesPrestado;
    }

    public static int getContadorLibros() {
        return contadorLibros;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponibilidad=" + disponibilidad +
                ", estudiantesPrestado=" + estudiantesPrestado +
                ", editorial=" + editorial +
                '}';
    }
}
