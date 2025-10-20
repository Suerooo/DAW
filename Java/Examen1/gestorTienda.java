package Examen1;

import java.util.Scanner;

public class gestorTienda {

    static Scanner sc = new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("1. Consultar stock actual");
        System.out.println("2. Añadir unidades al stock");
        System.out.println("3. Retirar unidades del stock");
        System.out.println("4. Salir");
        System.out.println();
    }

    static void consultarStock(int stock) {
        System.out.println("El stock es: "+stock);
    }

    static int añadirUnidades(int stock) {
        System.out.print("Cuantas unidades añadimos: ");
        int añadir = sc.nextInt();

        if (añadir>=0) {
            stock+=añadir;
        } else {
            System.out.println("Error: número invalido");
        }

        return stock;
    }

    static int retirarUnidades(int stock) {
        System.out.print("Cuantas unidades retiramos: ");
        int retirar = sc.nextInt();

        if (retirar<=stock && retirar>=0) {
            stock-=retirar;
        } 

        if (retirar>stock || retirar<0) {
            System.out.println("Error: número invalido");
        }

        return stock;
    }

    public static void main(String[] args) {

        int opción, stock=50;

        do {
            mostrarMenu();

            System.out.print("Que opción quieres elegir: ");
            opción = sc.nextInt();

            switch (opción) {
                case 1 -> {
                    consultarStock(stock);
                }
                case 2 -> {
                    stock=añadirUnidades(stock);
                }
                case 3 -> {
                    stock=retirarUnidades(stock);
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Error: esa opción no existe");
            }

        } while (opción!=4);

    }
}
