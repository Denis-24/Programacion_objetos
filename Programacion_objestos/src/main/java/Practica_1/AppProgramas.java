package Practica_1;

import java.time.LocalDate;

public class AppProgramas {
    static void main(String[] args) {

        Invitado i1 = new Invitado("angel","estudiante", LocalDate.now(),2);

        Empleado e1 = new Empleado("denis", " ceo");

        Cadena c1 = new Cadena("clan");
        Programa p1 = new Programa("prueba",c1,3);

        p1.añadirEmpleado(e1);


    }
}
