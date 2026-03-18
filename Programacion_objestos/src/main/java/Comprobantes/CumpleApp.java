package Comprobantes;

import java.security.KeyStore;
import java.util.*;

public class CumpleApp {

    static void main(String[] args) {
        List<Invitado> invitados = new ArrayList<>();

        invitados.add(new Invitado("Denis",10));
        invitados.add(new Invitado("Angel",20));
        invitados.add(new Invitado("Eric",17));

        Collections.sort(invitados, new OrdenarPorEdadNombreHora().reversed());
        System.out.println(invitados);

        TreeMap<Invitado,String> mapInvitados = new TreeMap<>();

        mapInvitados.put(new Invitado("jacobo",15),"Raqueta de padel");
        mapInvitados.put(new Invitado("Joaquin",20),"Portatil");
        mapInvitados.put(new Invitado("David",17),"Camiseta");


        List<Map.Entry<Invitado,String>> listaMapa = new ArrayList<>(mapInvitados.entrySet());

        listaMapa.sort(Map.Entry.comparingByValue());

        for (Map.Entry<Invitado,String>mapita : listaMapa){
            System.out.println(mapita.getKey().getNombre() + " "  + mapita.getValue());
        }


    }
}
