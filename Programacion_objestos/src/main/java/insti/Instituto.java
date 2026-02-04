package insti;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

//@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Data
public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;
    @NonNull
    private ArrayList<Curso> listaCurso;
    @NonNull
    private ArrayList<Estudiante>listaEstudiantes;

    public Instituto(String nombre, String poblacion){
        this.nombre = nombre;
        this.poblacion = poblacion;
        listaCurso = new ArrayList<>();
        listaEstudiantes = new ArrayList<>();

    }

    private void setNombre(@NonNull String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre,"Instituto sin nombre");
    }

    public void anyadirCurso(Curso curso){
        if (listaCurso.contains(curso)){
            System.out.println("Este curso ya esta en la lista");
        }else {
            listaCurso.add(curso);
        }
    }


}
