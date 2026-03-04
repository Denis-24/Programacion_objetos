package Colecciones;

import java.util.Stack;

public class ejercicio_3 {
    static void main(String[] args) {

        String expresion = "((2+3)*(5-1))";
        String expresion2 = "(2+3))+(5-1)(";
        System.out.println(esBalanceado(expresion));

    }
    public static boolean esBalanceado(String expresion){
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < expresion.length(); i++) {
            expresion.charAt(i);
            if (expresion.charAt(i)=='('){
                pila.push('(');
            } else if (expresion.charAt(i)==')') {
                if ( pila.contains('(')){
                    pila.pop();
                }else {
                    return false;
                }
            }
        }
        if (pila.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
