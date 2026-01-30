package Tenis;

public class Set {
    private int puntosj1;
    private int puntosj2;

    public Set(int puntosj1, int puntosj2){
        this.puntosj1 = puntosj1;
        this.puntosj2 = puntosj2;
    }


    public int getPuntosj1() {
        return puntosj1;
    }

    public void setPuntosj1(int puntosj1) {
        this.puntosj1 = puntosj1;
    }

    public int getPuntosj2() {
        return puntosj2;
    }

    public void setPuntosj2(int puntosj2) {
        this.puntosj2 = puntosj2;
    }

    @Override
    public String toString() {
        return "Set{" +
                "puntosj1=" + puntosj1 +
                ", puntosj2=" + puntosj2 +
                '}';
    }
}
