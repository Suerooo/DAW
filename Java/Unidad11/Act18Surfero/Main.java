package Unidad11.Act18Surfero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorSurfero gestorSurfero = new GestorSurfero();
        Scanner sc = new Scanner(System.in);
        
        gestorSurfero.cargarDatos();
        
        Integer opcion = 0;
        
        do {
            mostrarMenu();
            opcion = pedirInteger(sc, "Introduce una opcion");
            
            switch (opcion) {
                case 1 -> insertarSurfero(gestorSurfero, sc);
                case 2 -> eliminarSurfero(gestorSurfero, sc);
                case 3 -> actulizarNivelSurfero(gestorSurfero, sc);
                case 4 -> gestorSurfero.mostrarTodosSurferos();
                case 5 -> gestorSurfero.mostrarSurferosPorPlaya(pedirString(sc, "Introduce la playa favorita por la que quiere filtrar"));
                case 6 -> gestorSurfero.mostrarSurferosPorNombre(pedirString(sc, "Introduce el nombre por el que quiere filtrar"));
                case 7 -> gestorSurfero.mostrarSurferoNivelMasAlto();
                case 8 -> System.out.println(gestorSurfero.calcularPromedioNivel());
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opcion no existe");
            }
        } while (opcion != 9);
        
        gestorSurfero.guardarDatos();
    }

    private static void insertarSurfero(GestorSurfero gestorSurfero, Scanner sc) {
        String dni = pedirString(sc, "Introduce el dni del surfero que desea ingrear");
        String nombre = pedirString(sc, "Introduce el nombre del surfero que desea ingrear");
        String playaFav = pedirString(sc, "Introduce la playa favorita del surfero que desea ingrear");
        Integer nivel = pedirInteger(sc, "Introduce el nivel del surfero que desea ingrear");

        if (gestorSurfero.insertarSurfero(new Surfero(dni, nombre, playaFav, nivel))) {
            System.out.println("Surfero introducido correctamente");

        } else {
            System.out.println("Ese dni ya esta registrado");
        }
    }

    private static void eliminarSurfero(GestorSurfero gestorSurfero, Scanner sc) {
        Integer id = pedirInteger(sc, "Introduce el id del surfero que desea eliminar");

        if (gestorSurfero.buscarSurfero(id)) {
            
            if (pedirConfirmacion(sc, "¿Esta seguro de querer eliminarlo?")) {
                
                gestorSurfero.eliminarPorID(id);
                System.out.println("Surfero eliminado correctamente");
            } else {
                System.out.println("Operacion cancelada");
            }

        } else {
            System.out.println("Ese surfero no esta registrado");
        }
    }
    
    private static void actulizarNivelSurfero(GestorSurfero gestorSurfero, Scanner sc) {
        Integer id = pedirInteger(sc, "Introduce el id del surfero que quiere actualizar");
        Integer nivel = pedirInteger(sc, "Introduce el nuevo nivel del surfero");
        
        if (gestorSurfero.actualizarNivel(id, nivel)) {
            System.out.println("Surfero actulizado correctamente");
            
        } else {
            System.out.println("Ese surfero no esta registrado");
        }
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("======== MENU PRINCIPAL ========");
        System.out.println();
        System.out.println("1. Insertar nuevo surfero");
        System.out.println("2. Eliminar surfero por ID");
        System.out.println("3. Actulizar nivel surfero");
        System.out.println("4. Listar todos los surferos");
        System.out.println("5. Buscar surferos por playa favorita");
        System.out.println("6. Buscar surferos por nombre");
        System.out.println("7. Mostar surfero con nivel mas alto");
        System.out.println("8. Mostrar promedio del nivel de todos los surferos");
        System.out.println("9. Salir");
    }

    private static String pedirString(Scanner sc, String mensaje) {
        System.out.print(mensaje + ": ");
        return sc.nextLine().trim();
    }

    private static Integer pedirInteger(Scanner sc, String mensaje) {
        System.out.print(mensaje + ": ");
        Integer numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    private static boolean pedirConfirmacion(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        
        do {
            System.out.println("1. Si");
            System.out.println("2. No");

            switch (pedirInteger(sc, "Introduce una opcion")) {
                case 1:return true;
                case 2:return false;
                default: System.out.println("Esa opcion no existe");
            }
        } while (true);
    }
}
