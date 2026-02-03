package Practica_1;

import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, int temporadas){
        this.nombre= nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        listaEmpleados  = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        director = new Empleado();

    }
}
