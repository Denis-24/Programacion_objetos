package Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class MariaTeclado {

    static Scanner teclado = new Scanner(System.in);

    static void main(String[] args) {

        ArrayList<Character>lista = new ArrayList<>();
        ListIterator<Character> it = lista.listIterator();

        String frase = teclado.nextLine();

        for (Character letra : frase.toCharArray()){
            switch (letra){
                case '<':
                    if (it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext()){
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious()){
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(letra);

            }
        }

        for (Character n : lista){
            System.out.print(n);
        }











    }








}
