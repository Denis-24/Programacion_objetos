package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_3 {

    static HashMap<String,Double>mapa = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);

    static void main(String[] args) {
        System.out.println("*** REGISTRO DE TEMPERATURA ***");
        while (true){
            System.out.println("Elige una opcion [insertar, actualizar, consultar, ver todo");
            String opcion = teclado.nextLine().toLowerCase();

            switch (opcion){
                case "insertar":
                    insertar();

                    break;
                case "actualizar":
                    actualizar();
                    break;
                case "consultar":
                    consultar();
                    break;
                case "ver todo":
                    verTodo();
                    break;
                case "salir":
                    return;
                default:
                    System.out.println("La opcion elegida no existe, vuelve a introducir una opcion...");
            }

            System.out.println("***Mapita temporal***");
            for(Map.Entry<String,Double>mapita : mapa.entrySet()){
                System.out.println(mapita.getKey() + " - " + mapita.getValue());
            }

        }
    }

    public static void insertar(){

        System.out.println("Introduce los datos (ciudad, temperatura): ");
        String ciudad[] = teclado.nextLine().split("/");

        mapa.put(ciudad[0],Double.valueOf(ciudad[1]));

    }
    public static void actualizar(){
        System.out.println("Introduce que ciudad quieres actualizar:");
        String ciudad = teclado.nextLine();
        if (mapa.containsKey(ciudad)){
            System.out.println("Inroduce la nueva temperatura: ");
            Double temp = teclado.nextDouble();
            mapa.put(ciudad,temp);
        }
    }
    public static void consultar(){
        System.out.println("Introduce la ciudad que quieres consultar: ");
        String ciudad = teclado.nextLine();
        if (mapa.containsKey(ciudad)){
            System.out.println("La ciudad de " + ciudad + " tiene  " + mapa.get(ciudad));
        }else {
            System.out.println("La ciudad de " + ciudad + " no tiene temperaturas registradas....");
        }
    }
    public static void verTodo(){
        System.out.println("***Mapita definitivo***");
        for(Map.Entry<String,Double>mapita : mapa.entrySet()){
            System.out.println(mapita.getKey() + ": " + mapita.getValue() + "º");
        }
    }






}
