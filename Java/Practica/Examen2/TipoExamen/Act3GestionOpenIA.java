package Practica.Examen2.TipoExamen;

import java.util.Arrays;
import java.util.Scanner;

public class Act3GestionOpenIA {
    static final Scanner sc = new Scanner(System.in);
    static final String delimitador = ":";

    static void mostrarMenu() {
        System.out.println("1. Ingresar");
        System.out.println("2. Mostrar");
        System.out.println("3. Lenguaje");
        System.out.println("4. Eliminar");
        System.out.println("5. Salarios");
        System.out.println("6. Aumentos");
        System.out.println("7. Ordenar");
        System.out.println("8. Matriz");
        System.out.println("0. Salir");

    }

    static String extraerNombreEmpleado(String[] empleados, int indiceEmpleado) {
        String[] unicoEmpleado = empleados[indiceEmpleado].split(delimitador);

        return unicoEmpleado[0];
    }

    static String extraerLenguajeEmpleado(String[] empleados, int indiceEmpleado) {
        String[] unicoEmpleado = empleados[indiceEmpleado].split(delimitador);

        return unicoEmpleado[1];
    }

    static int extraerKeyEmpleado(String[] empleados, int indiceEmpleado) {
        String[] unicoEmpleado = empleados[indiceEmpleado].split(delimitador);

        return Integer.parseInt(unicoEmpleado[2]);
    }

    static double extraerSalarioEmpleado(String[] empleados, int indiceEmpleado) {
        String[] unicoEmpleado = empleados[indiceEmpleado].split(delimitador);

        return Double.parseDouble(unicoEmpleado[3]);
    }

    static int localizarIndiceEmpleado(String[] empleados, int keyEmpleadoALocalizar) {
        for (int i = 0; i < empleados.length; i++) {
            if (extraerKeyEmpleado(empleados, i) == keyEmpleadoALocalizar) {
                return i;
            }
        }

        return -1;
    }

    static String[] agregarElemento(String[] aux, String elemento) {
        aux = Arrays.copyOf(aux, aux.length + 1);
        aux[aux.length - 1] = elemento;

        return aux;
    }

    static String[] ingresarEmpleado(String[] empleados, String nombre, String lenguaje, int key, double salario) {
        if (localizarIndiceEmpleado(empleados, key) != -1) {
            System.out.println("La key de ese empleado ya este registrada");
            return empleados;

        } else {
            String nuevoEmpleado = nombre + delimitador + lenguaje + delimitador + key + delimitador + salario;
            empleados = agregarElemento(empleados, nuevoEmpleado);

            return empleados;
        }
    }

    public static void main(String[] args) {
        // userName(0):language(1):key(2):salary(3)
        String[] empleados = new String[3];
        int opcion;

        empleados[0] = "Raul:JAVA:111:2000";
        empleados[1] = "Pedro:PHP:112:3000";
        empleados[2] = "Raul:JAVA:113:1000";

        do {
            mostrarMenu();

            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce el nombre del nuevo empleado: ");
                    String nombreEmpleadoNuevo = sc.next();

                    System.out.print("Introduce el lenguaje del nuevo empleado: ");
                    String lenguajeEmpleadoNuevo = sc.next();

                    System.out.print("Introduce la key del nuevo empleado: ");
                    int keyEmpleadoNuevo = sc.nextInt();

                    System.out.print("Introduce el salario del nuevo empleado: ");
                    double salarioEmpleadoNuevo = sc.nextDouble();

                    empleados = ingresarEmpleado(empleados, nombreEmpleadoNuevo, lenguajeEmpleadoNuevo,
                            keyEmpleadoNuevo,
                            salarioEmpleadoNuevo);
                }
                default -> System.out.println("Esa opción no existe");
            }

        } while (opcion != 0);
        System.out.println("Saliendo...");
        System.out.println(Arrays.toString(empleados));
    }
}
