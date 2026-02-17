package Dispositivos_Inteligentes;

import java.util.ArrayList;

public class DispositivosApp {
    static void main(String[] args) {
        Televisor t1 = new Televisor("t1",false);
        ParlanteInteligente p1 = new ParlanteInteligente("p1",false);
        AireAcondicionado a1 = new AireAcondicionado("a1",false);

        ArrayList<Dispositivo>listaDispositivos = new ArrayList<>();

        listaDispositivos.add(t1);
        listaDispositivos.add(p1);
        listaDispositivos.add(a1);

        for (Dispositivo dispositivo : listaDispositivos){
            dispositivo.encender();
            if (dispositivo instanceof Televisor){
                ((Televisor)dispositivo).sincronizar();
            } else if (dispositivo instanceof AireAcondicionado) {
                ((AireAcondicionado)dispositivo).sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            System.out.println();
        }







    }
}
