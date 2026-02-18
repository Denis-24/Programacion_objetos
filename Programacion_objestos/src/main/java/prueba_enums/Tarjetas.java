package prueba_enums;

public enum Tarjetas {
    visa(0), mestro(1.5), mastercard(5);

    private  final double comision;


    Tarjetas(double comision){
        this.comision = comision;
    }


    public double getComision() {
        return comision;
    }
}
