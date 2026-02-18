package Juego;

import java.util.Random;

public enum Dificultad {
    FACIL(2), MEDIO(4), DIFICIL(8), EXPERTO(10);

    private final int dificultad;


    Dificultad(int dificultad) {
        this.dificultad = dificultad;
    }


    public int getMultiplicador(){
        return dificultad;
    }
}
