package Colecciones;

import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio_5_queue {
    static void main(String[] args) {
        Deque<Character>cola = new LinkedList<>();
        String palabras = "RADAR";
        for (int i = 0; i < palabras.length(); i++) {
            cola.offer(palabras.charAt(i));
        }

        while (!cola.isEmpty()){
            if (cola.peekFirst() == cola.peekLast()){
                cola.pollFirst();
                cola.pollLast();
            }else {
                System.out.println("La palabra no es palindromo...");
                break;
            }
        }
        if (cola.isEmpty()){
            System.out.println("La palabra es palindromo");
        }






    }
}
