package inmobiliaria;

public class InmoApp {
    static void main(String[] args) {

        Casa pisito = new Casa("Calle Falsa 123");

        System.out.println(pisito.getPropietario());
        System.out.println();

        pisito.crearHabitacion("Cocina",20);
        pisito.crearHabitacion("Baño",7);
        pisito.crearHabitacion("Dormitorio", 21);

        System.out.println(pisito.getListaHabitaciones());
        pisito.mostrarHabitaciones();
        System.out.println();

        System.out.println("La habitacion mas grande es " + pisito.getHabitacionMasGrande().getNombre());
        System.out.println();

        pisito.crearHabitacion("Cocina",20);
        pisito.mostrarHabitaciones();
        System.out.println();

        pisito.eliminarHabitacion("Baño");
        System.out.println();
        pisito.mostrarHabitaciones();

        pisito.getListaHabitaciones().get(2).crearElectrodomesticos("Television",50);
        pisito.getListaHabitaciones().get(2).crearElectrodomesticos("Luzes_led",5);
        pisito.getListaHabitaciones().get(2).mostrarElectrodomesticos();
        System.out.println();
        pisito.getListaHabitaciones().get(0).crearElectrodomesticos("Horno",100);
        pisito.getListaHabitaciones().get(0).crearElectrodomesticos("Nevera",150);
        pisito.getListaHabitaciones().get(0).crearElectrodomesticos("Microhondas",50);
        System.out.println();
        pisito.mostrarTodosLosElectrodomesticos();

    }
}
