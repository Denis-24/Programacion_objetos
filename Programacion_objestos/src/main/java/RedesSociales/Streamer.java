package RedesSociales;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Streamer extends Usuario{
    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombre_usuario, int seguidores, int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, nombre_usuario, seguidores);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;
    }

    @Override
    public void mostrarInfo(){
        mostrarInfo();
        System.out.println("Retransmisiones realizadas: " + numero_retransmisiones);
        System.out.println("Horas de directo: " + horas_directo);
    }


}
