package Colecciones;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Cine_App {

    static Queue<Persona_Espectador> cola = new LinkedList<>();
    static Random aleatorio = new Random();

    static void main(String[] args) {

        generarCola();
        System.out.println(cola);

        System.out.println("Hay " +cola.size() + " a la cola. " + cola);

        double recaudacion = 0;
        while (!cola.isEmpty()){

            if (cola.poll().getEdad()>=18){
                recaudacion+=3.5;
            } else if (cola.poll().getEdad() >= 11) {
                recaudacion+=2.5;
            }else {
                recaudacion+=1;
            }
        }

        System.out.println("La recaudacion es de: " + recaudacion);


    }

    public static void generarCola(){

        int num_persona = aleatorio.nextInt(251);

        for (int i = 0; i < num_persona; i++) {

            cola.offer(new Persona_Espectador(aleatorio.nextInt(3,97)));

        }

    }

}
