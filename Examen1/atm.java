package Examen1;

import java.util.Locale;
import java.util.Scanner;

public class atm {
    //Método que muestra el menu del atm
    static void mostrarMenu() {
        System.out.println("*** BIENVENIDO A TU CAJERO AUTOMÁTICO ***");
        System.out.println("1. Consultar dinero");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
    }

    //Método para consultar el sueldo
    static void consultarSaldo(double saldoActual) {
        System.out.println("Tu saldo actual es: "+saldoActual);
    }

    //Método para ingresar dinero
    static double ingresarDinero(double saldoActual) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("¿Que cantidad deseas ingresar?: ");
        double ingreso = sc.nextDouble();

        if (ingreso<=saldoActual && ingreso>0) {
            saldoActual+=ingreso;
            System.out.println("Ingreso realizado correctamente");

        } if (ingreso>saldoActual || ingreso<0) {
            System.out.println("Error: Saldo insuficiente");
        }

        return saldoActual;
    }

    //Método para retirar dinero
    static double retirarDinero(double saldoActual) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("¿Que cantidad deseas retirar?: ");
        double retiro = sc.nextDouble();

        if (retiro<=saldoActual && retiro>0) {
            saldoActual-=retiro;
            System.out.println("Retirada realizada correctamente");

        } if (retiro>saldoActual || retiro<0) {
            System.out.println("Error: Saldo insuficiente");
        }

        return saldoActual;
    }

    public static void main(String[] args) {

        double saldoActual=1000.0;
        int opcion = 0;

        do {
            mostrarMenu();

            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    consultarSaldo(saldoActual);
                }
                case 2 -> {
                    saldoActual=ingresarDinero(saldoActual);
                }
                case 3 -> {
                    saldoActual=retirarDinero(saldoActual);
                }
                case 4 -> {
                    System.out.println("Gracias por utilizar nuestros serivicios. Hasta pronto");
                }
                default -> System.out.println("Numero incorrecto vuelve a intentarlo");
            }

        } while (opcion!=4);

    }
}
