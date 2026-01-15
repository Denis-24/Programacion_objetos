package org.example;

public class introducion_objetos {

    public static void main() {
        Bocadillo pepito = new Bocadillo("pepito","normal","bacon","bigmac",10.0);

        pepito.imprimirBocatas();
        System.out.println();

        System.out.println(pepito.getNombre() + " " + pepito.getPrecio() + "€");

        Bocadillo vacio = new Bocadillo();
        System.out.println();

        vacio.setNombre("chivito");

        vacio.imprimirBocatas();









    }



}
