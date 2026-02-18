package Juego;

import java.util.Random;
import java.util.Scanner;

public class JuegoApp {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int puntuacion = aleatorio.nextInt(10000);

        System.out.println("Introduce la dificultad");
        Dificultad d1 = Dificultad.valueOf(teclado.nextLine());


        System.out.println("Puntuacion obtenida: " + puntuacion);
        System.out.println("Puntuacion total: " + puntuacion * d1.getMultiplicador());





    }
}
