package Pistas_deporivas;

public class Tenis extends Pista {

    private String superficie;

    public Tenis (String tipo, int identificador, String superficie) {
        super(tipo, identificador);
        this.superficie = superficie;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "superficie='" + superficie + '\'' +
                '}';
    }

}