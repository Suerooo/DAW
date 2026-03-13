package Unidad10.Act4RegistroTemperatura;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Registro[] listaRegistro = new Registro[0];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cargarDatos();

        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Que temperatura hace ahora: ");
                    addRegistro(sc.nextDouble());
                }
                case 2 -> mostrarRegistros();
                case 3 -> {
                    guardarDatos();
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Ese opcion no existe");
            }
        } while (opcion != 3);
    }

    private static void mostrarMenu() {
        System.out.println("1. Añadir registro");
        System.out.println("2. Mostrar registros");
        System.out.println("3. Guardar y salir");
        System.out.print("Elije una opcion: ");
    }

    private static void addRegistro(Double temperatura) {
        listaRegistro = Arrays.copyOf(listaRegistro, listaRegistro.length + 1);
        listaRegistro[listaRegistro.length - 1] = new Registro(temperatura);
    }

    private static void mostrarRegistros() {
        System.out.println(Arrays.toString(listaRegistro));
    }

    private static void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("Java\\Unidad10\\Act4RegistroTemperatura\\registros.dat"))) {
            out.writeObject(listaRegistro);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void cargarDatos() {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Java\\Unidad10\\Act4RegistroTemperatura\\registros.dat"))) {
            listaRegistro = (Registro[]) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
