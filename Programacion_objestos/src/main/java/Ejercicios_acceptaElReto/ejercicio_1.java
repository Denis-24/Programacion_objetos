package Ejercicios_acceptaElReto;

import java.util.Scanner;
import java.util.Stack;

public class ejercicio_1 {
    // Asume fichero llamado solution.java
    public class solution {

        static java.util.Scanner in;

        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {
                Stack<Character> pila = new Stack<>();
                String frase = in.nextLine();
                for (int i = 0; i < frase.length(); i++) {
                    if (frase.charAt(i) =='(' || frase.charAt(i) =='[' || frase.charAt(i) =='{'){
                        pila.push(frase.charAt(i));
                    }else if (frase.charAt(i)==')' || frase.charAt(i) ==']' || frase.charAt(i) =='}'){
                        if (pila.isEmpty()){
                            System.out.println(false);
                        }else {
                            if (pila.peek() == frase.charAt(i)){
                                pila.pop();
                            }else {
                                System.out.println("false");
                            }
                        }
                    }
                }
                System.out.println("true");


                // (incluyendo la lectura del caso de prueba)
                return true;
            }
        } // casoDePrueba

        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        } // main

    } // class solution
}
