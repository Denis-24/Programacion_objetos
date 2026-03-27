package Lambdas;

public class VotarApp{
    static void main() {
        VerificadorVoto voto = (nombre,edad) ->{
            if (edad>=18){
                return true;
            }else {
                return false;
            }
        };
    }


}
