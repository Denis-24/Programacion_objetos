package Mercadam;

import org.junit.jupiter.api.Test;

import java.util.function.ToDoubleBiFunction;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    public void importeTotalTest(){
        Pedido pedido = new Pedido();
        double importeInicial = pedido.getImporteTotal();
        pedido.actualizarImporteTotal(33.0);

        double importeFinal = pedido.getImporteTotal();

        double sumaImporteTotal = (importeInicial + importeFinal);

        assertEquals(sumaImporteTotal,importeFinal);
    }


    @Test
    public void aplicarPromo10Test(){
        Pedido pedido = new Pedido();
        pedido.actualizarImporteTotal(100);

        pedido.aplicarPromo10();
        double valorFinal = pedido.getImporteTotal();
        double valorComparable = 100 * 0.90;

        assertEquals(valorFinal,valorComparable);
    }

}