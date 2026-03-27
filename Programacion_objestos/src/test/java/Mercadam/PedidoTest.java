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

}