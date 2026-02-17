package Interfaces;

import java.util.ArrayList;

public class VoladoresApp {
    static void main(String[] args) {
        Superman s1 = new Superman();
        Pajaros p1 = new Pajaros();

        s1.volar();
        p1.volar();
        s1.rayoLaser();
        s1.alientoHelado();
        Spiderman sp1 = new Spiderman();
        ArrayList<Superheroes>listaSuper = new ArrayList<>();

        listaSuper.add(s1);
        listaSuper.add(sp1);

        for (Superheroes superheroes : listaSuper){
            if (superheroes instanceof Superman){
                ((Superman) superheroes).alientoHelado();
                ((Superman) superheroes).rayoLaser();
            }
        }
    }
}
