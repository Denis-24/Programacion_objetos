package Abuelos;

import java.util.ArrayList;

public class AutobusImserso {
    ArrayList<Abuelo> lista = new ArrayList<>();


    private String matricula;
    private String destino;





    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


    @Override
    public String toString() {
        return "AutobusImserso{" +
                "matricula='" + matricula + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
