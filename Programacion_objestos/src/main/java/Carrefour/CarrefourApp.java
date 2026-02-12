package Carrefour;

import java.util.ArrayList;

public class CarrefourApp {
    static void main(String[] args) {
        Cajero jorge = new Cajero("jorge",1800,147);

        jorge.mostrarInfo();
        System.out.println();

        Reponedor raul = new Reponedor("Raul",10,000,"Fondo deleta");

        raul.mostrarInfo();

        Seguridad angel = new Seguridad("Angel", 100,001);

        angel.anyadirArmas("Porra");
        angel.anyadirArmas("Taser");
        angel.anyadirArmas("Esposas");

        angel.mostrarInfo();

        Persona manuel = new Cajero("manuel",2000,123);

        ArrayList<Persona> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(manuel);
        listaEmpleados.add(raul);

        for (Persona persona : listaEmpleados){
            System.out.println(persona);
        }
        fichar(manuel);
        fichar(raul);

        jorge.trabajar();
        raul.trabajar();
        angel.trabajar();





    }
    public static void fichar(Persona persona){
        System.out.println("Fichando...");
    }
}
