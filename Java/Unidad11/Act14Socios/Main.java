package Unidad11.Act14Socios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static Map<String, Socio> socios = new TreeMap<>();

    public static void main(String[] args) {
        int opcion = 0;
        cargarDatos();

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1 ->
                    System.out.println(darAlta(pedirApodo(), pedirNombre(), pedirFecha()) ? "Dado de alta correctamente"
                            : "Ese socio ya existe");

                case 2 ->
                    System.out.println(darBaja(pedirApodo()) ? "Dado de baja correctamente" : "Ese socio no existe");

                case 3 -> mostrar(socios);
                case 4 -> mostrar(socios = new TreeMap<>(new Comparator<Map.Entry<String, Socio>>() {
                    public int compare(Entry<String, Socio> o1, Entry<String, Socio> o2) {
                        return o1.getKey().an;
                    }
                }));
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

    public static void mostrar(Map<String, Socio> mapa) {
        Set<Map.Entry<String, Socio>> mapaSet = mapa.entrySet();
        Iterator<Map.Entry<String, Socio>> it = mapaSet.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Socio> e = it.next();
            System.out.printf("Apodo: %s -> Info: %s%n", e.getKey(), e.getValue());
        }
    }

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
}
