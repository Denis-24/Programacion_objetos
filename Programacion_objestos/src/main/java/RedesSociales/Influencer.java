package RedesSociales;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class Influencer extends Usuario {
    private ArrayList<String> colaboradores;

    public Influencer(String nombre, int edad, String nombre_usuario, int seguidores) {
        super(nombre, edad, nombre_usuario, seguidores);
        colaboradores = new ArrayList<>();
    }

    @Override
    public void mostrarInfo(){
        mostrarInfo();
        for(String colab : colaboradores){
            System.out.print(colab + ", ");
        }
    }

    @Override
    public String toString() {
        return "Influencer{" +
                "colaboradores=" + colaboradores +
                '}';
    }
}
