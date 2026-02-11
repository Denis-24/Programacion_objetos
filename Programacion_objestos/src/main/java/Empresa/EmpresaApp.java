package Empresa;

import java.util.ArrayList;

public class EmpresaApp {
    static void main(String[] args) {


        ArrayList<Empleado>listaEmpleados = new ArrayList<>();

        Empleado e1 = new Empleado();
        Empleado d1 = new Desarrollador();
        Empleado i1 = new Diseñador();
        Empleado g1 = new Gerente();

        listaEmpleados.add(e1);
        listaEmpleados.add(d1);
        listaEmpleados.add(i1);
        listaEmpleados.add(g1);

        for (Empleado empleado : listaEmpleados){
            empleado.realizarTarea();
        }
        System.out.println();

        asignarTareas(e1);



    }
    public static void asignarTareas(Empleado empleado){
        System.out.println("Asignanndo tarea  al empleado...");
        empleado.realizarTarea();
    }
}
