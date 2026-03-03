package Practica2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class MutxamelIFC implements FuncionesIntegrantes {
    private String nombre;
    private int edad;

    public MutxamelIFC(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
