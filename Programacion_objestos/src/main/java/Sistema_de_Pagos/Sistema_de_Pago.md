# Practica 1. Practica de compra-venta de casas

## ÍNDICE
1. [Intro](https://github.com/Denis-24/Programacion_objetos/new/main/Programacion_objestos/src/main/java/Practica_1#1-intro)
2. [Estructura de clases](https://github.com/Denis-24/Programacion_objetos/new/main/Programacion_objestos/src/main/java/Practica_1#2estructura-de-clases)
  - Diagrama de clases UML
  - Codigo de PlantUML
  - Contenido de clase (.java)
3. [Programa principal](https://github.com/Denis-24/Programacion_objetos/new/main/Programacion_objestos/src/main/java/Practica_1#3-programa-principal)
4. [Pruebas](https://github.com/Denis-24/Programacion_objetos/new/main/Programacion_objestos/src/main/java/Practica_1#4-pruebas)
5. [Entrega](https://github.com/Denis-24/Programacion_objetos/new/main/Programacion_objestos/src/main/java/Practica_1#5-entregas)

## 1. Intro
> La practica consiste en una app que consiste en un sistema de pagos.

### 2.Estructura de clases
#### Diagrama de clases UML
![](media/practica_1.png)

#### Codigo de PlantUml
````
@startuml

package "Sistema_de_Pagos" {

    abstract class MetodoPago {
        + procesarPago(double importe)
    }

    class Bizum {
        - static Scanner teclado
        - static final int MAX
        - String generadorpin
        - static Random aleatorio
        - String telefono
        - int pin

        + Bizum(String telefono)
        + procesarPago(double importe)
        + setPin()
        + chivatoPin() : int
    }

    class PayPal {
        - static final String FROMATO_CUENTA
        - String cuenta
        - double saldo

        + PayPal(String cuenta)
        + procesarPago(double importe)
        + validarPayPal() : boolean
    }

    class TarjetaCredito {
        - String nro_tarjeta
        - String tipo

        + TarjetaCredito(String nro_tarjeta, String tipo)
        + procesarPago(double importe)
    }

    class Tienda {
        - static Scanner teclado
        - static final int MAX_TARJETA

        + realizarPago(MetodoPago metodo)
        + iniciarPago()
        + preguntasMetodo() : String
        + casos()
        + pregntaNumTarjeta() : String
        + preguntaTipoTajeta() : String
        + controlTarjeta(TarjetaCredito t1)
        + cuentaPayPal() : String
        + controlPaypal(PayPal p1)
        + preguntaTelBizum() : String
        + preguntarPin() : int
        + controlBizum(Bizum b1)
    }

    MetodoPago <|-- Bizum
    MetodoPago <|-- PayPal
    MetodoPago <|-- TarjetaCredito

    Tienda ..> MetodoPago
    Tienda ..> Bizum
    Tienda ..> PayPal
    Tienda ..> TarjetaCredito
}

@enduml
````
#### Contenedor de las clases (.java)
- Clase **Tienda**:
````
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
````
Link a clase [**Tienda**](https://github.com/Denis-24/Programacion_objetos/blob/main/Programacion_objestos/src/main/java/Sistema_de_Pagos/Tienda.java)

- Clase **Tarjeta de credito**:
 ````
package Sistema_de_Pagos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TarjetaCredito extends MetodoPago{

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
 ````
Link a clase [**Trajeta de credito**](https://github.com/Denis-24/Programacion_objetos/blob/main/Programacion_objestos/src/main/java/Sistema_de_Pagos/TarjetaCredito.java)

- Clase **Paypal**:
 ````
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


    public boolean validarPayPal(){
        if (cuenta.matches(FROMATO_CUENTA)){
            return true;
        }else {
            return false;
        }
    }
}
````
Link a clase [**PayPal**](https://github.com/Denis-24/Programacion_objetos/blob/main/Programacion_objestos/src/main/java/Sistema_de_Pagos/PayPal.java)

- Clase **Bizum**:
 ````
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
````
Link a clase [**Bizum**](https://github.com/Denis-24/Programacion_objetos/blob/main/Programacion_objestos/src/main/java/Sistema_de_Pagos/Bizum.java)

- Clase **Metodo de pago**:
 ````
package Sistema_de_Pagos;

public abstract class MetodoPago {


    public abstract void procesarPago(double importe);


}
````
Link a clase [**Metodo de pago**](https://github.com/Denis-24/Programacion_objetos/blob/main/Programacion_objestos/src/main/java/Sistema_de_Pagos/MetodoPago.java)

### 4. Pruebas




### 5. Entregas
- [X] Codigo fuente en Github: [Link]()
- [X] Documentacion
- [X] Pruebas
