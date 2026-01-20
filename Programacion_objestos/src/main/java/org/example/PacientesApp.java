package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PacientesApp {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        Paciente primero = new Paciente();

        System.out.println(primero.getDni());

        Paciente Angel = new Paciente("Angel",20,'H', 60,170);

        System.out.println(Angel.calcularIMC());

        System.out.println(Angel.esMayorDeEdad());

        if (Angel.esMayorDeEdad()){
            System.out.println(Angel.getNombre()+" es mayor de edad");
        }else {
            System.out.println(Angel.getNombre()+" es menor de edad");
        }

        Paciente tuprima = new Paciente("Prima_Angel", 20, 'O', 60,160);

        System.out.println(tuprima.getSexo());
        System.out.println(tuprima.getNombre());

        System.out.println("Dime tu nombre");
        String nombre = teclado.next();

        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();

        System.out.println("Introduce tu sexo");
        String genero = teclado.next();

        char sexo = genero.charAt(0);

        System.out.println("Introduce peso");
        int peso = teclado.nextInt();

        System.out.println("Introuce tu altura");
        int altura = teclado.nextInt();


        Paciente Primero = new Paciente(nombre,edad,sexo,peso,altura);
//        System.out.println(Primero.calcularIMC());
//        System.out.println(Primero.esMayorDeEdad());
//        Primero.Informacion();
        System.out.println(Primero);
        System.out.println();

        Paciente Segundo = new Paciente(nombre,edad,sexo);
//        System.out.println(Segundo.calcularIMC());
//        System.out.println(Segundo.esMayorDeEdad());
//        Segundo.Informacion();
//        System.out.println();

        Paciente Tercero = new Paciente();
//        System.out.println(Tercero.calcularIMC());
//        System.out.println(Tercero.esMayorDeEdad());
//        Tercero.Informacion();
//        System.out.println();


    }



}
