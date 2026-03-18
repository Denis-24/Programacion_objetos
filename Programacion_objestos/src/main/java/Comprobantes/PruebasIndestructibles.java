package Comprobantes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebasIndestructibles {
    static List<Integer> lista = new ArrayList<>();
    static void main(String[] args) {
        lista.add(234);
        lista.add(21);
        System.out.println(getlista());

    }
    public static List<Integer> getlista(){

        return Collections.unmodifiableList(lista);
    }
}
