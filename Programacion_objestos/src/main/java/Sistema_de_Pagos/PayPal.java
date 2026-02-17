package Sistema_de_Pagos;

import Tenis.Partido;
import lombok.Getter;
import lombok.Setter;

import java.sql.SQLOutput;

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
        if(saldo < importe){
            System.out.println("**ERROR**");
            System.out.println("Motivo:");
            System.out.println("Saldo insuficiente: " + saldo+ "€");
            System.out.println("El importe a pagar es de " + importe + "€");
            System.out.println("Te flatan: " + (importe-saldo)+ "€");
        }else {
            System.out.println("Procesando pago de " + importe + "€ con PayPal");
            System.out.println("....");
            System.out.println("Pago realizado con exito, muchas gracias por su compra.");
        }
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return valida que el formato del el correo de la cuenta de paypal introducido es correcto
     */
    public boolean validarPayPal(){
        if (cuenta.matches(FROMATO_CUENTA)){
            return true;
        }else {
            return false;
        }
    }
}
