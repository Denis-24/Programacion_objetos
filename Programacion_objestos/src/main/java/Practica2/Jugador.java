package Practica2;

import java.sql.SQLOutput;

public class Jugador extends MutxamelIFC implements AccionesDeportivas{

    private Equipo categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipo categoria, int dorsal, Posiciones posiciones) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posiciones = posiciones;

    }

    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " esta entrenando.");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " esta entrenando.");
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " se esta conecntrando.");
    }

    @Override
    public void viajes(String ciudad) {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " esta viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {

    }
}
