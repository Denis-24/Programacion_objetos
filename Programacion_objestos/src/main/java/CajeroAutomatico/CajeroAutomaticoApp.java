package CajeroAutomatico;

import java.util.Scanner;

public class CajeroAutomaticoApp {
   static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {



    }
    public static String preguntas(){
        System.out.println("=== Cajero Automatico ===");
        System.out.println("[1]. Consultar saldo");
        System.out.println("[2]. Ingresar dinero");
        System.out.println("[3]. Retirar dinero");
        System.out.println("[X]. Salir");
        String opcion = teclado.nextLine();
        return opcion;
    }

    public static void  opcionesCajero(String opcion){
        switch (opcion){
            case "1":
                
        }
    }
}
