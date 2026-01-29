package inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Casa {

    static Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;

    public Casa (String direccion){
        this.direccion=direccion;
        listaHabitaciones = new ArrayList<>();
        setPropietario();
    }

    public void crearHabitacion(String nombre, double metros){
        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitacion " + habitacion.getNombre() + " ya existe");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre,metros);
        listaHabitaciones.add(habitacion);
        System.out.println("Habitacion " + nombre + " creada.");
    }

    public void eliminarHabitacion(String nombre){

        for (Habitacion habitacion :listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                listaHabitaciones.remove(nombre);
                System.out.println("La habitacion " + habitacion.getNombre() + " ha sido borrado");
                return;
            }
        }
        System.out.println("La habitacion " + nombre + " no existe");

    }

    public void mostrarHabitaciones(){
        System.out.println("Casa en " + direccion + " tiene " + listaHabitaciones.size() + " habitaciones, cuyo propietario es " + propietario.getNombre());
        for (Habitacion habitacion : listaHabitaciones){
            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetros() + ") m2");
        }
    }

    public void mostrarTodosLosElectrodomesticos(){
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            System.out.println();
            System.out.println("Los electrodomesticos de la habitacion " + listaHabitaciones.get(i).getNombre() + " son: ");
            listaHabitaciones.get(i).mostrarElectrodomesticos();
        }
    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion mayor = listaHabitaciones.get(0);
        for (Habitacion habitacion : listaHabitaciones) {

            if (habitacion.getMetros() > mayor.getMetros()){
                mayor=habitacion;
            }
        }
        return mayor;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario");
        String nombrePropietario = teclado.next();
        teclado.nextLine();
        System.out.println("Introduce la edad del propietario");
        int edad = teclado.nextInt();
        teclado.nextLine();
        Propietario propietario = new Propietario(nombrePropietario,edad);
        this.propietario = propietario;
        System.out.println("Propietario " + nombrePropietario + " ha sido añadido");
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", listaHabitaciones=" + listaHabitaciones +
                ", propietario=" + propietario +
                '}';
    }
}
