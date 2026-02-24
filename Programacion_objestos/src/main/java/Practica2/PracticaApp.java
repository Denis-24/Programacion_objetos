package Practica2;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticaApp {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<MutxamelIFC> listaMiembros = new ArrayList<>();
    static ArrayList<Jugador>listaJugadores = new ArrayList<>();

    public String mantenimineto(){
        System.out.println("[1]. Mantenimineto de jugadores");
        System.out.println("    Dentro podremos añadir jugadores, modificar datos y añadir acompañantes (solo seniors).");
        System.out.println("[2]. Mantenimineto de entrenadores (añadir-modifiar-salir)");
        System.out.println("    Dentro podremos añadir entrenadores, modificar datos.");
        System.out.println("[3]. Mantenimineto de masajistas (añadir-modifiar datos-salir)");
        System.out.println("    Dentro podremos añadir masajistas, modificar datos.");
        System.out.println("[4]. consultar equipos");
        System.out.println("    Dentro se debe listar los tipos de equipos del club y elegir uno.");
        System.out.println("[X]. Salir");
        System.out.println();
        System.out.println("==================================================================================");
        System.out.println();
        System.out.print("Selecciona una opcion --> ");
        String opcionmantenimineto = teclado.next();
        return opcionmantenimineto;
    }
    public String  manteniminetoJugadores(){
        System.out.println("=== Mantenimineto de Jugadores ===");
        System.out.println("    [1]. Añadir nuevo jugador");
        System.out.println("    [2]. Modificar datos de Jugador existente");
        System.out.println("    [3]. Crear acompañante (solo seniors)");
        System.out.println("    [X]. Volver al menu principal");
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        System.out.print("Selecciona una opcion --> ");
        String opcionjugador = teclado.next();
        return opcionjugador;
    }

//    public String preguntaDatos(){
//        System.out.println("=== ");
//    }

    public void opciones(){
        switch (mantenimineto()){
            case "1":

        }
    }

    static void main(String[] args) {

        Jugador j1 = new Jugador("Denis",19,Equipo.SENIOR,10,Posiciones.CENTROCAMPISTA, listaMiembros);
        Jugador j2 = new Jugador("Angel",19,Equipo.SENIOR,18,Posiciones.DELANTERO, listaMiembros);
        Jugador j3 = new Jugador("Jacobo",50,Equipo.SENIOR,1,Posiciones.PORTERO, listaMiembros);
        Entrenador e1 = new Entrenador("Adrian",30,Equipo.SENIOR,"4-3-3");

        listaJugadores.add(j1);
        listaJugadores.add(j2);
        listaJugadores.add(j3);
        listaMiembros.add(j1);
        Jugador j4 = new Jugador("Eric",21,Equipo.SENIOR,10,Posiciones.DEFENSA, listaMiembros);

        j1.mostrarInfo();
        j4.mostrarInfo();

    }
}
