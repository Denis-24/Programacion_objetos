package Funcionario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Informe {

    static private int contador = 1;
    private int codigo;
    private Tipo tipo;

    public Informe(Tipo tipo){
        setCodigo(contador);
        this.tipo = tipo;
        contador++;
    }


    public void setCodigo(int contador) {
        codigo = contador;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", tipo=" + tipo +
                '}';
    }
}
