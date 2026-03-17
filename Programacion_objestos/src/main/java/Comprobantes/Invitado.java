package Comprobantes;

import java.time.LocalTime;
import java.util.Objects;


public class Invitado {

    private String nombre;
    private Integer edad;
    private LocalTime hora;

    public Invitado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        hora = LocalTime.now();

    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Invitado invitado = (Invitado) o;
        return edad == invitado.edad && Objects.equals(nombre, invitado.nombre) && Objects.equals(hora, invitado.hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, hora);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }


//    @Override
//    public int compareTo(Invitado o) {
//        int comparar = hora.compareTo(o.getHora());
//        if (comparar !=0){
//            return comparar;
//        }
//
//        comparar = edad.compareTo(o.getEdad());
//        if (comparar !=0){
//            return comparar;
//        }
//
//
//        return nombre.compareTo(o.getNombre());
//    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", hora=" + hora +
                '}';
    }
}
