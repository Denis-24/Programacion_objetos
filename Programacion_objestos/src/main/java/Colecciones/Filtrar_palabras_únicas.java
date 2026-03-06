package Colecciones;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Filtrar_palabras_únicas {
    static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {
        System.out.println("Introduce una frase");
        String frase = teclado.nextLine();

        String frase_separada[] = frase.split(" ");

        HashSet<String>set = new HashSet<>(Arrays.asList(frase_separada));

        System.out.println("Palabras unicas: " + set);








    }
}
