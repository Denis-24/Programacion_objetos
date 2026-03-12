package Colecciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Presidentes {
    private String nombre;
    private String pais;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Presidentes that = (Presidentes) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(pais, that.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais);
    }

    @Override
    public String toString() {
        return "Presidentes{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
