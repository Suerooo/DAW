package Unidad9.Act9IntanceOf;

import java.util.Arrays;
import java.util.Comparator;

public class GestionFlota {
    public static void main(String[] args) {
        // TEMA 5: Array de objetos (Polimorfismo)
        Vehiculo[] flota = new Vehiculo[4];
        flota[0] = new Coche("1234BBB", "Seat Ibiza", 5);
        flota[1] = new Camion("5555ZZZ", "Volvo FH", 18000);
        flota[2] = new Coche("9999AAA", "Audi A3", 3);
        flota[3] = new Camion("1111CCC", "Iveco Daily", 3500);

        // --- ORDEN NATURAL (Comparable: por Matrícula) ---
        System.out.println("ORDENADO POR MATRÍCULA:");
        Arrays.sort(flota);
        mostrarFlota(flota);

        // --- ORDEN ALTERNATIVO (Comparator + Clase Anónima: por Modelo) ---
        System.out.println("\nORDENADO POR MODELO (Clase Anónima):");
        Arrays.sort(flota, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Vehiculo v1 = (Vehiculo) o1;
                Vehiculo v2 = (Vehiculo) o2;
                // Tema 6: Usamos compareTo de String para los modelos
                return v1.getModelo().compareTo(v2.getModelo());
            }
        });
        mostrarFlota(flota);
    }

    public static void mostrarFlota(Vehiculo[] lista) {
        for (Vehiculo v : lista) {
            System.out.println(v);
        }
    }

    public static void mostrarPuertasCoches(Vehiculo[] lista) {
        for (int i = 0; i < lista.length; i++) {
            // ¿Es el vehículo de la posición i un Coche?
            if (lista[i] instanceof Coche) {
                // Ahora que estamos SEGUROS, hacemos el casting
                Coche miCoche = (Coche) lista[i];
                System.out.println("Es un coche con " + miCoche.getPuertas() + " puertas.");
            } else if (lista[i] instanceof Camion) {
                System.out.println("Es un camión, no tiene puertas de coche.");
            }
        }
    }

}