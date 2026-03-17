package Comprobantes;

import java.util.*;

public class CumpleApp {

    static void main(String[] args) {
        List<Invitado> invitados = new ArrayList<>();

        invitados.add(new Invitado("Denis",10));
        invitados.add(new Invitado("Angel",20));
        invitados.add(new Invitado("Eric",17));

        Collections.sort(invitados, new OrdenarPorEdadNombreHora().reversed());
        System.out.println(invitados);

        TreeMap<Invitado,String> mapa = new TreeMap<>(Collections.reverseOrder());


    }
}
