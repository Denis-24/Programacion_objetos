package Practica2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Masajista extends MutxamelIFC{
    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad) {
        super(nombre, edad);
    }


    public void darMasajes(Jugador jugador){
        System.out.println("El masajista " + getNombre() + " esta dando un masaje al jugador " + jugador.getNombre());
    }


    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + " se esta concentrando");
    }

    @Override
    public void viajes(String ciudad) {
        System.out.println("El masajista " + getNombre() + " esta viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El masajista " + getNombre() + " esta celebrando el gol...");
    }
}
