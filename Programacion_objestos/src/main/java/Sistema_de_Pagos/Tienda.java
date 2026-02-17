package Sistema_de_Pagos;

import java.util.Scanner;

public class Tienda{
    static Scanner teclado = new Scanner(System.in);
    static final int MAX_TARJETA = 16;

    public static void realizarPago(MetodoPago metodo){
        System.out.println("Introduce el importe a pagar");
        double importe = teclado.nextDouble();

        metodo.procesarPago(importe);
    }

    public static void iniciarPago(){
        casos();

    }

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

    public static String pregntaNumTarjeta(){
        System.out.println("Cual es el numero de tu tarjeta");
        String num = teclado.nextLine();
        return num;
    }
    public static String preguntaTipoTajeta(){
        System.out.println("Introduce el tipo de tarjeta (Visa, Mastercard, MAESTRO)");
        String tipo = teclado.nextLine();
        return tipo.toLowerCase();
    }
    public static void controlTarjeta(TarjetaCredito t1){
        if ((preguntaTipoTajeta().equals("visa") || preguntaTipoTajeta().equals("mastercard") || preguntaTipoTajeta().equals("maestro")) && pregntaNumTarjeta().length()== MAX_TARJETA){
            realizarPago(t1);
        }else {
            System.out.println("Los datos de tu tarjetra son incorrectos.");
        }
    }


    public static String cuentaPayPal(){
        System.out.println("Introduce tu cuenta de PayPal");
        String cuenta = teclado.nextLine();;
        return cuenta;
    }
    public static void controlPaypal(PayPal p1){
        if (p1.validarPayPal()==false){
            System.out.println("Valores introducidos incorrectos.");
        }else {
            realizarPago(p1);
        }
    }


    public static String preguntaTelBizum(){
        System.out.println("Introduce tu numero de telefono vinculado con Bizum.");
        String tel = teclado.nextLine();
        return tel;
    }
    public static int preguntarPin(){
        System.out.println("Introduce tu PIN: ");
        int pin = teclado.nextInt();
        return pin;
    }
    public static void controlBizum(Bizum b1){
        if ((preguntaTelBizum().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) && preguntarPin() == b1.chivatoPin()){
            realizarPago(b1);
        }else {
            System.out.println("Los datos de bizum son incorrectos.");
        }
    }



}
