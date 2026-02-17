package Interfaces;

public class Spiderman extends Superheroes implements Volador{

    @Override
    public void volar() {
        System.out.println("Columpiadno con las telarañas...");
    }
}
