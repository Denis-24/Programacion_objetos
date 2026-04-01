package Pruebas;

public class Recursivo {
    public static void main(String[] args) {
        recursiva(4);
    }

    public static void recursiva(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("<");
        recursiva(n - 1);
        System.out.print(">");
    }
}
