package Examenes.Examen3.Act0Examen;

import java.util.Scanner;

public class App {
    // VALORES DEFAULT
    private static final int CANTIDAD_EMPLEADOS = 10;

    // ATRIBUTOS
    static Empleado[] listaEmpleados = new Empleado[CANTIDAD_EMPLEADOS];
    static Scanner sc = new Scanner(System.in);

    // METODOS
    public static void altaProgramador() {
        int numEmpleado = Empleado.getNumTrabajadores();

        if (numEmpleado >= 10) {
            System.out.println("Superaste el limite de empleados (" + CANTIDAD_EMPLEADOS + ")");
        } else {
            listaEmpleados[numEmpleado] = new Programador(pedirNombre(), pedirDni(), pedirEdad(), pedirSalario(), pedirLenguaje());
        }
    }

    public static void altaGerente() {
        int numEmpleado = Empleado.getNumTrabajadores();

        if (numEmpleado >= 10) {
            System.out.println("Superaste el limite de empleados (" + CANTIDAD_EMPLEADOS + ")");
        } else {
            listaEmpleados[numEmpleado] = new Gerente(pedirNombre(), pedirDni(), pedirEdad(), pedirSalario(), pedirArea());
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n1. Dar de alta Programador");
        System.out.println("2. Dar de alta Gerente");
        System.out.println("3. Listar todos los empleados");
        System.out.println("4. Buscar un empleado");
        System.out.println("5. Salir");
        System.out.print(">> ");
    }

    public static void mostrarLenguajes() {
        System.out.println("1. JAVA");
        System.out.println("2. PYTHON");
        System.out.println("3. CPP");
        System.out.print(">> ");
    }

    public static String pedirDni() {
        String dni;
        boolean repetir = true;

        do {
            System.out.print("Introduce dni: ");
            dni = sc.next();

            if (getIndiceDni(dni) != -1) {
                System.out.println("Ese dni ya lo tiene otro usuario vuelve a intentarlo.");
            } else {
                repetir = false;
            }
        } while (repetir);

        return dni;
    }

    public static String pedirNombre() {
        System.out.print("Introduce nombre: ");
        return sc.next();
    }

    public static int pedirEdad() {
        System.out.print("Introduce edad: ");
        return sc.nextInt();
    }

    public static double pedirSalario() {
        System.out.print("Introduce salario base: ");
        return sc.nextDouble();
    }

    public static Lenguajes pedirLenguaje() {
        do {
            mostrarLenguajes();
            switch (sc.nextInt()) {
                case 1 -> {
                    return Lenguajes.JAVA;
                }
                case 2 -> {
                    return Lenguajes.PYTHON;
                }
                case 3 -> {
                    return Lenguajes.CPP;
                }
                default -> System.out.println("Ha insertado una opcion que no esta en el menu, vuelve a intentarlo");
            }
        } while (true);
    }

    public static String pedirArea() {
        System.out.print("Introduce area: ");
        return sc.next();
    }

    public static void mostrarEmpleado(int indice) {
        int numEmpleado = Empleado.getNumTrabajadores();

        if (indice < 0 || indice >= numEmpleado) {
            System.out.println("Ese empleado no esta en la lista de empleados");
        } else {
            System.out.println(listaEmpleados[indice]);
        }
    }

    public static void listarEmpleados() {
        int numEmpleado = Empleado.getNumTrabajadores();

        for (int i = 0; i < numEmpleado; i++) {
            mostrarEmpleado(i);
            System.out.println();
        }
    }

    public static int getIndiceDni(String dni) {
        int numEmpleado = Empleado.getNumTrabajadores();

        for (int i = 0; i < numEmpleado; i++) {
            if (listaEmpleados[i].getDni().equalsIgnoreCase(dni)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        boolean ejecutando = true;

        do {
            mostrarMenu();
            switch (sc.nextInt()) {
                case 1 -> {
                    altaProgramador();
                    System.out.println("Se ha dado de alta al programador: " + listaEmpleados[Empleado.getNumTrabajadores() - 1]);
                }
                case 2 -> {
                    altaGerente();
                    System.out.println("Se ha dado de alta al gerente: " + listaEmpleados[Empleado.getNumTrabajadores() - 1]);
                }
                case 3 -> listarEmpleados();
                case 4 -> {
                    System.out.print("Introduce el dni del empleado al que quieres mostrar: ");
                    mostrarEmpleado(getIndiceDni(sc.next()));
                }
                case 5 -> {
                    System.out.println("Saliendo... ");
                    ejecutando = false;
                }
                default -> System.out.println("La opcion que ha elejido no esta en el menu");
            }
        } while (ejecutando);
    }
}
