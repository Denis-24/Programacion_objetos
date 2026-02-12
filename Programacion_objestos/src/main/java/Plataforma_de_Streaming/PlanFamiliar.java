package Plataforma_de_Streaming;

import java.sql.SQLOutput;

public class PlanFamiliar extends Suscripcion{

    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("7 días de prueba para cuentas nuevas");
    }
}
