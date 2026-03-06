package Colecciones;

import java.util.*;

public class Pruebas_SET {
    static void main(String[] args) {

        String maelantes[] = {"Joaquin", "Christian", "Carlos","Carlos","Angel","Kevin","Eric","David g"};

        HashSet<String>normal = new HashSet<>(Arrays.asList(maelantes));
        LinkedHashSet<String>respeta_add = new LinkedHashSet<>(Arrays.asList(maelantes));
        TreeSet<String>ordena = new TreeSet<>(Arrays.asList(maelantes));

        System.out.println(normal);
        System.out.println(respeta_add);
        System.out.println(ordena);




    }
}
