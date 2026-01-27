package Biblio;

import java.time.LocalDateTime;

public class Prestamo {
    private Libro libro;
    private Estudiantes estudiantes;
    private LocalDateTime fecha;

    public Prestamo(Libro libro, Estudiantes estudiantes){

        fecha  = LocalDateTime.now();
        this.libro = libro;
        this.estudiantes = estudiantes;

    }




    public Estudiantes getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiantes estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", estudiantes=" + estudiantes +
                ", fecha=" + fecha +
                '}';
    }
}
