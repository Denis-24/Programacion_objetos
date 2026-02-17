package Sistema_de_Pagos;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

@Getter @Setter
public class Bizum extends MetodoPago{
    static Scanner teclado = new Scanner(System.in);
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
        System.out.println("....");
        System.out.println("Pago realizado con exito, muchas gracias por su compra.");
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return genera automaticamente un pin
     */
    public void setPin() {
        for (int i = 0; i < MAX; i++) {
            generadorpin+=aleatorio.nextInt(0,10);
        }
        pin = Integer.parseInt(generadorpin);
    }

    public int chivatoPin(){
        return pin;
    }
}
