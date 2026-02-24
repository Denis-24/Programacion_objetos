package Practica2;

public class DorsalValido extends RuntimeException {
    public DorsalValido() {
        super("Dorsal ya en uso");
    }
}
