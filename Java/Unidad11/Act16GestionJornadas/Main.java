package Unidad11.Act16GestionJornadas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static Map<String, List<Jornada>> trabajadores = new TreeMap<>();
    
    public static void main(String[] args) {
        cargar();
        int opcion = 0;
        
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> System.out.println(altaTrabajador(pedirDNI()) 
                    ? "Trabajador dado de alta" 
                    : "Ese trabajador ya esta dado de alta");
                default -> System.out.println("Esa opcion no existe");
            }
        } while (opcion != 4);
        
        guardar();
    }
    
    public static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Alta de trabajador");
        System.out.println("2. Baja de trabajador");
        System.out.println("3. Alta de jornada");
        System.out.println("4. Salir");
        System.out.print("Introduce una opcion: ");
    }
    
    public static boolean altaTrabajador(String dni) {
        
        if (!trabajadores.containsKey(dni)) {
            
            trabajadores.put(dni, new ArrayList<Jornada>()) ;
            return true;
        }
        
        return false;
    }
    
    public static String pedirDNI() {
        System.out.print("Introduce dni: ");
        return sc.next();
    }
    
    public static void guardar() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Java\\Unidad11\\Act16GestionJornadas\\jornada.dat"))) {
        
            out.writeObject(trabajadores);
            
        } catch (IOException e) {
            System.out.println(e);    
        }
    }
    
    public static void cargar() {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Java\\Unidad11\\Act16GestionJornadas\\jornada.dat"))) {
            
            trabajadores = (Map<String, List<Jornada>>) input.readObject();
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
