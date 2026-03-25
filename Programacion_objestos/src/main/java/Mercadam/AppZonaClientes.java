package Mercadam;

import java.util.Scanner;
import java.util.Set;

public class AppZonaClientes {
    static Cliente cliente;
    static Scanner teclado = new Scanner(System.in);



    static void main(String[] args) {
        Mercadaw mercadaw = new Mercadaw();
        mercadaw.generarClientes();
        System.out.println("Clientes generados " + mercadaw.getCliente().size() + " = " + mercadaw.getCliente());
        autenticacion(mercadaw.getClientes());
        imprimirProductos();
        System.out.println("Elige un producto:");
        Productos productos = Productos.valueOf(teclado.nextLine());
        System.out.println(productos);
        cliente.insertarProducto(productos);


    }




    static void autenticacion(Set<Cliente> clientes){
        System.out.println("=== COMPRA ONLINE EN MERCADAW ===");
        exterior:
        for (int i = 1; i <= 3; i++) {
            System.out.println("Usuario:");
            String usuario = teclado.nextLine();
            System.out.println("contraseña:");
            String contrasenya = teclado.nextLine();
            Cliente cliente_control = new Cliente(usuario,contrasenya);
            interior:
            for (Cliente cliente1 : clientes){
                if (cliente1.equals(cliente_control)){
                    System.out.println("Bienvenido, " + cliente1.getUsuario());
                    cliente = cliente1;
                    iniciarCompra();
                    break exterior;
                }
            }
            System.out.println("Credenciales no validas. Intentos: " + (3-i));
            if (i==3){
                System.out.println("ERROR DE AUTENTICACION");
            }
        }
    }
    static void iniciarCompra(){
        System.out.println();
        System.out.println("Creando nuevo pedidio...");
        System.out.println();
        cliente.crearPedido();
    }
    static void imprimirProductos(){
        System.out.println("Elige un producto de la lista...");
        for (Productos productos : Productos.values()){
            System.out.println(productos);
        }
        System.out.println("====================================");
        cliente.crearPedido();
    }
    static void imprimirResumen(){

    }
    static void imprimirDespedida(){

    }
    static void mostrarOpciones(){

    }

}
