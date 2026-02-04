package Practica_1;

public class Empleado {
    private static final String CADENA_ID = "EP ";
    private static int contadorEmpleados = 0;

    private String id;
    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo){
        id= generadorID();
        contadorEmpleados++;
        this.nombre = nombre;
        
        this.cargo = cargo;


    }


    private String generadorID(){

        return CADENA_ID + (++contadorEmpleados);
    }




}
