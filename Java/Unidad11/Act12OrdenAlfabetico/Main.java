package Unidad11.Act12OrdenAlfabetico;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = "";
        Set<String> collectionNombre = new TreeSet<>();

        do {
            System.out.print("Introduce un nombre: ");
            nombre = sc.nextLine().trim();

            if (!nombre.equalsIgnoreCase("fin"))
                collectionNombre.add(nombre);

        } while (!nombre.equalsIgnoreCase("fin"));

        System.out.println(collectionNombre);
    }
}
