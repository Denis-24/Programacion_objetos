package Carrefour;

import java.util.Scanner;

public class Cajero extends Persona{
    static Scanner teclado = new Scanner(System.in);

    private  int caja;


    public Cajero(String nombre, double sueldo, int codigo) {
        super(nombre, sueldo, codigo);
        setCaja();
    }

    public void setCaja() {
        System.out.println("Introduce la caja registradora: ");
        caja = teclado.nextInt();
        teclado.nextLine();
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cajero que trabaja en el cajero " + caja);
    }

    public int getCaja() {
        return caja;
    }

    @Override
    public String toString() {
        return "Cajero{" +
                "caja=" + caja +
                '}';
    }

}
