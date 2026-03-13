package Iterators;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Teclado_estropeado {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            ArrayList<Character>lista = new ArrayList<>();
            ListIterator<Character> it = lista.listIterator();

            String frase = in.nextLine();

            for (Character letra : frase.toCharArray()){
                switch (letra){
                    case '-':
                        while (it.hasPrevious()){
                            it.previous();
                        }
                        break;
                    case '+':
                        while (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '*':
                        if (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '3':
                        if (it.hasNext()){
                            it.next();
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
            System.out.println();
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }


}
