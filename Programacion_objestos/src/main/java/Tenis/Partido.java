package Tenis;

import java.util.ArrayList;

public class Partido {
    private Jugador jugadorj1;
    private Jugador jugadorj2;
    private ArrayList<Set> listaDeSets;


    public Partido(Jugador jugador1, Jugador jugador2){
        listaDeSets = new ArrayList<>();
        this.jugadorj1 = jugador1;
        this.jugadorj2 = jugador2;


    }

    public void insertarSet(int puntosj1,int puntosj2){


    }


    public ArrayList<Set> getListaDeSets() {
        return listaDeSets;
    }

    public void setListaDeSets(ArrayList<Set> listaDeSets) {
        this.listaDeSets = listaDeSets;
    }

    public Jugador getJugadorj1() {
        return jugadorj1;
    }

    public void setJugadorj1(Jugador jugadorj1) {
        this.jugadorj1 = jugadorj1;
    }

    public Jugador getJugadorj2() {
        return jugadorj2;
    }

    public void setJugadorj2(Jugador jugadorj2) {
        this.jugadorj2 = jugadorj2;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "jugadorj1=" + jugadorj1 +
                ", jugadorj2=" + jugadorj2 +
                ", listaDeSets=" + listaDeSets +
                '}';
    }
}
