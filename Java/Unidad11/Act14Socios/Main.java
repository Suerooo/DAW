package Unidad11.Act14Socios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static Map<String, Socio> socios = new TreeMap<>();

    public static void main(String[] args) {
        Map<Socio, String> mapaAntiguedad = new TreeMap<>((o1, o2) -> o1.antiguedad() - o2.antiguedad());

        int opcion = 0;
        cargarDatos();

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1 -> System.out.println(darAlta(pedirApodo(), pedirNombre(), pedirFecha())
                        ? "Dado de alta correctamente"
                        : "Ese socio ya existe");

                case 2 -> System.out.println(darBaja(pedirApodo())
                        ? "Dado de baja correctamente"
                        : "Ese socio no existe");

                case 3 -> System.out.println(modificar(pedirApodo(), pedirNombre(), pedirFecha())
                        ? "Modificado correctamente"
                        : "Ese socio no existe");

                case 4 -> mostrar();

                case 5 -> {
                    mostrar(rellenarMapaInvertido(mapaAntiguedad, Integer.MAX_VALUE));
                    mapaAntiguedad.clear();
                }

                case 6 -> {
                    mostrar(rellenarMapaInvertido(mapaAntiguedad, pedirAnio()));
                    mapaAntiguedad.clear();
                }

                case 7 -> System.out.println("Saliendo...");

                default -> System.out.println("Esa opcion no existe");
            }

        } while (opcion != 7);

        guardarDatos();
    }

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Alta socio");
        System.out.println("2. Baja socio");
        System.out.println("3. Modificacion socio");
        System.out.println("4. Listar socios por apodo");
        System.out.println("5. Listar socios por antigüedad");
        System.out.println("6. Listar socios con alta anterior a un año determinado");
        System.out.println("7. Salir");
        System.out.print("Introduce una opcion: ");
    }

    public static boolean darAlta(String apodo, String nombre, String fechaAlta) {

        if (socios.containsKey(apodo)) {
            return false;

        } else {
            socios.put(apodo, new Socio(apodo, nombre, fechaAlta));
            return true;
        }
    }

    public static boolean darBaja(String apodo) {

        if (socios.containsKey(apodo)) {

            socios.remove(apodo);
            return true;

        } else {
            return false;
        }
    }

    public static boolean modificar(String apodo, String nombre, String fechaAlta) {
        if (socios.containsKey(apodo)) {

            socios.put(apodo, new Socio(apodo, nombre, fechaAlta));
            return true;

        } else {
            return false;
        }
    }

    public static void mostrar() {
        for (Map.Entry<String, Socio> entry : socios.entrySet()) {
            System.out.printf("Apodo: %s -> Info: %s%n", entry.getKey(), entry.getValue());
        }
    }

    public static void mostrar(Map<Socio, String> mapa) {
        for (Map.Entry<Socio, String> entry : mapa.entrySet()) {
            System.out.printf("Apodo: %s -> Info: %s%n", entry.getValue(), entry.getKey());
        }
    }

    // METODOS AUXILIARES
    public static Map<Socio, String> rellenarMapaInvertido(Map<Socio, String> mapa, Integer year) {
        for (Map.Entry<String, Socio> entry : socios.entrySet()) {
            if (year > entry.getValue().fechaAlta.getYear()) {
                mapa.put(entry.getValue(), entry.getKey());
            }
        }

        return mapa;
    }

    public static String pedirApodo() {
        System.out.print("Introduce el apodo: ");
        return sc.next();
    }

    public static String pedirNombre() {
        System.out.print("Introduce el nombre: ");
        return sc.next();
    }

    public static String pedirFecha() {
        System.out.print("Introduce la fecha (dd/MM/yyyy): ");
        return sc.next();
    }

    public static Integer pedirAnio() {
        System.out.print("Introduce el año: ");
        return sc.nextInt();
    }

    // METODOS DE PERSISTENCIA DE DATOS
    public static void guardarDatos() {
        try (ObjectOutputStream writer = new ObjectOutputStream(
                new FileOutputStream("Java\\Unidad11\\Act14Socios\\club.dat"))) {

            writer.writeObject(socios);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void cargarDatos() {
        try (ObjectInputStream read = new ObjectInputStream(
                new FileInputStream("Java\\Unidad11\\Act14Socios\\club.dat"))) {

            socios = (Map<String, Socio>) read.readObject();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
