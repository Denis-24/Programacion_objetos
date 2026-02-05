package Practica_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    static Scanner teclado = new Scanner(System.in);
    private static int invitadostemp = 0;
    private static int vecesInv = 0;
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, int temporadas){
        this.nombre= nombre;
        this.cadena = cadena;
        director = new Empleado(nombreDirector(),"director");
        this.temporadas = temporadas;
        listaEmpleados  = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        listaEmpleados.add(director);
    }

    public void vecesInvitados(String nombre){
        for (int i = 0; i < listaInvitados.size(); i++) {
            if (listaInvitados.get(i).equals(nombre)){
                System.out.println("");
            }
        }
    }

    public void invitadosTemporarda(int temporadas){

        System.out.println("El total de invitados son: " + invitadostemp);

        for (int i = 0; i < listaInvitados.size(); i++) {
            if (listaInvitados.get(i).getTemporada() == temporadas){
                System.out.println("El invitado " + listaInvitados.get(i).getNombre() + " con profesion " + listaInvitados.get(i).getProfesion() + " a participado en la temporada " + temporadas + " del programa " + nombre + ".");
            }
        }
    }

    public void anyadirEmpleado(Empleado empleado){
        if (listaEmpleados.contains(empleado)){
            System.out.println("Este empleado ya esta en la lista");
        }else {
            listaEmpleados.add(empleado);
            System.out.println("Se ha añadido el " + empleado.getCargo() + " llamado " + empleado.getNombre() + " a la lista.");
        }
    }

    public void anyadirInvitado(Invitado invitado){
        if (listaInvitados.contains(invitado)){
            System.out.println("El invitado ya esta en la lista.");
        }else {
            listaInvitados.add(invitado);
            System.out.println("El invitado llamado " + invitado.getNombre() + " se ha añadidio a la lista");
            invitadostemp++;
            vecesInv++;
        }
    }

    public void eliminarEmpleado(Empleado empleado){
        if (listaEmpleados.contains(empleado)){
            listaEmpleados.remove(empleado);
            System.out.println("El empleado " + empleado.getNombre() + " con el cargo " + empleado.getCargo() + " a sido eliminado de la lista.");
        }else {
            System.out.println("El empleado llamado " + empleado.getNombre() + " no se encuentra en la lista");
        }
    }

    public void eliminarInvitado(Invitado invitado){
        if (listaInvitados.contains(invitado)){
            System.out.println("El invitado llamado " + invitado.getNombre() + " a sido eliminado de la lista");
            invitadostemp--;
        }else {
            System.out.println("El invitado llamado " + invitado.getNombre() + " no se encuentra en la lista");
        }
    }




    public static Scanner getTeclado() {
        return teclado;
    }

    public static void setTeclado(Scanner teclado) {
        Programa.teclado = teclado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    private String nombreDirector(){
        System.out.println("Cual es el nombre del director del programa " + getNombre());
        String nombredir = teclado.next();
        return nombredir;
    }


    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
