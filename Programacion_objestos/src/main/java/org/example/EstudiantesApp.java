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


    }
}
