package Examen1;

import java.util.Scanner;

public class lavanderia {

    //Variable Scanner static
    static Scanner sc = new Scanner(System.in);

    //Método que muestra el menú
    static void mostrarMenu() {
        System.out.println("1. Consultar fichas");
        System.out.println("2. Consultar saldo");
        System.out.println("3. Comprar fichas");
        System.out.println("4. Usar lavadora");
        System.out.println("5. Añadir dinero");
        System.out.println("6. Salir");
        System.out.println();
    }

    //Método para consultar las fichas que el usuario tiene
    static void consultarFichas(int fichas) {
        System.out.println("Tienes "+fichas+" fichas");
    }

    //Método consultar el saldo que el usuario tiene
    static void consultarSaldo(double saldo) {
        System.out.println("Tienes "+saldo+" euros");
    }

    //Método que verifica si la compra de fichas es posible
    static boolean validacion(double precio, double saldo, int fichas, int cantidadCompra) {
        boolean validacion=false;

        if (cantidadCompra<=0) {
            System.out.println("Error: tienes que comprar como minimo 1 ficha");
        } else if (saldo-(precio*cantidadCompra)<0) {
            System.out.println("Error: Saldo insuficiente");
        } else {
            System.out.println("Compra aceptada");
            validacion=true;
        }

        return validacion;
    }

    static int comprarFichas(boolean validacion, int fichas, int cantidadCompra) {
        if (validacion) {
            fichas+=cantidadCompra;
        }
        return fichas;
    }

    static double gastarDinero(boolean validacion, double precio, double saldo, int cantidadCompra) {
        if (validacion) {
           saldo-=(precio*cantidadCompra);
        }
        return saldo;
    }

    static int usarLavadora(int fichas) {
        System.out.print("Cuantas fichas quieres gastar: ");
        int numero = sc.nextInt();

        if (numero<=0) {
            System.out.println("Error: tienes que usar como minimo 1 ficha");
        } else if (numero>fichas) {
            System.out.println("Error: Fichas insuficiente");
        } else {
            fichas-=numero;
        }

        return fichas;
    }

    static double añadirDinero(double saldo) {
        System.out.print("Cuanto dinero quieres ingresar: ");
        int numero = sc.nextInt();

        if (numero<=0) {
            System.out.println("Error: no se permiten numeros menores que 0");
        } else {
            saldo+=numero;
        }

        return saldo;
    }
    
    public static void main(String[] args) {
        
        int fichas=20, opcion;
        double saldo=100.0, precio=20.0;


        do {
            
            mostrarMenu();

            System.out.print("Introduce un número: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    consultarFichas(fichas);
                }
                case 2 -> {
                    consultarSaldo(saldo);
                }
                case 3 -> {
                    System.out.print("Introduce un número: ");
                    int cantidadCompra = sc.nextInt();
                    boolean validacion=validacion(precio, saldo, fichas, cantidadCompra);
                    fichas=comprarFichas(validacion, fichas, cantidadCompra);
                    saldo=gastarDinero(validacion, precio, saldo, cantidadCompra);
                }
                case 4 -> {
                    fichas=usarLavadora(fichas);
                }
                case 5 -> {
                    saldo=añadirDinero(saldo);
                }
                case 6 -> {
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Error");
            }

        } while (opcion!=6);

    }
}
