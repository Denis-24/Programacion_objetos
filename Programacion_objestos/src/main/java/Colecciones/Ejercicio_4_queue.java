package Colecciones;

import java.sql.SQLOutput;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio_4_queue {
    static Scanner teclado = new Scanner(System.in);

    static LinkedList<String>listaCompra = new LinkedList<>();

    public static void anyadirFinal(){
        System.out.print("Introduce el producto que quires añadir:");
        String producto = teclado.nextLine();
        System.out.println("El producto " + listaCompra.offerLast(producto) + " se ha introducido en la lista.");
    }
    public static void eliminarPrimero(){
        if (listaCompra.isEmpty()){
            System.out.println("La lista de la compra esta vacio, por lo tanto no se puede eliminar un producto.");
        }else {
            System.out.println("El producto " + listaCompra.pollFirst() + " se ha eliminado de la lista");
        }
    }
    public static void eliminarProducto(){
        System.out.print("Introduce el producto que quires eliminar:");
        String producto = teclado.nextLine();
        if (listaCompra.contains(producto)){
            listaCompra.remove(producto);
            System.out.println("El producto "+producto+" se ha eliminado de la lista.");
        }else {
            System.out.println("El producto " + producto + " no se encuentra en la lista.");
        }
    }
    public static void verPrimerProducto(){
        if (listaCompra.isEmpty()){
            System.out.println("La lista de la compra esta vacia.");
        }else {
            System.out.println("El primer producto de la lista es: " + listaCompra.peekFirst());
        }
    }
    public static void buscarProducto(){
        System.out.print("Introduce el producto que quires buscar:");
        String producto = teclado.nextLine();
        if (listaCompra.contains(producto)){
            System.out.println("El produto " + producto + " esta en la lista de la compra");
        }else {
            System.out.println("El producto " + producto + " no se encuentra en la lista.");
        }
    }
    public static void mostrarLista(){
        if (listaCompra.isEmpty()){
            System.out.println("La lista de la compra esta vacia.");
        }else {
            for (String productos : listaCompra){
                System.out.println((listaCompra.indexOf(productos)+1)+". "+productos);
            }
        }
        System.out.println();
    }

    public static String menu(){
        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final.");
        System.out.println("2. Eliminar prime producto");
        System.out.println("3. Eliminar porducto por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista catual");
        System.out.println("X. Salir");
        System.out.println();
        System.out.print("Seleccione una opcion: ");
        System.out.println();
        String opcion = teclado.nextLine();
        System.out.println();
        System.out.println("-------------------------------------");
        return opcion.toUpperCase();
    }
    public static void listaDeLaCompra(){
        boolean control = false;
        while (control== false){
            switch (menu()){
                case "1":
                    anyadirFinal();
                    break;
                case "2":
                    eliminarPrimero();
                    break;
                case "3":
                    eliminarProducto();
                    break;
                case "4":
                    verPrimerProducto();
                    break;
                case "5":
                    buscarProducto();
                    break;
                case "6":
                    mostrarLista();
                    break;
                case "X":
                    System.out.println("!ADIOS!");
                    control=true;
                default:
                    System.out.println();
                    System.out.println("Valor introduido incorrecto...");
                    System.out.println();
            }
        }
    }

    static void main(String[] args) {
        listaDeLaCompra();
    }
}
