package org.example;

public class EstudiantesApp {

    static void main(String[] args) {

        Estudiantes denis = new Estudiantes("denis","1dam","denis@gmial.com");

        System.out.println(denis.getNia());
        System.out.println(denis);

        Estudiantes pedro = new Estudiantes("pedro");

        System.out.println(pedro.getNia());
        System.out.println(pedro);


    }
}
