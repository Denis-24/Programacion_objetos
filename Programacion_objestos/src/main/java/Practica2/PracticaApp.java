package Practica2;

import java.util.ArrayList;

public class PracticaApp {

    static ArrayList<MutxamelIFC>listaMembros = new ArrayList<>();
    static ArrayList<Jugador>listaJugadores = new ArrayList<>();

    static void main(String[] args) {

        Jugador j1 = new Jugador("Denis",19,Equipo.SENIOR,10,Posiciones.CENTROCAMPISTA, listaMembros);
        Jugador j2 = new Jugador("Angel",19,Equipo.SENIOR,18,Posiciones.DELANTERO, listaMembros);
        Jugador j3 = new Jugador("Jacobo",50,Equipo.SENIOR,1,Posiciones.PORTERO, listaMembros);

        listaJugadores.add(j1);
        listaJugadores.add(j2);
        listaJugadores.add(j3);



    }
}
