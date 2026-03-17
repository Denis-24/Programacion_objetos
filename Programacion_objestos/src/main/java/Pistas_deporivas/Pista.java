package Pistas_deporivas;

public abstract class Pista {

    private String tipo;
    private int identificador;

    public Pista (String tipo, int identificador) {
        this.tipo = tipo;
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pistas{" +
                "tipo='" + tipo + '\'' +
                ", identificador=" + identificador +
                '}';
    }

}