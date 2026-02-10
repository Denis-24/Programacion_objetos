package Carrefour;

import java.util.ArrayList;
import java.util.Scanner;

public class Seguridad extends Persona{
    static Scanner teclado = new Scanner(System.in);

    private String empresa;
    private ArrayList<String>armas;



    public Seguridad(String nombre, double sueldo, int codigo) {
        super(nombre, sueldo, codigo);
        armas = new ArrayList<>();
        setEmpresa();

    }

    public void anyadirArmas(String objeto){
        armas.add(objeto);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa() {
        System.out.println("Introduce la empresa de la cual proviene el segurata: ");
        empresa = teclado.next();
    }

    public ArrayList<String> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<String> armas) {
        this.armas = armas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El segurata trabaja viene  de la empresa " + empresa + " y tiene de armas: ");
        for (String arma : armas){
            System.out.println(arma);
        }
    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "empresa='" + empresa + '\'' +
                ", Armas=" + armas +
                '}';
    }
}
