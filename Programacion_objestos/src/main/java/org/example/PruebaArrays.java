package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class PruebaArrays {

    static void main(String[] args) {

        ArrayList<Integer> listaNotas= new ArrayList<>();

        listaNotas.add(5);
        listaNotas.add(6);
        listaNotas.add(2);
        listaNotas.add(1);
        listaNotas.add(3);

        System.out.println(listaNotas);

        System.out.println("Elementos en la lista: " + listaNotas.size());

        listaNotas.add(2,8);

        System.out.println(listaNotas);

        listaNotas.getFirst();
        listaNotas.getLast();
        listaNotas.remove(4);
        System.out.println(listaNotas);

        System.out.println(listaNotas.indexOf(8));

        System.out.println("Las notas de Raul: ");

        for (Integer nota : listaNotas){
            System.out.println("Nota de la asigmatura: " + nota);
        }

        for (int i = 0; i < listaNotas.size(); i++) {

            System.out.println("Nota de la asignatura " + (i+1) + ": " + listaNotas.get(i));

        }

        listaNotas.set(2,10);

        System.out.println(listaNotas);

        listaNotas.clone();

        ArrayList<Integer> copia  = new ArrayList<>(listaNotas);
        copia.remove(2);

        System.out.println(copia);

        System.out.println(listaNotas.contains(5));

        System.out.println("La lista esta vacia? " + listaNotas.isEmpty());
        copia.clear();
        System.out.println("La lista esta vacia? " + copia.isEmpty());

        copia.addAll(listaNotas);
        System.out.println(copia);

    }
}
