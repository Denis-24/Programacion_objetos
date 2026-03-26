package Lambdas;

public class Programa {
    static void main(String[] args) {
        Prueba prueba = new Prueba() {
            @Override
            public String aprobar(int nota) {
                System.out.println("Aprobando programacion desde una anonima " + nota);
                if (nota>=5){
                    return "Aprobado";
                }else {
                    return "Pal Miercoles";
                }
            }
        };

        Prueba lambda = (nota) -> {
            System.out.println("Aprobando programacion desde una lambda, con un " + nota);
            if (nota>=5){
                return "Aprobado";
            }else {
                return "Pal Miercoles";
            }
        };

        System.out.println(prueba.aprobar(4));
        System.out.println(lambda.aprobar(8));

    }
}
