package Abuelos;

import java.util.ArrayList;

public class AutobusImserso {


    private String matricula;
    private String destino;
    private  ArrayList<Abuelo> listaAbuelos;

    public AutobusImserso(String matricula, String destino){
        this.matricula=matricula;
        this.destino=destino;
        listaAbuelos= new ArrayList<>();

    }

    public void mostrarAuelos(){
        System.out.println("Abuelos del autobus con matricual " + matricula + ": ");
        for (Abuelo abuelo : listaAbuelos){
            System.out.println("- " + abuelo.getNombre() + " de " + abuelo.getEdad() + " años ");
        }
    }

    public void mostrarMayores(int edad){

        System.out.println("Abelos mayores a " + edad + " años: ");

        for (Abuelo abuelo : listaAbuelos){
            if (abuelo.getEdad()>edad){
                System.out.println("- " + abuelo.getNombre() + " de " + abuelo.getEdad() + " años ");
            }
        }
    }

    public void insertarAbuelo(Abuelo abuelo){
        listaAbuelos.add(abuelo);
    }

    public void eliminarAbuelo(Abuelo abuelo){
        listaAbuelos.remove(abuelo);
    }


    public ArrayList<Abuelo> getListaAbuelos() {
        return listaAbuelos;
    }

    public void setListaAbuelos(ArrayList<Abuelo> listaAbuelos) {
        this.listaAbuelos = listaAbuelos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


    @Override
    public String toString() {
        return "AutobusImserso{" +
                "matricula='" + matricula + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
