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


    public void darMasajes(){
        System.out.println();
    }


    @Override
    public void concentrarse() {
        System.out.println("El equipo se ha concentrado.");
    }

    @Override
    public void viajes(String ciudad) {

    }

    @Override
    public void celebrarGol() {

    }
}
