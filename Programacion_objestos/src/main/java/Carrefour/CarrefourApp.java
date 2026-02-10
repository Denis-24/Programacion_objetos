package Carrefour;

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
    }
}
