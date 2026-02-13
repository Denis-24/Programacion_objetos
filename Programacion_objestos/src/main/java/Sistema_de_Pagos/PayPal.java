package Sistema_de_Pagos;

import Tenis.Partido;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PayPal extends MetodoPago{
    private static final String FROMATO_CUENTA = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.com$";

    private String cuenta;
    private double saldo;

    public PayPal(String cuenta){
        this.cuenta = cuenta;
        saldo = 23;
    }



    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con PayPal");
    }


    public boolean validarPayPal(){
        if (cuenta.matches(FROMATO_CUENTA)){
            return true;
        }else {
            return false;
        }
    }
}
