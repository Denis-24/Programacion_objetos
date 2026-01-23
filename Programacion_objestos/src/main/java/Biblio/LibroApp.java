package Biblio;

import java.sql.SQLOutput;

public class LibroApp {

    static void main() {

        Editorial editorial = new Editorial("Milenium", "España");

        Libro divina_comedia = new Libro("Divina Comedia", "Dante",editorial );

        System.out.println(divina_comedia);

        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
        System.out.println("Libros totales: " + Libro.getCantidadLibros());

        System.out.println();

        System.out.println(divina_comedia);

        Estudiantes pedro = new Estudiantes("pedro");

        System.out.println();

        divina_comedia.prestar(pedro);
        divina_comedia.devolver();
        divina_comedia.prestar(pedro);

        System.out.println();

        System.out.println(editorial);

        System.out.println();




    }
}
