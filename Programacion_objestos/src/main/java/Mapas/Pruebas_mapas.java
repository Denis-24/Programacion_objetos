package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Pruebas_mapas {
    static void main(String[] args) {

        HashMap<String,String> concejales = new HashMap<>();

        concejales.put("Enrique Pastor", "Juventud y tiempo libre");
        concejales.put("Lola Rodriguez","Familia, fiesta y siestas");

        System.out.println(concejales.keySet());
        System.out.println(concejales.values());
        System.out.println(concejales.get("Enrique Pastor"));
        System.out.println();

        for (Map.Entry<String,String>mapita : concejales.entrySet()){
            System.out.println("El concejal " + mapita.getKey() + " tiene el cargo " + mapita.getValue());
        }






    }
}
