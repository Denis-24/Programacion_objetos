package Practica2;

public class Acompañante extends MutxamelIFC{

    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println("El acompalante esta animando al equipo.");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se han concentrado con el el quipo.");
    }

    @Override
    public void viajes(String ciudad) {
        System.out.println("El acompañante " + getNombre() + " esta vianjando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El acompañante " + getNombre() + " esta celebrando el gol.");
    }
}
