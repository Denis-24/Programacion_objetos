package Iterators;

import Colecciones.Presidentes;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iteradores_objetos {
    static void main(String[] args) {

<<<<<<< HEAD
        ArrayList<Presidentes> lista = new ArrayList<>(Arrays.asList(new Presidentes("Donald Trump","USA"),
                new Presidentes("Benja Netanyahu","ISRAEL"),
                new Presidentes("Pedro Sanchez","España")));
        Iterator<Presidentes> it = lista.iterator();

        while (it.hasNext()){
            Presidentes presi = it.next();

            if (presi.getNombre().equals("Benja Netanyahu")){
                it.remove();
            }
        }
        System.out.println(lista);

=======
//        ArrayList<Presidentes> lista = new ArrayList<>(Arrays.asList(new Presidentes("Donald Trump","USA"),
//                new Presidentes("Benja Netanyahu","ISRAEL"),
//                new Presidentes("Pedro Sanchez","España")));
//        Iterator<Presidentes> it = lista.iterator();
//
//        while (it.hasNext()){
//            Presidentes presi = it.next();
//
//            if (presi.getNombre().equals("Benja")){
//                it.remove();
//            }
//        }
//        System.out.println(lista);
//
>>>>>>> 0e875a708b59e07d6e9471ff89c701cdc6593e28









    }
}
