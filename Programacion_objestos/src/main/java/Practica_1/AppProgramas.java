package Practica_1;

import java.time.LocalDate;

public class AppProgramas {
    static void main(String[] args) {

        Invitado i1 = new Invitado("angel","estudiante", LocalDate.of(2025, 3,15),2);
        Invitado i2 = new Invitado("Roberto", "Ingeniero", LocalDate.of(2025,6,9),2);
//
        Empleado e1 = new Empleado("eric", "ceo");
//
        Cadena c1 = new Cadena("clan");
        Programa p1 = new Programa("prueba",c1,3);
        Empleado e2 = new Empleado("adrian","colaborador");

//        System.out.println(e2.getCargo());
//        System.out.println(e1.getCargo());
//
        p1.anyadirEmpleado(e1);
        p1.eliminarEmpleado(e1);
        p1.eliminarEmpleado(e1);
        System.out.println();
//        p1.anyadirEmpleado(e2);
//        p1.anyadirEmpleado(e2);
//
//        System.out.println(e1.getId());
//        System.out.println();
//
//        System.out.println(i1.getFecha());
//        System.out.println(i2.getFecha());
//        System.out.println();
//
        p1.anyadirInvitado(i1);
        p1.eliminarInvitado(i1);
        p1.eliminarInvitado(i1);
//        p1.anyadirInvitado(i1);
//        p1.anyadirInvitado(i2);
//
//        p1.invitadosTemporarda(2);
//
//        System.out.println();
//
//        System.out.println(i1.getFecha());
//        i1.setFecha(LocalDate.of(i1.anyo(),i1.mes(), i1.dia()));
//        System.out.println(i1.getFecha());
//
//        System.out.println();
//        System.out.println();

//        Cadena antena3 = new Cadena("Antena 3");
//        System.out.println(antena3);
//
//        Programa el_hormiguero = new Programa("El Hormiguero",antena3,3);
//        System.out.println(el_hormiguero);
//        System.out.println(antena3);
//        System.out.println();

//        el_hormiguero.anyadirEmpleado("Pablo Motos","presentador",null);

//        System.out.println(el_hormiguero.getListaEmpleados());

//        el_hormiguero.anyadirInvitado("Aitana","cantante",1);

//        System.out.println(el_hormiguero.getListaInvitados());





    }
}
