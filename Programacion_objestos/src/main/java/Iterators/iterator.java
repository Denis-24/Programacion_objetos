package Iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class iterator {

    static void main(String[] args) {


        TreeSet<String> lista = new TreeSet<>();
        lista.add("Pikachu");
        lista.add("Charmander");
        lista.add("Squirtle");
        lista.add("Bulbasur");
        lista.add("Magikarp");

//        for (String pokemon : lista){
//            if (pokemon.equals("Pikachu")){
//                lista.remove(pokemon);
//            }
//        }
        Iterator<String>it = lista.iterator();

        while (it.hasNext()){
            String pokemon = it.next();

            if (pokemon=="Pikachu"){
                it.remove();
            }
            System.out.println(pokemon);
        }
        System.out.println(lista);


        HashMap<String,Integer>mapa = new HashMap<>();

        mapa.put("Niki Nickole",4);
        mapa.put("Hermion",7);

        Iterator<Map.Entry<String,Integer>> itmapita = mapa.entrySet().iterator();

        while (itmapita.hasNext()){
            Map.Entry<String,Integer> novia = itmapita.next();
            System.out.println(novia.getKey() + " ha durado " + novia.getValue() + " meses");
            if (novia.getKey().equals("Hermion")){
                itmapita.remove();
            }
        }










    }
}
