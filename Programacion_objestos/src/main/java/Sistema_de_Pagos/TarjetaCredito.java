package Sistema_de_Pagos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TarjetaCredito extends MetodoPago{
    private final int tamanyo_tarjeta = 16;

    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito(String nro_tarjeta, String tipo){
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo.toUpperCase();
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo);
        System.out.println("....");
        System.out.println("Pago realizado con exito, muchas gracias por su compra.");
    }



}
