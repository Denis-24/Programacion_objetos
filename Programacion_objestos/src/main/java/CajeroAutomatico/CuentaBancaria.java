package CajeroAutomatico;


import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter @Setter
public class CuentaBancaria {
    static Scanner teclado = new Scanner(System.in);
    private double saldo;

    public CuentaBancaria(){
        setSaldo(500);
    }

    public void consularSaldo(){
        System.out.println("Saldo disponible: " + saldo + "€");
    }

    public void ingresarDinero(double ingreso){
        if (ingreso==0){
            System.out.println("El importe debe ser mayor de 0€");
        }else {
            saldo = saldo + ingreso;
            System.out.println("Dinero ingresado con exito. Saldo actual: " + saldo);
        }
    }

    public double preguntarIngreso(){
        System.out.println("Introduce la cantidad a ingresar.");
        double ingreso = teclado.nextDouble();
        return ingreso;
    }

    public double preguntarRetiro(){
        System.out.println("Inroduce la cantidad a retirar.");
        double retiro = teclado.nextDouble();
        return retiro;
    }

    public void retirarDinero(double retiro){
        if (retiro==0){
            System.out.println("El retiro debe ser mayor de 0€");
        }else {
            saldo = saldo - retiro;
            System.out.println("El retirado con exito. Saldo actual: " + saldo);
        }
    }



}
