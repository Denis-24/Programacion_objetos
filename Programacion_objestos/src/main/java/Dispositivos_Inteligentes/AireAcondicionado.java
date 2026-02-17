package Dispositivos_Inteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{
    public AireAcondicionado(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }

    @Override
    public void encender() {
        if (super.estado == false){
            System.out.println("Encendiendo aire acondicionado...");
            setEstado(true);
        }else {
            System.out.println("El aire acondicionado ya está encendido.");
        }
    }
}
