package Sistema_de_Pagos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TarjetaCredito extends MetodoPago{

    private String nro_tarjeta;
    private String tipo;

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo);
    }

    public String validarTarjeta(){
        if (){
            return
        }else {

        }
    }
}
