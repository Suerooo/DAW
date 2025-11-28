package Examenes.Examen1;

import java.util.Locale;
import java.util.Scanner;

public class Act13Atm {
    //Scanner global
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

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
        //Pregunta y guarda la cantidad de dinero que el usuario quiere ingresar
        System.out.print("¿Que cantidad deseas ingresar?: ");
        double ingreso = sc.nextDouble();

        //Si esa cantidad es mayor que 0 lo suma a saldoActual y si no imprime un error
        if (ingreso>0) {
            saldoActual+=ingreso;
            System.out.println("Ingreso realizado correctamente");
        } else {
            System.out.println("Error: Numero incorrecto");
        }

        //Devuelve la variable saldoActual
        return saldoActual;
    }

    //Método para retirar dinero
    static double retirarDinero(double saldoActual) {
        //Pregunta y guarda la cantidad de dinero que el usuario quiere retirar
        System.out.print("¿Que cantidad deseas retirar?: ");
        double retiro = sc.nextDouble();

        //Si esa cantidad es menor o igual a la del saldo y es mayor que 0 resta a saldoActual la cantidad de dinero que el usuario quiere retirar
        if (retiro<=saldoActual && retiro>0) {
            saldoActual-=retiro;
            System.out.println("Retirada realizada correctamente");

        //Si la cantidad es menor que 0 o mayor que la de saldoActual da un error
        } else if (retiro>saldoActual || retiro<0) {
            System.out.println("Error: Numero incorrecto");
        }

        //Devuelve la variable saldoActual
        return saldoActual;
    }

    public static void main(String[] args) {

        //Variables
        double saldoActual=1000.0;
        int opcion = 0;

        do {
            //Llama la variable mostrarMenu para mostrar el menu
            mostrarMenu();

            //Pregunta y guarda la opción que quiere usar el usuario
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> consultarSaldo(saldoActual);
                case 2 -> saldoActual=ingresarDinero(saldoActual);
                case 3 -> saldoActual=retirarDinero(saldoActual);
                case 4 -> System.out.println("Gracias por utilizar nuestros servicios. Hasta pronto");
                default -> System.out.println("Numero incorrecto vuelve a intentarlo");
            }

        } while (opcion!=4);

    }
}
