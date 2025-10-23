package Examen1;

import java.util.Scanner;

public class GestorBateria {

    static Scanner sc = new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("1. Consultar batería");
        System.out.println("2. Cargar batería");
        System.out.println("3. Usar batería");
        System.out.println("4. Salir");
        System.out.println();
    }

    static void consultarBatería(double batería) {
        System.out.println("La batería actual es: "+batería);
    }

    static double cargar(double batería) {
        System.out.print("Cuanta batería se ha cargado: ");
        double cargar = sc.nextDouble();

        if (batería+cargar>100 ||cargar<0) {
            System.out.println("Error: Número invalido");
        } else {
            batería+=cargar;
        }

        return batería;
    }

    static double usar(double batería) {
        System.out.print("Cuanta batería se ha usado: ");
        double usar = sc.nextDouble();
        
        if (batería-usar<0 || usar<0) {
            System.out.println("Error número invalido");
        } else {
            batería-=usar;
        }

        return batería;
    }

    public static void main(String[] args) {
        
        double batería=65.0;
        int opción;

        do {
            mostrarMenu();

            System.out.print("Que opción quieres elegir: ");
            opción = sc.nextInt();

            switch (opción) {
                case 1 -> {
                    consultarBatería(batería);
                }
                case 2 -> {
                    batería=cargar(batería);
                }
                case 3 -> {
                    batería=usar(batería);
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Error: esa opción no existe");
            }

        } while (opción!=4);

    }
}
