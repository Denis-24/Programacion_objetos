package Practica_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {
    static Scanner teclado = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fecha;
    private int temporada;


    public Invitado(String nombre, String profesion,LocalDate fecha, int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        setFecha(fecha);
        this.temporada = temporada;
    }


    public int anyo(){
        System.out.println("En que año tines el programa?");
        int anyo  = teclado.nextInt();
        return anyo;
    }
    public int mes(){
        System.out.println("En que mes tienes el programa");
        int mes = teclado.nextInt();
        return mes;
    }
    public int dia(){
        System.out.println("En que dia tienes el programa");
        int dia = teclado.nextInt();
        return dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha=" + fecha +
                ", temporada=" + temporada +
                '}';
    }
}
