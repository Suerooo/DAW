package Unidad11.Act15PlantillaFutbol;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        Map<Integer, Jugador> plantilla = new TreeMap<>();

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> altaJugador(plantilla, pedirDorsal());
                case 2 -> eliminarJugador(plantilla, pedirDorsal());
                case 3 -> editarJugador(plantilla, pedirDorsal());
                case 4 -> mostrar(plantilla);
                case 5 -> mostrar(plantilla, pedirPosicion());
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opcion no existe");

            }

        } while (opcion != 6);
    }

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Alta jugador");
        System.out.println("2. Eliminar jugador");
        System.out.println("3. Editar jugador");
        System.out.println("4. Mostrar jugadores");
        System.out.println("5. Mostrar jugadores de x posicion");
        System.out.println("6. Salir");
        System.out.print("Introduce una opocion: ");
    }

    public static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

        if (!plantilla.containsKey(dorsal)) {
            plantilla.put(dorsal, new Jugador(pedirDNI(), pedirNombre(), pedirPosicion()));
        }
    }

    public static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

        return plantilla.remove(dorsal);
    }

    public static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

        if (plantilla.containsKey(dorsal)) {
            Jugador jugador = plantilla.get(dorsal);
            jugador.setNombre(pedirNombre());
            jugador.setPosicionCampo(pedirPosicion());
        }

        return plantilla.containsKey(dorsal);
    }

    public static void mostrar(Map<Integer, Jugador> plantilla) {

        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {

            Jugador jugador = entry.getValue();

            System.out.printf("Dorsal: %d - DNI: %s - Nombre: %s - Posicion Campo: %s%n",
                    entry.getKey(), jugador.getDNI(), jugador.getNombre(), jugador.getPosicionCampo());
        }

    }

    public static void mostrar(Map<Integer, Jugador> plantilla, PosicionCampo posicion) {

        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {

            Jugador jugador = entry.getValue();

            if (jugador.getPosicionCampo().equals(posicion)) {

                System.out.printf("Dorsal: %d - DNI: %s - Nombre: %s - Posicion Campo: %s%n",
                        entry.getKey(), jugador.getDNI(), jugador.getNombre(), jugador.getPosicionCampo());
            }
        }
    }

    public static Integer pedirDorsal() {
        System.out.print("Introduce el dorsal: ");
        return sc.nextInt();
    }

    public static String pedirDNI() {
        System.out.print("Introduce el DNI: ");
        return sc.next();
    }

    public static String pedirNombre() {
        System.out.print("Introduce el nombre: ");
        return sc.next();
    }

    public static PosicionCampo pedirPosicion() {
        System.out.println("1. Portero");
        System.out.println("2. Defensa");
        System.out.println("3. Centro Campista");
        System.out.println("4. Delantero");
        System.out.print("Introduce una opcion: ");

        do {
            switch (sc.nextInt()) {
                case 1:
                    return PosicionCampo.PORTERO;
                case 2:
                    return PosicionCampo.DEFENSA;
                case 3:
                    return PosicionCampo.CENTROCAMPISTA;
                case 4:
                    return PosicionCampo.DELANTERO;
                default:
                    System.out.println("Esa opcion no existe");
            }
        } while (true);
    }

}
