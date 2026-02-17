package Dispositivos_Inteligentes;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void encender() {
        if (super.estado == false){
            System.out.println("Encendiendo televisor...");
            setEstado(true);
        }else {
            System.out.println("El televisor ya etsta encendido...");
        }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }
}
