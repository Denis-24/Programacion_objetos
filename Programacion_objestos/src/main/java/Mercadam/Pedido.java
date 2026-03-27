package Mercadam;

import java.util.HashMap;
import java.util.Objects;

public class Pedido {
    private HashMap<Productos,Integer> pedido;
    private double importeTotal;

    public Pedido() {
        pedido = new HashMap<>();
        importeTotal = 0;
    }

    public void actualizarImporteTotal(double importe){
        importeTotal += importe;
        System.out.println("Importe total del pedido: " + importeTotal + "€");
    }

    public void aplicarPromo3x2(){

    }

    public void aplicarPromo10(){

    }

    public HashMap<Productos, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Productos, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido1 = (Pedido) o;
        return Double.compare(importeTotal, pedido1.importeTotal) == 0 && Objects.equals(pedido, pedido1.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedido, importeTotal);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pedido=" + pedido +
                ", importeTotal=" + importeTotal +
                '}';
    }
}
