package Practica2;

public class Entrenador extends MutxamelIFC implements AccionesDeportivas{

    private Equipo equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipo equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
    }


    @Override
    public void entrenar() {
        System.out.println("El equipo se ha concentrado.");
    }

    @Override
    public void jugarPartido(String rival) {

    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajes(String ciudad) {

    }

    @Override
    public void celebrarGol() {

    }
}
