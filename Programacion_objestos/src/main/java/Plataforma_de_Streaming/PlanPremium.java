package Plataforma_de_Streaming;

public class PlanPremium extends Suscripcion{

    public PlanPremium(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en alta definición y descargas offline.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("14 días de prueba gratuita");
    }
}
