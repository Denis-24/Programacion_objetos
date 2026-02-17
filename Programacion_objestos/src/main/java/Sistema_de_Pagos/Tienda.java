package Sistema_de_Pagos;

import java.util.Scanner;

public class Tienda{
    static Scanner teclado = new Scanner(System.in);
    static final int MAX_TARJETA = 16;

    /**
     * @author Denis Rico
     * @version 1.0
     * @return pregunta por el imporque que vas a pagar despues de introducir el metodo de pago selecionado aanteriormente
     */
    public static void realizarPago(MetodoPago metodo){
        System.out.println("Introduce el importe a pagar");
        double importe = teclado.nextDouble();

        metodo.procesarPago(importe);
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return llama al metodo casos que donde se inicia todo con las preguntas y despues dependiendo del metodo elegido hara una u otras cosas
     */
    public static void iniciarPago(){
        casos();

    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return imprime los tiopos de metodos de pago
     */
    public static String preguntasMetodo(){
        System.out.println("***Metodos de pago***");
        System.out.println("[1]-> Taejeta.");
        System.out.println("[2]-> PayPal.");
        System.out.println("[3]-> Bizum.");
        System.out.println("----------------");
        System.out.print("El metodo que quiero usar es: ");
        String opcion = teclado.nextLine();
        return opcion.toLowerCase();
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return devuele segun el metodo de pago elegido, unas preguntas para rellenar los datos
     */
    public static void casos(){
        switch (preguntasMetodo()){
            case "tarjeta":
                TarjetaCredito t1 = new TarjetaCredito(pregntaNumTarjeta(),preguntaTipoTajeta());
                controlTarjeta(t1);
                break;
            case "paypal":
                PayPal p1 = new PayPal(cuentaPayPal());
                controlPaypal(p1);
                break;
            case "bizum":
                Bizum b1 = new Bizum(preguntaTelBizum());
                System.out.println("Chivato: " + b1.chivatoPin());
                preguntarPin();
                controlBizum(b1);
                break;
            default:
                System.out.println("Valor introducido incorrecto...");
        }
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return hace una pregunta para pedri el nuemero de tarjeta
     */
    public static String pregntaNumTarjeta(){
        System.out.println("Cual es el numero de tu tarjeta");
        String num = teclado.nextLine();
        return num;
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return pregunta el tipo de tarjeta
     */
    public static String preguntaTipoTajeta(){
        System.out.println("Introduce el tipo de tarjeta (Visa, Mastercard, MAESTRO)");
        String tipo = teclado.nextLine().toLowerCase();
        return tipo.toLowerCase();
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return controla si los datos introducios anteriormente de la tarjeta son validos
     */
    public static void controlTarjeta(TarjetaCredito t1){
        if ((t1.getTipo().equals("visa") || t1.getTipo().equals("mastercard") || t1.getTipo().equals("maestro")) && t1.getNro_tarjeta().length()== MAX_TARJETA){
            realizarPago(t1);
        }else {
            System.out.println("Los datos de tu tarjetra son incorrectos.");
        }
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return pregunta por el correo que esta asociado a la cuenta de paypal
     */
    public static String cuentaPayPal(){
        System.out.println("Introduce tu cuenta de PayPal");
        String cuenta = teclado.nextLine();;
        return cuenta;
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return controla si el formato del correo asociado anteriormente es el correcto
     */
    public static void controlPaypal(PayPal p1){
        if (p1.validarPayPal()==false){
            System.out.println("Valores introducidos incorrectos.");
        }else {
            realizarPago(p1);
        }
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return pregunta por el numero de telefono asociado al la cuenta de bizum
     */
    public static String preguntaTelBizum(){
        System.out.println("Introduce tu numero de telefono vinculado con Bizum.");
        String tel = teclado.nextLine();
        return tel;
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return pregunta por el pin secreto de la cuentaa de bizum
     */
    public static int preguntarPin(){
        System.out.println("Introduce tu PIN: ");
        int pin = teclado.nextInt();
        return pin;
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return controla el fomrato del numero de telefono y si el pin introducido son correctos
     */
    public static void controlBizum(Bizum b1){
        if ((preguntaTelBizum().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) && preguntarPin() == b1.chivatoPin()){
            realizarPago(b1);
        }else {
            System.out.println("Los datos de bizum son incorrectos.");
        }
    }



}
