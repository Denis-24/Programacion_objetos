package Biblio;

public class EstudiantesApp {

    static void main(String[] args) {

        Estudiantes denis = new Estudiantes("denis","1dam","denis@gmial.com");

        System.out.println(denis.getNia());

        Estudiantes pedro = new Estudiantes("pedro");

        System.out.println(pedro.getNia());

        System.out.println("Hay " + Estudiantes.obtenerTotalEstudiantes() + " estudiantes.");

        System.out.println(Estudiantes.validaremail("denis@mutxamel.com"));
        System.out.println(Estudiantes.validaremail("denis@alu.edu.gva.es"));

        Editorial editorial = new Editorial("Milenium", "España");

        Libro divina_comedia = new Libro("Divina Comedia", "Dante", editorial);

        System.out.println(divina_comedia);

        divina_comedia.prestar(pedro);
        divina_comedia.devolver();
        divina_comedia.prestar(denis);

        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
        System.out.println("Libros totales: " + Libro.getCantidadLibros());

        System.out.println(divina_comedia);

        System.out.println(divina_comedia.getEstudiantesPrestado());

//        Prestamo p1 = divina_comedia.prestar(pedro);
//
//        System.out.println("Fecha del prestamo: " + p1.getFecha());

        System.out.println(denis.getListadelibro());


    }
}
