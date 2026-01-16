package org.example;

public class PacientesApp {

    static void main() {

        Paciente primero = new Paciente();

        System.out.println(primero.getDni());

        Paciente juan = new Paciente("Angel",20,'H', 65,170);

        System.out.println(juan.calcularIMC());






    }



}
