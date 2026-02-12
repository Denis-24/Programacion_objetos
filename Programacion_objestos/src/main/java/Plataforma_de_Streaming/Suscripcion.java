package Plataforma_de_Streaming;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Suscripcion {
    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio){
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("El nombre del plan es: " + nombrePlan);
        System.out.println("El precio del plan es: " + precio + "€");
    }

    public abstract void obtenerBeneficios();
    public abstract void obtenerPeriodoPrueba();
}
