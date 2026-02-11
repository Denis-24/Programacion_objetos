package RedesSociales;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Basico extends Usuario{

    public Basico(String nombre, int edad, String nombre_usuario, int seguidores) {
        super(nombre, edad, nombre_usuario, seguidores);
    }

    @Override
    public void mostrarInfo(){
        mostrarInfo();
    }

}
