package prueba_enums;

import Sistema_de_Pagos.TarjetaCredito;

import java.util.Scanner;

public class tarjetasApp {
    static void main(String[] args) {

        Tarjetas tarjeta_tipo = Tarjetas.visa;

        Scanner teclado = new Scanner(System.in);

        System.out.println(tarjeta_tipo.ordinal());
        System.out.println(tarjeta_tipo.name());

        System.out.println("tipos de tarjetas");
        for (Tarjetas  tarjetas : Tarjetas.values()){
            System.out.println(tarjetas);
        }

        System.out.println("Introduce el tipo de tarjeta...");
        Tarjetas tipo = Tarjetas.valueOf(teclado.nextLine());

        System.out.println("La tarjeta de tipo " + tipo + " tiene una comision de " + tipo.getComision() + "€");









    }
}
