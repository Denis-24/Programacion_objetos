package Colecciones;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Historial_de_navegación {
    static Scanner teclado = new Scanner(System.in);

    static void main(String[] args) {
        String palabra = "";
        LinkedHashSet<String>set = new LinkedHashSet<>();
        while (!palabra.toLowerCase().equals("salir")){
            System.out.println("Escribe una URL visitada (o 'salir' para terminar): ");
            palabra = teclado.nextLine();
            if (!palabra.equals("salir")){
                set.add(palabra);
            }
        }
        System.out.println("Historial de navegacion:");
        int contador = 1;
        for (String url : set){
            System.out.println(contador+". "+url);
            contador++;
        }









    }
}
