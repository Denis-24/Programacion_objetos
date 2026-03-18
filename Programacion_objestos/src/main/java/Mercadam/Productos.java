package Mercadam;

public enum Productos {
    MANZANAS(2.30),PAN(1.0),ARROZ(3.50),POLLO(4.30),LECHE(1.30),ACEITE(8.30),HUEVOS(3.30),TOMATES(4.0),PASTA(0.89);

    final private double precio;

    Productos(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
