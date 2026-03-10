package Funcionario;

import java.util.Stack;

public class Funcionario_App {
    static void main(String[] args) {

        Stack<Informe> pila = new Stack<>();

        Informe i1 = new Informe(Tipo.ADMINISTRATIVO);
        Informe i2 = new Informe(Tipo.EMPRESARIAL);
        Informe i3 = new Informe(Tipo.PERSONAL);
        Informe i4 = new Informe(Tipo.ADMINISTRATIVO);
        Informe i5 = new Informe(Tipo.PERSONAL);

        pila.push(i1);
        pila.push(i2);
        pila.push(i3);
        pila.push(i4);
        pila.push(i5);

        System.out.println(pila);

        int tamanyo = pila.size();

        for (int i = 0; i < tamanyo; i++) {
            if (!pila.isEmpty()){
                System.out.println();
                System.out.println("Informe numero " + (i+1) + ": ");
                System.out.println(pila.pop());
                System.out.println(pila);
            }
        }

        System.out.println("-------------------------------------------------");

        Informe i6 = new Informe(Tipo.EMPRESARIAL);
        Informe i7 = new Informe(Tipo.PERSONAL);
        Informe i8 = new Informe(Tipo.ADMINISTRATIVO);

        pila.push(i6);
        pila.push(i7);
        pila.push(i8);

        tamanyo = pila.size();

        for (int i = 0; i < tamanyo; i++) {
            System.out.println();
            System.out.println("Informe numero " + (i+1) + ": ");
            System.out.println(pila.pop());
        }
        System.out.println(pila);




    }
}
