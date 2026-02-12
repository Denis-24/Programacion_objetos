package Plataforma_de_Streaming;

public class PlanGratis extends Suscripcion{

    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Sin periodo de prueba");
    }
}
