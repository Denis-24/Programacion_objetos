package Practica_1;

public class Empleado {
    private static final String CADENA_ID = "EP ";
    private static int contadorEmpleados = 1;

    private String id;
    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo){
        id= generadorID();
        contadorEmpleados++;
        this.nombre = nombre;
        this.cargo = controlCargo(cargo);
    }

    public String controlCargo(String cargo){
        if (cargo == "director" || cargo == "técnico" || cargo == "presentador" || cargo == "colaborador"){
            return cargo;
        }else {
            return "pte";
        }
    }


    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public static void setContadorEmpleados(int contadorEmpleados) {
        Empleado.contadorEmpleados = contadorEmpleados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    private String generadorID(){
        return CADENA_ID + contadorEmpleados;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
