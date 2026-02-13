package Sistema_de_Pagos;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.random.RandomGeneratorFactory;

@Getter @Setter
public class Bizum extends MetodoPago{
    private static final int MAX = 6;
    private String generadorpin = "";
    static Random aleatorio = new Random();

    private String telefono;
    private int pin;

    public Bizum(String telefono){
        this.telefono = telefono;
        setPin();
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Bizum");
    }


    public void setPin() {
        for (int i = 0; i < MAX; i++) {
            generadorpin+=aleatorio.nextInt(0,10);
        }
        pin = Integer.parseInt(generadorpin);
    }

    public boolean validarBizum(){
        if (telefono.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")){
            return true;
        }else {
            return false;
        }
    }
}
