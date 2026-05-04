package Unidad11.Act16GestionJornadas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
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
                    
                case 2 -> System.out.println(bajaTrabajador(pedirDNI()) 
                    ? "Trabajador dado de baja" 
                    : "Ese trabajador no esta dado de alta");
<<<<<<< HEAD
                
                case 3 -> System.out.println(trabajadores);
=======
                    
                case 3 -> System.out.println(altaJornada(pedirDNI()));
                
                case 4 -> mostrarJornadas(pedirDNI());
>>>>>>> 5254a9b8ae6be269ae846175fc14c0191c810ee8
                
                default -> System.out.println("Esa opcion no existe");
            }
        } while (opcion != 5);
        
        guardar();
    }
    
    public static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Alta de trabajador");
        System.out.println("2. Baja de trabajador");
        System.out.println("3. Alta de jornada");
        System.out.println("4. Mostrar jornadas");
        System.out.println("5. Salir");
        System.out.print("Introduce una opcion: ");
    }
    
    public static boolean altaTrabajador(String dni) {
<<<<<<< HEAD

        trabajadores.putIfAbsent(dni, new ArrayList<>());
        
        return !(trabajadores.containsKey(dni));
    }
    
    public static boolean bajaTrabajador(String dni) {
        
        return trabajadores.remove(dni) != null;
=======
        return trabajadores.putIfAbsent(dni, new ArrayList<>()) == null;
    }
    
    public static boolean bajaTrabajador(String dni) {
        if (trabajadores.containsKey(dni)) {
        
            trabajadores.remove(dni);
            return true;
        
        } else {
            return false;
        }
        
    }
    
    public static boolean altaJornada(String dni) {
        System.out.println("Introduce la fecha de jornada: ");
        LocalDate fechaJornada = crearFecha();
        
        System.out.println("Introduce la hora de entrada: ");
        LocalTime horaEntrada = crearHora();
        
        System.out.println("Introduce la hora de salida: ");
        LocalTime horaSalida = crearHora();
        
        return trabajadores.get(dni).add(new Jornada(dni, fechaJornada, horaEntrada, horaSalida));
    }
    
    public static LocalTime crearHora() {
        System.out.print("  Hora: ");
        Integer hora = sc.nextInt();
        
        System.out.print("  Minutos: ");
        Integer minuto = sc.nextInt();
        
        return LocalTime.of(hora, minuto);
    }
    
    public static LocalDate crearFecha() {
        System.out.print("  Año: ");
        Integer anio = sc.nextInt();
        
        System.out.print("  Mes: ");
        Integer mes = sc.nextInt();
        
        System.out.print("  Dia del mes: ");
        Integer dia = sc.nextInt();
        
        return LocalDate.of(anio, mes, dia);
    }
    
    public static void mostrarJornadas(String dni) {
        System.out.println(trabajadores.get(dni) == null ? "Ese trabajador no esta dado de alta" : trabajadores.get(dni));
>>>>>>> 5254a9b8ae6be269ae846175fc14c0191c810ee8
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
        try (ObjectInputStream read = new ObjectInputStream(new FileInputStream("Java\\Unidad11\\Act16GestionJornadas\\jornada.dat"))) {

            trabajadores = (Map<String, List<Jornada>>) read.readObject();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
