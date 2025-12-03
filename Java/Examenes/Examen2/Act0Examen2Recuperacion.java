package Examenes.Examen2;

import java.util.*;

public class Act0Examen2Recuperacion {
    static final Scanner sc = new Scanner(System.in);
    static final String CONCATENACION = "-";
    static String[] listaAlumnos = new String[3];

    //
    // Auxiliares
    //

    static void mostrarMenu() {
        System.out.println("");
        System.out.println("MENÚ");
        System.out.println("");
        System.out.println("1. Añadir");
        System.out.println("2. Mostrar");
        System.out.println("3. Ordenar");
        System.out.println("4. Usuarios entre dos edades ");
        System.out.println("5. Media de valores entre edades");
        System.out.println("6. Horas totales aprox");
        System.out.println("7. Matriz");
        System.out.println("0. Salir");
        System.out.println("");
    }

    static void mostrarAlumno(int indiceAlumno) {
        System.out.println(extraerEdad(indiceAlumno) + " - " + extraerTiempo(indiceAlumno));
    }

    static int extraerEdad(int indiceAlumno) {
        String[] alumno = listaAlumnos[indiceAlumno].split(CONCATENACION);

        return Integer.parseInt(alumno[0]);
    }

    static int extraerTiempo(int indiceAlumno) {
        String[] alumno = listaAlumnos[indiceAlumno].split(CONCATENACION);

        return Integer.parseInt(alumno[1]);
    }

    static int pedirEdad() {
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 10 && edad <= 18) {
            return edad;

        } else {
            return -1;
        }
        
    }

    static int pedirTiempo() {
        System.out.print("Introduce el tiempo que pasas en redes sociales: ");
        
        return sc.nextInt();
    }

    //
    // Menu
    //

    // Agregar
    static void agregarAlumno() {
        int edadNuevoAlumno = pedirEdad();

        if (edadNuevoAlumno == -1) {
            System.out.println("Tu edad tiene que estar entre 10 y 18 para poder participar");

        } else {
            String nuevoAlumno = edadNuevoAlumno + CONCATENACION + pedirTiempo();
        
            listaAlumnos = Arrays.copyOf(listaAlumnos, listaAlumnos.length +1 );
            listaAlumnos[listaAlumnos.length-1] = nuevoAlumno;
        }
    }

    // Mostrar
    static void mostrarTodosAlumnos() {
        System.out.println("Edad - Minutos");
        System.out.println("---------------");

        for(int i = 0; i < listaAlumnos.length; i++) {
            mostrarAlumno(i);
        }
        
        System.out.println("");
        System.out.println("Total: " + listaAlumnos.length + " alumnos");
    }

    // Ordenar
    static void ordenarAlumnos() {
        for (int i = 0; i < listaAlumnos.length; i++) {
            for (int j = 0; j < listaAlumnos.length - 1 - i; j++) {
                if (extraerTiempo(j) < extraerTiempo(j + 1) ) {
                    String tempAlumno = listaAlumnos[j + 1];
                    listaAlumnos[j + 1] = listaAlumnos [j];
                    listaAlumnos[j] = tempAlumno;
                }
            }
        }
    }

    public static void main(String[] args) {
        listaAlumnos[0] = "18-32";
        listaAlumnos[1] = "15-130";
        listaAlumnos[2] = "12-30";

        int opcion;

        do {
            mostrarMenu();

            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> agregarAlumno();
                case 2 -> mostrarTodosAlumnos();
                case 3 -> ordenarAlumnos();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opción no existe");
            }

        } while (opcion != 0);
    }
}
