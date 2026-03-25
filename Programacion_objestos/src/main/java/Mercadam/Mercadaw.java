package Mercadam;

import java.util.*;

public class Mercadaw {
    private Set<Cliente> clientes;
    static Random aleatorio = new Random();

    public Mercadaw(){
       clientes = new HashSet<>();
    }
    public void generarClientes(){
        for (int i = 0; i < aleatorio.nextInt(1,10); i++) {
            Cliente cliente = new Cliente(generar_palabra(),generar_palabra());
            clientes.add(cliente);
        }

    }
    public String generar_palabra(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String palabra = "";
        for (int i = 0; i < 8; i++) {
            palabra += caracteres.charAt(aleatorio.nextInt(caracteres.length()));
        }
        return palabra;
    }

    //falta uno que es el inmodificable.
    public Set<Cliente> getClientes(){
        return Collections.unmodifiableSet(clientes);
    }

    public Set<Cliente> getCliente() {
        return clientes;
    }



    public void setCliente(Set<Cliente> cliente) {
        this.clientes = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mercadaw mercadaw = (Mercadaw) o;
        return Objects.equals(clientes, mercadaw.clientes);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(clientes);
    }

    @Override
    public String toString() {
        return "Mercadaw{" +
                "cliente=" + clientes +
                '}';
    }


}
