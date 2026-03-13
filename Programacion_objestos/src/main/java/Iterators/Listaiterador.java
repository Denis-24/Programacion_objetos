package Iterators;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.TreeSet;

public class Listaiterador {

    static void main(String[] args) {

        ArrayList<String> ias = new ArrayList<>(Arrays.asList("ChatGPT","Deepsek","Copilot","Gemini","Antigravity"));

        ListIterator<String> it = ias.listIterator();
        System.out.println(ias.size());


        while (it.hasNext()){
            System.out.println(it.nextIndex());
            String ia = it.next();
            System.out.println(it.nextIndex());
            System.out.println(ia);
        }
        System.out.println();
        while (it.hasPrevious()){
            System.out.println(it.previousIndex());
            String ia = it.previous();
            if (ia.equals("Copilot")){
                it.add("Claude");
            }
            System.out.println(it.previousIndex());
            System.out.println(ia);
        }










    }
}
