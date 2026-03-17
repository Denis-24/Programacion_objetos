package Pistas_deporivas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PistaApp {
    static Scanner teclado = new Scanner(System.in);
    static HashMap<Usuario,HashSet<Reservas>> mapita = new HashMap<>();
    static void main(String[] args) {


    }

    public static void eliminar(HashSet<Reservas>listaReservas){
        System.out.println("Que tipo de pistas quieres borrar?");
        String tipo = teclado.nextLine();

        Iterator<Reservas> it = listaReservas.iterator();

        while (it.hasNext()){
            Reservas reservas = it.next();
            if (reservas.getPista() instanceof Tenis && tipo.equals("tenis")){
                it.remove();
            } else if (reservas.getPista() instanceof Padel && tipo.equals("padel")) {
                it.remove();
            }


        }
    }

    public static HashSet<Reservas> busquedasUsuario(Usuario usuario){
        return mapita.get(usuario);
    }

    public static void crearReserva(Usuario usuario, Pista pista){
        Reservas reserva = new Reservas(usuario,pista);

        HashSet<Reservas> lista = busquedasUsuario(usuario);
        if (lista.contains(reserva)){
            throw new ReservaDuplicada();
        }else {
            lista.add(reserva);
            mapita.put(usuario,lista);
        }
    }

}
