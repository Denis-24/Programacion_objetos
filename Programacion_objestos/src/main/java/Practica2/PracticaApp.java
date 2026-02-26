package Practica2;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticaApp {
    static int num = 0;
    static int contador = 0;
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<MutxamelIFC> listaMiembros = new ArrayList<>();
    static ArrayList<Jugador>listaJugadores = new ArrayList<>();

    public static String mantenimineto(){
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
    public static String  manteniminetoJugadores(){
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
        return opcionjugador.toUpperCase();
    }

    public static int preguntaJugador(){
        System.out.println("=== Mantenimiento de Jugadores. Mopdificar datos del jugador existente");
        System.out.println();
        System.out.println("¿De que jugador quieres hacer cambios?");
        for (Jugador jugador : listaJugadores){
            System.out.print("[" + contador + "]. ");
            jugador.mostrarInfo();
            ++contador;
        }
        System.out.println();
        System.out.println("======================================================================================");
        System.out.println();
        System.out.print("Selecciona una opcion --> ");
        int opcionMod = teclado.nextInt();
        num = opcionMod;
        return opcionMod;
    }

    //Pregunto el primer menu y se activa el opciones 2 que es el de preguntar que hacer con el jugador
    public static void opciones(){
        switch (mantenimineto()){
            case "1":
                opciones2();
                break;
            case "X":

                break;
        }
    }

    //en el preguntar que hacer con el jugador miro lo que me introduce y dependiendo
    public static void opciones2(){
        switch (manteniminetoJugadores()){
            case "1":
                Jugador je = new Jugador(preguntarNombre(),preguntarEdad(),preguntarEquipo(),preguntarDorsal(),preguntarPosiciones(),listaMiembros);
                listaJugadores.add(je);
                listaMiembros.add(je);
                System.out.println("El jugador " + je + " ha sido creado...");
            case "2":
                cambiarJugador(preguntaCambio());
                break;
            case "3":
                Acompañante ae = new Acompañante(preguntarAcompanyanteNombre(),preguntarAcompanyanteEdad(),preguntarAcompanyanteIntegrante(),preguntarAcompanyanteParentesco());
                listaMiembros.add(ae);
                System.out.println("El acompañante " + ae.getNombre() + " ha sido creado como " + ae.getParentesco() + " del jugador " + ae.getIntegrante().getNombre());
                break;
            case "X":
                opciones();
                break;
        }
    }

    public static void cambiarJugador(String opcionCmabio){
       switch (opcionCmabio){
           case "nombre":
               preguntarNuevoNombre();
               break;
           case "edad":
               preguntarNuevaEdad();
               break;
           case "equipo":
               preguntarNuevoEquipo();
               break;
           case "dorsal":
               preguntarNuevoDorsal();
               break;
           case "posicion":
               preguntarNuevoPosiciones();
               break;
           default:
               System.out.println("Opcion elegida invalida...");
               break;
       }
    }
    public static String preguntaCambio(){
        System.out.print("Modificando jugador: ");
        listaJugadores.get(preguntaJugador()).mostrarInfo();
        System.out.println();
        System.out.println("¿Que quieres modificar? [nombre,edad,categoria,dorsal,posicion]:");
        System.out.println();
        System.out.println("======================================================================================");
        System.out.println();
        System.out.print("Seleciona una opcion --> ");
        String opcionCambio = teclado.next();
        return opcionCambio;
    }
    public static void preguntarNuevoNombre(){
        System.out.println();
        System.out.println("Introduce el nuevo nombre del jugador " + listaJugadores.get(num).getNombre());
        String nombre = teclado.next();
        System.out.println("....");
        System.out.println("El nombre del jugador "  + listaJugadores.get(num).getNombre() + " ha sido cambiado a " + nombre);
        listaJugadores.get(num).setNombre(nombre);
    }
    public static void preguntarNuevaEdad(){
        System.out.println();
        System.out.println("Introduce la nueva edad del jugador " + listaJugadores.get(num).getNombre());
        int edad = teclado.nextInt();
        listaJugadores.get(num).setEdad(edad);
        System.out.println("....");
        System.out.println("La edad del jugador "  + listaJugadores.get(num).getNombre() + " ha sido cambiado a " + edad);
    }

    public static void preguntarNuevoPosiciones(){
        System.out.println();
        System.out.println("Introduce la nueva posicion del jugador " + listaJugadores.get(num).getNombre());
        Practica2.Posiciones posiciones = Posiciones.valueOf(teclado.next());
        listaJugadores.get(num).setPosiciones(posiciones);
        System.out.println("....");
        System.out.println("La posicion del jugador "  + listaJugadores.get(num).getNombre() + " ha sido cambiado a " + posiciones);
    }
    public static void preguntarNuevoEquipo(){
        System.out.println();
        System.out.println("Introduce el nuevo equipo del jugador " + listaJugadores.get(num).getNombre());
        Equipo equipo = Equipo.valueOf(teclado.next());
        listaJugadores.get(num).setCategoria(equipo);
        System.out.println("....");
        System.out.println("La posicion del jugador "  + listaJugadores.get(num).getNombre() + " ha sido cambiado a " + equipo);
    }
    public static void preguntarNuevoDorsal(){
        System.out.println();
        System.out.println("Introduce el nuevo dorsal del jugador " + listaJugadores.get(num).getNombre());
        int dorsal = teclado.nextInt();
        listaJugadores.get(num).setDorsal(dorsal,listaMiembros,listaJugadores.get(num).getCategoria());
        System.out.println("....");
        System.out.println("El dorsal del jugador "  + listaJugadores.get(num).getNombre() + " ha sido cambiado a " + dorsal);
    }


    public static String preguntarNombre(){
        System.out.println();
        System.out.println("Introduce el nombre del jugador ");
        String nombre = teclado.next();
        return nombre;
    }
    public static int preguntarEdad(){
        System.out.println();
        System.out.println("Introduce la edad del jugador ");
        int edad = teclado.nextInt();
        return edad;
    }
    public static Equipo preguntarEquipo(){
        System.out.println();
        System.out.println("Introduce el equipo del jugador ");
        Equipo equipo = Equipo.valueOf(teclado.next());
        return equipo;
    }
    public static int preguntarDorsal(){
        System.out.println();
        System.out.println("Introduce el dorsal del jugador ");
        int dorsal = teclado.nextInt();
        return dorsal;
    }
    public static Posiciones preguntarPosiciones(){
        System.out.println();
        System.out.println("Introduce la posicion del jugador ");
        Practica2.Posiciones posiciones = Posiciones.valueOf(teclado.next());
        return posiciones;
    }

    public static String preguntarAcompanyanteNombre(){
        System.out.println();
        System.out.println("Introduce el nombre del Acompañante");
        String nombre = teclado.next();
        return nombre;
    }
    public static int preguntarAcompanyanteEdad(){
        System.out.println();
        System.out.println("Introduce la edad del acompañante");
        int edad = teclado.nextInt();
        return edad;
    }
    public static Jugador preguntarAcompanyanteIntegrante(){
        System.out.println("Introduce a tu integrante");
        for (Jugador jugador : listaJugadores){
            System.out.print("[" + contador + "]. ");
            jugador.mostrarInfo();
            ++contador;
        }
        int opcionMod = teclado.nextInt();
        num = opcionMod;
        Jugador integrante = listaJugadores.get(num);
        return integrante;
    }
    public static String preguntarAcompanyanteParentesco(){
        System.out.println();
        System.out.println("Cual es tu parentesco con este jugador?");
        String parentesco = teclado.next();
        return parentesco;
    }


    static void main(String[] args) {

        Jugador j1 = new Jugador("Denis",19,Equipo.SENIOR,10,Posiciones.CENTROCAMPISTA, listaMiembros);
        Jugador j2 = new Jugador("Angel",19,Equipo.SENIOR,18,Posiciones.DELANTERO, listaMiembros);
        Jugador j3 = new Jugador("Jacobo",50,Equipo.SENIOR,1,Posiciones.PORTERO, listaMiembros);
        Entrenador e1 = new Entrenador("Adrian",30,Equipo.SENIOR,"4-3-3");
        Masajista m1 = new Masajista("Javi",29);
        Acompañante a1 = new Acompañante("Roberto",30,j2,"Amigos");
        Acompañante a2 = new Acompañante("Laura",56,j2,"Madre");

        listaMiembros.add(e1);
        listaMiembros.add(m1);
        listaMiembros.add(a1);
        listaMiembros.add(a2);

        listaJugadores.add(j1);
        listaJugadores.add(j2);
        listaJugadores.add(j3);
        listaMiembros.add(j1);
        Jugador j4 = new Jugador("Eric",21,Equipo.SENIOR,10,Posiciones.DEFENSA, listaMiembros);

        j1.mostrarInfo();
        j4.mostrarInfo();

//        opciones();

        for (MutxamelIFC miembro : listaMiembros){
            System.out.println();
            miembro.concentrarse();
            if (miembro instanceof AccionesDeportivas){
                ((AccionesDeportivas) miembro).entrenar();
                ((AccionesDeportivas) miembro).jugarPartido("Barsa");
            } else if (miembro instanceof Masajista) {
                ((Masajista) miembro).darMasajes(j1);
            }
            miembro.viajes("Madrid");
            System.out.println();
        }
    }
}
