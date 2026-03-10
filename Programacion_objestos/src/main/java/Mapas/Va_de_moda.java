package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Va_de_moda {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int cantidad = in.nextInt();
        in.nextLine();
        if (cantidad==0)
            return false;
        else {
            String numeros = in.nextLine();
            HashMap<Integer,Integer>mapa = new HashMap<>();
            for (String num : numeros.split(" ")){
                if (mapa.containsKey(Integer.parseInt(num))){
                    mapa.put(Integer.parseInt(num),mapa.get(Integer.parseInt(num))+1);
                }else {
                    mapa.put(Integer.parseInt(num),1);
                }
            }
            int mayor = 0;
            int definitivo = 0;
            for (Map.Entry<Integer,Integer>resultado : mapa.entrySet()){
//                if (mayor < resultado.getValue()){
//                    mayor = resultado.getValue();
//                    definitivo = resultado.getKey();
//                }
                System.out.println(resultado.getKey());
            }
            System.out.println(definitivo);

            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
