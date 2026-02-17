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
            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto)dispositivo).sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            System.out.println();
        }

        Dispositivo microhondas = new Dispositivo("m1",false) {
            @Override
            public void encender() {
                System.out.println(getNombre() + " encendido una sola vez");
            }
        };

        microhondas.encender();

        Dispositivo proyector = new Dispositivo("Optoma",false) {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El proyector " + getNombre() + " ya esta encendido");
                } else {
                    System.out.println("Encendiendo el proyector " + getNombre());
                    estado=true;
                }
            }
        };

        proyector.encender();
        proyector.apagar();
        proyector.apagar();
        System.out.println();

        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando el proyector con el control remoto");
            }
        };

        proyector_sinc.sincronizar();
        System.out.println();

        Dispositivo horno_Inteligente = new Dispositivo("h1",false) {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El horno ya esta encendido");

                }else {
                    System.out.println("Calentando horno con ajustes automaticos de la temperatura...");
                    estado = true;
                }
            }
        };

        horno_Inteligente.encender();
        horno_Inteligente.encender();


        listaDispositivos.add(horno_Inteligente);
        listaDispositivos.add(proyector);

        for (Dispositivo dispositivo : listaDispositivos){
            dispositivo.encender();
            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto)dispositivo).sincronizar();
            }else if (dispositivo.getNombre().equals("h1")){
                proyector_sinc.sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            System.out.println();
        }


    }
}
