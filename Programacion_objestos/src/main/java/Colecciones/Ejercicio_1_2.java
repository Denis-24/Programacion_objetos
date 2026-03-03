package Colecciones;

import java.util.Stack;

public class Ejercicio_1_2 {
    static void main(String[] args) {
        Stack<Character>listachar = new Stack<>();

        listachar.push('a');
        listachar.push('b');
        listachar.push('g');
        listachar.push('s');
        listachar.push('j');
        listachar.isEmpty();
        System.out.println(listachar.size());
        System.out.println(listachar.peek());
        System.out.println(listachar.pop());
        System.out.println();


        while (!listachar.isEmpty()){
            System.out.print(listachar.pop() + " - ");
        }

    }
}
