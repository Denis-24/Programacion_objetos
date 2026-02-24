package Practica2;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador extends MutxamelIFC implements AccionesDeportivas{

    static private Scanner teclado = new Scanner(System.in);

    private Equipo categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipo categoria, int dorsal, Posiciones posiciones, ArrayList<MutxamelIFC> listaMiembros) {
        super(nombre, edad);
        this.categoria = categoria;
        setDorsal(dorsal,listaMiembros, categoria);
        this.posiciones = posiciones;

    }



    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " que juega en la posicion" + posiciones +  " esta entrenando.");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " que juega en la posicion, esta entrenando.");
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " que juega en la posicion, se esta conecntrando.");
    }

    @Override
    public void viajes(String ciudad) {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " que juega en la posicion, esta viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El jugador " + getNombre() + " con el dorsal " + dorsal + " que juega en la posicion " + posiciones + " esta celebrando el gol...");
    }

    public int getDorsal() {
        return dorsal;
    }

    public Equipo getCategoria() {
        return categoria;
    }
    public int preguntaDorsal(){
        System.out.println("Introduce el numero del dorsal:");
        int dorsal1 = teclado.nextInt();
        return dorsal1;
    }

    public void setDorsal(int dorsal,ArrayList<MutxamelIFC> listaMiembros, Equipo categoria) {
        if (listaMiembros.isEmpty()){
            this.dorsal = dorsal;
            this.categoria = categoria;
        }else {
            for (MutxamelIFC miembro : listaMiembros){
                if (miembro instanceof Jugador){
                    try{
                        if (((Jugador) miembro).getDorsal() == dorsal && (((Jugador) miembro).getCategoria() == categoria)){
                            throw new DorsalValido();
                        }else {
                            this.dorsal = dorsal;
                            this.categoria = categoria;
                        }
                    } catch (DorsalValido e) {
                        System.out.println("El dorsal que has introducido ya esta en uso, por el jugador " + miembro.getNombre());
                    }
                }
            }
        }
    }

    public void mostrarInfo(){
        System.out.print(" Nombre: " + getNombre()+",");
        System.out.print(" Edad: " + getEdad()+",");
        System.out.print(" Categoria: " + categoria+ ",");
        System.out.print(" Dorsal: " + dorsal + ",");
        System.out.println("Posicion: " + posiciones);
    }
}
