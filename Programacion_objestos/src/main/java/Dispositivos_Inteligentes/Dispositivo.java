package Dispositivos_Inteligentes;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Dispositivo {
    private String nombre;
    protected boolean estado;

    public  Dispositivo(String nombre, boolean estado){
        this.nombre = nombre;
        this.estado = estado;
    }

    public abstract void encender();
    public void apagar(){
        if (estado == true){
            System.out.println("El dispositivo " + getNombre() + " apagado");
            setEstado(false);
        }else {
            System.out.println("El dispositivo " + getNombre() + " ya esta apagado");
        }
    }

    public void mostrarEstado(){
        if (estado == true){
            System.out.println("Encendidio");
        }else {
            System.out.println("Apagado");
        }
    }
}
