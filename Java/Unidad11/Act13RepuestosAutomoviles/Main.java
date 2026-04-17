package Unidad11.Act13RepuestosAutomoviles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static Map<String, Integer> repuestos = new TreeMap<>();

    public static void main(String[] args) {
        cargarDatos();
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1 -> System.out.println(darAlta(pedirRepuesto(), pedirStock())
                        ? "Dado de alta correctamente"
                        : "Ese repuesto ya existe no se pudo dar de alta");

                case 2 -> System.out.println(darBaja(pedirRepuesto())
                        ? "Dado de baja correctamente"
                        : "Ese repuesto no existe no se pudo dar de baja");

                case 3 -> System.out.println(actualizar(pedirRepuesto(), pedirStock())
                        ? "Repuesto actualizado"
                        : "Ese repuesto no existe no se puede actualizar");

                case 4 -> mostrar();

                case 5 -> System.out.println("Saliendo...");

                default -> System.out.println("Esa opcion no existe.");
            }
        } while (opcion != 5);

        guardarDatos();
    }

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Dar de alta");
        System.out.println("2. Dar de baja");
        System.out.println("3. Actualizar");
        System.out.println("4. Mostrar");
        System.out.println("5. Salir");
        System.out.print("Introduce una opcion: ");
    }

    public static boolean darAlta(String repuesto, Integer stock) {
        if (repuestos.containsKey(repuesto)) {
            return false;

        } else {
            repuestos.put(repuesto, stock);
            return true;
        }
    }

    public static boolean darBaja(String repuesto) {
        if (repuestos.containsKey(repuesto)) {

            repuestos.remove(repuesto);
            return true;

        } else {
            return false;
        }
    }

    public static boolean actualizar(String repuesto, Integer stock) {
        if (repuestos.containsKey(repuesto)) {

            repuestos.put(repuesto, stock);
            return true;

        } else {
            return false;
        }
    }

    public static void mostrar() {
        Set<Map.Entry<String, Integer>> repuestosSet = repuestos.entrySet();
        Iterator<Map.Entry<String, Integer>> it = repuestosSet.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();

            System.out.printf("Repuesto: %s -> Stock actual: %d%n", e.getKey(), e.getValue());
        }
    }

    public static void guardarDatos() {
        try (ObjectOutputStream writer = new ObjectOutputStream(
                new FileOutputStream("Java\\Unidad11\\Act13RepuestosAutomoviles\\repuestos.dat"))) {

            writer.writeObject(repuestos);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void cargarDatos() {
        try (ObjectInputStream read = new ObjectInputStream(
                new FileInputStream("Java\\\\Unidad11\\\\Act13RepuestosAutomoviles\\\\repuestos.dat"))) {

            repuestos = (Map<String, Integer>) read.readObject();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Integer pedirStock() {
        System.out.print("Introduce el stock del repuesto: ");
        return sc.nextInt();
    }

    public static String pedirRepuesto() {
        System.out.print("Introduce el nombre del repuesto: ");
        return sc.next();
    }

}
