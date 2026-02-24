package Practica2;

public class Entrenador extends MutxamelIFC implements AccionesDeportivas{

    final private String FORMATO_FORMACION = "^[1-9]-[1-9]-[1-9]$";

    private Equipo equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipo equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida(formacionPreferida);
    }


    @Override
    public void entrenar() {
        System.out.println("El equipo se ha concentrado.");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador + " + getNombre() + " va a jugar un pratido con su equipo " + equipo + " contra " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + getNombre() + " se esta concentrando.");
    }

    @Override
    public void viajes(String ciudad) {
        System.out.println("El entrenador " + getNombre() + " esta viajando a " + ciudad + " con su equipo" + equipo);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El entrenador " + getNombre() + " esta celebrando el gola de su equipo " + equipo);
    }

    public void setFormacionPreferida(String formacionPreferida) {
        if (formacionPreferida.matches(FORMATO_FORMACION)){
            this.formacionPreferida = formacionPreferida;
        }else {
            System.out.println("El formato de la Formacion preferida no es corecto.");
        }
    }
}
