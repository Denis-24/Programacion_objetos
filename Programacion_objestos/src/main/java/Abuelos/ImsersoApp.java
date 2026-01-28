package Abuelos;

public class ImsersoApp {

    static void main(String[] args) {

        Abuelo manolo = new Abuelo("manolo",89);
        Abuelo pepe = new Abuelo("pepe",67);
        Abuelo marisa = new Abuelo("marisa",75);
        Abuelo euge = new Abuelo("euge", 68);

        AutobusImserso alsa = new AutobusImserso("123kkk", "Madrid");

        alsa.insertarAbuelo(manolo);
        alsa.insertarAbuelo(pepe);
        alsa.insertarAbuelo(marisa);
        alsa.insertarAbuelo(euge);

        System.out.println(alsa.getListaAbuelos());

        alsa.eliminarAbuelo(euge);
        System.out.println(alsa.getListaAbuelos());

        alsa.mostrarAuelos();

        alsa.mostrarMayores(70);



    }
}
