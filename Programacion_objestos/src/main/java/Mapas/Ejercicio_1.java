package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_1 {

    static Scanner teclado = new Scanner(System.in);


    static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine().toLowerCase();

        HashMap<String,Integer>mapita = new HashMap<>();

        for (String palabras : frase.split(" ")) {
            if (mapita.containsKey(palabras)){
                mapita.put(palabras,mapita.get(palabras)+1);
            }else {
                mapita.put(palabras,1);
            }
        }

        for (Map.Entry<String,Integer>resultado : mapita.entrySet()){
            System.out.println(resultado.getKey() + ": " + resultado.getValue());
        }










    }
}
