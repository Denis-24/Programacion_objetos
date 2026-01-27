package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Compra {

    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        ArrayList<String> compra = new ArrayList<>();

        System.out.println(compra);

        compra.add("Carne");

        System.out.println(compra);

        compra.addAll(Arrays.asList("agua","uva","turron","tomate","jamon"));

        System.out.println(compra);

        System.out.println(compra.get(2));

        compra.set(1,"queso");

        System.out.println(compra);

        System.out.println(compra.contains("leche"));


        System.out.println("Que producto quieres introducir");
        String producto = teclado.next();

        if (compra.contains(producto)){
            System.out.println("Este producto ya esta en el carrito");
            System.out.println(compra);
        }else {
            compra.add(producto);
        }

        System.out.println("Que producto quieres introducir");
        String sustituto = teclado.next();

        System.out.println("En que posicion quieres sustituirlo");
        int num = teclado.nextInt();

        if (compra.contains(sustituto)){
            System.out.println("Este producto ya esta en la compra");
        }else {
            compra.set(num,sustituto);
        }


        System.out.println(compra);

        System.out.println(compra.size());

        ArrayList<String> copia = new ArrayList<>(compra);

        System.out.println(copia);
        copia.clear();

        System.out.println(copia);

        System.out.println(compra.equals(copia));

        copia.addAll(Arrays.asList("pan","aceite","queso"));
        System.out.println("ESTA ES LA COPIA : " + copia);

        ArrayList<String> faltantes = new ArrayList<>(compra);


        faltantes.removeAll(copia);
        System.out.println(faltantes);


        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < compra.size(); i++) {

            numeros.add(aleatorio.nextInt(11));

        }

        System.out.println(numeros);


    }
}
