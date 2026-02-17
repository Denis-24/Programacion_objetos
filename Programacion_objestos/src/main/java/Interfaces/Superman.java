package Interfaces;

public class Superman extends Superheroes implements Volador, Ataques{

    @Override
    public void volar() {
        System.out.println("Sobrevolando por la ciudad y vigilando a los villanos.");
    }

    @Override
    public void rayoLaser() {
        System.out.println("Disparando laser por los ojos...");
    }

    @Override
    public void alientoHelado() {
        System.out.println("Escupiendo hielo...");
    }
}
