package Practica.Examen1.TipoExamen;

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

    static void consultarBateria(double bateria) {
        System.out.println("La batería actual es: "+bateria);
    }

    static double cargar(double bateria) {
        System.out.print("Cuanta batería se ha cargado: ");
        double cargar = sc.nextDouble();

        if (bateria+cargar>100 ||cargar<0) {
            System.out.println("Error: Número invalido");
        } else {
            bateria+=cargar;
        }

        return bateria;
    }

    static double usar(double bateria) {
        System.out.print("Cuanta batería se ha usado: ");
        double usar = sc.nextDouble();
        
        if (bateria-usar<0 || usar<0) {
            System.out.println("Error número invalido");
        } else {
            bateria-=usar;
        }

        return bateria;
    }

    public static void main(String[] args) {
        
        double bateria=65.0;
        int opcion;

        do {
            mostrarMenu();

            System.out.print("Que opción quieres elegir: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> consultarBateria(bateria);
                case 2 -> bateria=cargar(bateria);
                case 3 -> bateria=usar(bateria);
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Error: esa opción no existe");
            }

        } while (opcion!=4);

    }
}
