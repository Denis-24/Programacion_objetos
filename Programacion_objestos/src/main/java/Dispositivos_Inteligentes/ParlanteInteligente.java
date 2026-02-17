package Dispositivos_Inteligentes;

public class ParlanteInteligente extends Dispositivo{
    public ParlanteInteligente(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void encender() {
        if (super.estado == false){
            System.out.println("Activando parlante con comando de voz...");
            setEstado(true);
        }else {
            System.out.println("El parlante ya está encendido.");
        }
    }
}
