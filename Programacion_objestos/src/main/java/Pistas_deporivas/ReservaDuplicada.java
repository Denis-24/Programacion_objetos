package Pistas_deporivas;

public class ReservaDuplicada extends RuntimeException {
    public ReservaDuplicada() {
        super("No pueden haber dos reservas con la misma hora");
    }
}