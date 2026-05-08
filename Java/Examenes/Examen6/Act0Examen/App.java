package Examenes.Examen6.Act0Examen;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GestionProgramador gestionProgramador = new GestionProgramador();
        Scanner sc = new Scanner(System.in);

        gestionProgramador.cargarDatos();

        Integer opcion;
        do {
            mostrarMenu();
            opcion = pedirInteger("Introduce una opcion: ", sc);

            switch (opcion) {
                case 1 -> insertarProgramador(gestionProgramador, sc);
                case 2 -> eliminarPorgramador(gestionProgramador, sc);
                case 3 -> editarProgramador(gestionProgramador, sc);
                case 4 -> mostrarListaProgramadores(gestionProgramador);
                case 5 -> mostrarProgramadorPorID(gestionProgramador, sc);
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opcion no existe");
            }

        } while (opcion != 6);

        gestionProgramador.guardarDatos();
        sc.close();
    }

    // ==================================================
    // MENU
    // ==================================================

    // Opcion 1 Insertar programador

    private static void insertarProgramador(GestionProgramador gestionProgramador, Scanner sc) {
        Integer id = pedirInteger("Introduce el id del nuevo programador: ", sc);
        String nombre = pedirString("Introduce el nombre del nuevo programador: ", sc);
        String lenguajeProg = pedirString("Introduce el lenguaje de programacion del nuevo programador: ", sc);
        Double saldo = pedirDouble("Introduce el saldo del nuevo programador: ", sc);

        try {
            if (gestionProgramador.insertarProgramador(id, nombre, lenguajeProg, saldo)) {
                System.out.println("Programador insertado con exito");

            } else {
                System.out.println("Ese id ya esta registrado");
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    // Opcion 2 Eliminar programador

    private static void eliminarPorgramador(GestionProgramador gestionProgramador, Scanner sc) {
        Integer id = pedirInteger("Introduce el id del programador que desea eliminar: ", sc);

        if (gestionProgramador.eliminarPorgramador(id)) {
            System.out.println("Porgramador elimnado con exito");

        } else {
            System.out.println("Ese id no esa registrado");
        }
    }

    // Opcion 3 Editar programador

    private static void editarProgramador(GestionProgramador gestionProgramador, Scanner sc) {
        Integer id = pedirInteger("Introduce el id del programador que desea editar: ", sc);
        String lenguajeProg = pedirString("Introduce el nuevo lenguaje de programacion: ", sc);

        try {
            if (gestionProgramador.editarProgramador(id, lenguajeProg.trim())) {
                System.out.println("Porgramador editado con exito");

            } else {
                System.out.println("Ese id no esa registrado");
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    // Opcion 4 Visualizar plantilla

    private static void mostrarListaProgramadores(GestionProgramador gestionProgramador) {
        if (!gestionProgramador.mostrarListaProgramadores()) {
            System.out.println("No hay programadores registrados");
        }
    }

    // Opcion 5 Visualizar plantilla

    private static void mostrarProgramadorPorID(GestionProgramador gestionProgramador, Scanner sc) {
        Integer id = pedirInteger("Introduce el id del programador que desea mostrar: ", sc);

        if (!gestionProgramador.mostrarProgramador(id)) {
            System.out.println("No hay programadores registrados");
        }
    }

    // ==================================================
    // AUXILIARES
    // ==================================================

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("========== MENU ==========");
        System.out.println();
        System.out.println("1. Alta programador");
        System.out.println("2. Baja programador");
        System.out.println("3. Editar programador");
        System.out.println("4. Visualizar plantilla");
        System.out.println("5. Consultar por ID");
        System.out.println("6. Cerrar");
    }

    private static String pedirString(String mensaje, Scanner sc) {
        System.out.print(mensaje);
        return sc.nextLine();

    }

    private static Integer pedirInteger(String mensaje, Scanner sc) {
        System.out.print(mensaje);
        Integer num = sc.nextInt();
        sc.nextLine();
        return num;

    }

    private static Double pedirDouble(String mensaje, Scanner sc) {
        System.out.print(mensaje);
        Double num = sc.nextDouble();
        sc.nextLine();
        return num;
    }
}