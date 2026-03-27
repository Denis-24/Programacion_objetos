package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Prueba_Streams {

    static void main(String[] args) {

        Stream<String> pruebaStream = Stream.of("Ibai","IlloJuan","Falete","Kevin")
                .filter(persona -> persona.startsWith("I"))
                .filter(persona ->persona.contains("o"))
                .map(persona -> persona.toUpperCase());
//                .anyMatch(persona -> persona.equals("IlloJuan"));

        List<String> lista = pruebaStream.toList();
        System.out.println(lista);


        List<String> lista2 = Arrays.asList("Jijona", "Yema", "Piedra", "Durs");

        lista2 = lista2.stream().filter( turron -> turron.contains("Y")).toList();
        System.out.println(lista2);









    }




}
