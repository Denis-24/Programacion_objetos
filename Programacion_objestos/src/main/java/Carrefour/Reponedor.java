package Carrefour;

import java.util.Scanner;

public class Reponedor extends Persona{
    static Scanner teclado = new Scanner(System.in);

    private String pasillo;

    public Reponedor(String nombre, double sueldo, int codigo, String pasillo) {
        super(nombre, sueldo, codigo);
        this.pasillo = pasillo;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;

    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Reponedor que trabaja en el pasillo: " + pasillo);
    }

    @Override
    public void trabajar() {
        System.out.println("Recogiendo cajas...");
    }

    @Override
    public String toString() {
        return "Reponedor{" +
                "pasillo='" + pasillo + '\'' +
                '}';
    }
}
