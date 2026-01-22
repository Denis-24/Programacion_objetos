package org.example;

public class EstudiantesApp {

    static void main(String[] args) {

        Estudiantes denis = new Estudiantes("denis","1dam","denis@gmial.com");

        System.out.println(denis.getNia());
        System.out.println(denis);

        Estudiantes pedro = new Estudiantes("pedro");

        System.out.println(pedro.getNia());
        System.out.println(pedro);

        System.out.println("Hay " + Estudiantes.obtenerTotalEstudiantes() + " estudiantes.");

        System.out.println(Estudiantes.validaremail("denis@mutxamel.com"));
        System.out.println(Estudiantes.validaremail("denis@alu.edu.gva.es"));

        Libro divina_comedia = new Libro("Divina Comedia", "Dante");

        System.out.println(divina_comedia);

//        divina_comedia.prestar(pedro);
//        divina_comedia.devolver();
//        divina_comedia.prestar(pedro);

        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
        System.out.println("Libros totales: " + Libro.getCantidadLibros());

        System.out.println(divina_comedia);

        System.out.println(divina_comedia.getEstudiantesPrestado());


    }
}
