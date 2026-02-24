package Practica2;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Jugador extends MutxamelIFC implements AccionesDeportivas{

    private Equipo categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipo categoria, int dorsal, Posiciones posiciones, ArrayList<MutxamelIFC>listaMiembros) {
        super(nombre, edad);
        this.categoria = categoria;
        setDorsal(dorsal, listaMiembros);
        this.posiciones = posiciones;

    }



    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " que juega en la posicion" + posiciones +  " esta entrenando.");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " que juega en la posicion, esta entrenando.");
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " que juega en la posicion, se esta conecntrando.");
    }

    @Override
    public void viajes(String ciudad) {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " que juega en la posicion, esta viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " que juega en la posicion " + posiciones + " esta celebrando el gol...");
    }

    public void setDorsal(int dorsal, ArrayList<MutxamelIFC>listaMiembros) {
        for ()
    }
}
