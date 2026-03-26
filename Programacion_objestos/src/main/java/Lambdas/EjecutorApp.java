package Lambdas;

public class EjecutorApp {
    static void main(String[] args) {

        Ejecutor ejecutor = (num) -> {
            System.out.println("Comparando para " + num + ":");
            if (num>10){
                return true;
            }else {
                return false;
            }
        };


    }
}
