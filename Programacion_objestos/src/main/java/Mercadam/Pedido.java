package Mercadam;

import java.util.HashMap;

public class Pedido {
    private HashMap<Productos,Integer> pedido;
    private double importeTotal;

    public Pedido(HashMap<Productos, Integer> pedido, double importeTotal) {
        this.pedido = pedido;
        this.importeTotal = importeTotal;
    }

    public void actualizarImporteTotal(double importe){

    }

    public void aplicarPromo3x2(){

    }

    public void aplicarPromo10(){

    }

}
