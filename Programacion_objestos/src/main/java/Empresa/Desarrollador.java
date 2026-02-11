package Empresa;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Desarrollador extends Empleado{
    public Desarrollador(){

    }

    @Override
    public void realizarTarea(){
        System.out.println("Escribiendo coigo y solucionando bugs");
    }
}
