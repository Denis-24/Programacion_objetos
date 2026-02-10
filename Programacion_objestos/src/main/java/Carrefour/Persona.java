package Carrefour;

public class Persona {
    private String nombre;
    private double sueldo;
    private int codigo;

    public Persona(String nombre,double sueldo,int codigo){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", codigo=" + codigo +
                '}';
    }
    public void mostrarInfo(){
        System.out.println("Persona con codigo " + codigo + " y nombre " + nombre + " gana " + sueldo + "€");
    }
}
