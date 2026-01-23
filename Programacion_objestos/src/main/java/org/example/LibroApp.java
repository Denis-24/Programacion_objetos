package org.example;

public class LibroApp {

    static void main() {

        Libro divina_comedia = new Libro("Divina Comedia", "Dante");

        System.out.println(divina_comedia);

        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
        System.out.println("Libros totales: " + Libro.getCantidadLibros());

        System.out.println(divina_comedia);

        Estudiantes pedro = new Estudiantes("pedro");

        divina_comedia.prestar(pedro);
        divina_comedia.devolver();
        divina_comedia.prestar(pedro);





    }
}
