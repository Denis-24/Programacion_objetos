package org.example;

public class Bocadillo {
    private String nombre;
    private String pan;
    private String ingredientes;
    private String salsa;
    private double precio;


    public Bocadillo(String nombre, String pan, String ingredientes, String salsa, double precio){

        this.nombre = nombre;
        this.pan = pan;
        this.ingredientes = ingredientes;
        this.salsa = salsa;
        this.precio = precio;
    }

    public Bocadillo(){

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void imprimirBocatas(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo pan: " + pan);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Salsa: " + salsa);
        System.out.println("Precio: " + precio);

    }







}
