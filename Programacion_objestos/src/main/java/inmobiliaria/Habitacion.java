package inmobiliaria;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metros;
    private ArrayList<Electrodomesticos> listaElectrodomesticos;


    public Habitacion(String nombre, double metros){
        this.nombre=nombre;
        this.metros=metros;
        listaElectrodomesticos = new ArrayList<>();
    }

    public void crearElectrodomesticos(String nombre, double consumo){
        for (Electrodomesticos electrodomesticos : listaElectrodomesticos){
            if (electrodomesticos.getNombre().equals(nombre)){
                System.out.println("El electrodomestico " + nombre + " ya esta creado");
                return;
            }
        }
        Electrodomesticos electrodomestico = new Electrodomesticos(nombre,consumo);
        listaElectrodomesticos.add(electrodomestico);
        System.out.println("El electrodomestico " + nombre + " ha sido creado");
    }

    public void mostrarElectrodomesticos(){
        for (Electrodomesticos electrodomestico : listaElectrodomesticos){
            System.out.println("- " + electrodomestico.getNombre() + " con un cosumo de " + electrodomestico.getConsumo() + "kWh");
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }


    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                ", listaElectrodomesticos=" + listaElectrodomesticos +
                '}';
    }
}
