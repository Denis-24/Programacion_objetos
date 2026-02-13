package Sistema_de_Pagos;

import java.util.Scanner;

public class Tienda{
    static Scanner teclado = new Scanner(System.in);

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
                TarjetaCredito t1 = new TarjetaCredito(pregntanumTarjeta(),preguntaTipoTajeta());
                realizarPago(t1);
                break;
            case "paypal":
                PayPal p1 = new PayPal(cuentaPayPal());
                realizarPago(p1);
                break;
            case "bizum":
                Bizum b1 = new Bizum(preguntaTelBizum());
                realizarPago(b1);
                break;
            default:
                System.out.println("Valor introducido incorrecto...");
        }
    }

    public static String pregntanumTarjeta(){
        System.out.println("Cual es el numero de tu tarjeta");
        String num = teclado.nextLine();
        return num;
    }
    public static String preguntaTipoTajeta(){
        System.out.println("Introduce el tipo de tajeta");
        String tipo = teclado.nextLine();
        return tipo;
    }

    public static String cuentaPayPal(){
        System.out.println("Introduce tu cuenta de PayPal");
        String cuenta = teclado.nextLine();;
        return cuenta;
    }

    public static String preguntaTelBizum(){
        System.out.println("Introduce tu numero de telefono.");
        String tel = teclado.nextLine();
        return tel;
    }




}
