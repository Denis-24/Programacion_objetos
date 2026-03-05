package Colecciones;

import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio_2_Queue {
    static void main(String[] args) {

        Deque<String>playlist = new LinkedList<>();

        playlist.offer("Beliver");
        playlist.offer("Despacito");
        playlist.offer("Subeme la radio");

        System.out.print("Estado inicial de la playlist: ");
        System.out.println(playlist);
        System.out.println();
        while (!playlist.isEmpty()){
            System.out.println("Reproduciendo: " + playlist.peek());
            playlist.poll();
            System.out.println("Estado de la playlist despues de una reproduccion: " + playlist);
        }
        System.out.println("La lista ha terminado...");





    }
}
