package Pistas_deporivas;

public class Padel extends Pista{

    private String paredes;

    public Padel (String tipo, int identificador, String paredes) {
        super(tipo, identificador);
        this.paredes = paredes;
    }

    public String getParedes() {
        return paredes;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    @Override
    public String toString() {
        return "Padel{" +
                "paredes='" + paredes + '\'' +
                '}';
    }

}