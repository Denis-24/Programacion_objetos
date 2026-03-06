package Colecciones;

public class Presidentes_App {
    static void main(String[] args) {
        Presidentes trump = new Presidentes("Donal Trump","USA");
        System.out.println(trump.hashCode());
        Presidentes milei = new Presidentes("Donal Trump","USA");
        System.out.println(milei.hashCode());

        if (trump.equals(milei)){
            System.out.println("Son iguales");
        }
    }
}
