package Practica.Examen1.TipoExamen;

import java.util.Scanner;

public class Lavanderia {

    //Scanner compartido para todas las entradas del usuario
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
        System.out.printf("Tienes %.2f euros %n", saldo);
    }

    //Método que verifica si la compra de fichas es posible
    static boolean validacion(double precio, double saldo, int cantidadCompra) {
        boolean validacion=false;

        //Valida si es posible comprar para enviar el resultado de la validación a los otros metodos
        if (cantidadCompra<=0) {
            System.out.println("Error: tienes que comprar como mínimo 1 ficha");
        } else if (saldo-(precio*cantidadCompra)<0) {
            System.out.println("Error: Saldo insuficiente");
        } else {
            System.out.println("Compra aceptada");
            validacion=true;
        }
        return validacion;
    }

    //Método para usar las fichas en la lavandería
    static int usarLavadora(int fichas) {
        //Pregunta y guarda la cantidad de fichas que se quieren usar
        System.out.print("Cuantas fichas quieres gastar: ");
        int fichasUsadas = sc.nextInt();

        //Valida que no se pueda usar fichas negativas ni usar mas fichas de las que el usuario tiene
        if (fichasUsadas<=0) {
            System.out.println("Error: tienes que usar como mínimo 1 ficha");
        } else if (fichasUsadas>fichas) {
            System.out.println("Error: Fichas insuficiente");
        } else {
            fichas-=fichasUsadas;
        }

        //Devuelve las fichas
        return fichas;
    }

    //Método para añadir saldo
    static double anadirDinero(double saldo) {
        System.out.print("Cuanto dinero quieres ingresar: ");
        double ingresoDinero = sc.nextDouble();

        //Valida que no se ingrese números menores a 0
        if (ingresoDinero<=0) {
            System.out.println("Error: no se permiten números menores que 0");
        } else {
            saldo+=ingresoDinero;
        }

        return saldo;
    }
    
    public static void main(String[] args) {
        //Variables
        int fichas=20, opcion;
        double saldo=100.0, precio=20.0;

        //Muestra el menu hasta que el usuario elija como opción el 6
        do {
            //Llama al método mostrarMenu para mostrar el menu
            mostrarMenu();

            //Pregunta al usuario que opción del menu quiere usar
            System.out.print("Introduce un número: ");
            opcion = sc.nextInt();

            //Hace que el menu sea interactivo con un switch
            switch (opcion) {
                case 1 -> consultarFichas(fichas);
                case 2 -> consultarSaldo(saldo);
                case 3 -> {
                    //Pregunto al usuario la cantidad de fichas que quiere comprar y si el método validación devuelve true añade las fichas y resta el precio al saldo
                    System.out.print("Introduce un número: ");
                    int cantidadCompra = sc.nextInt();
                    if (validacion(precio, saldo, cantidadCompra)) {
                        fichas+=cantidadCompra;
                        saldo-=(precio*cantidadCompra);
                    }
                }
                case 4 -> fichas=usarLavadora(fichas);
                case 5 -> saldo=anadirDinero(saldo);
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Error: Esa opción no existe");
            }
        } while (opcion!=6);

        //Cierra la variable Scanner
        sc.close();
    }
}
