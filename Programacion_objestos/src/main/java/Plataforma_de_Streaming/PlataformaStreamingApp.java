package Plataforma_de_Streaming;

import java.util.ArrayList;

public class PlataformaStreamingApp {
    static void main(String[] args) {

        ArrayList<Suscripcion>lista = new ArrayList<>();

        PlanGratis g1 = new PlanGratis("Gratis",0.0);
        PlanBasico b1 = new PlanBasico("Basico",9.99);
        PlanPremium p1 = new PlanPremium("Premium", 14.99);
        PlanFamiliar f1 = new PlanFamiliar("Familiar",19.99);

        lista.add(g1);
        lista.add(b1);
        lista.add(p1);
        lista.add(f1);


        for (Suscripcion suscripcion : lista){
            suscripcion.mostrarInfo();
            suscripcion.obtenerBeneficios();
            suscripcion.obtenerPeriodoPrueba();
            System.out.println();
        }









    }
}
