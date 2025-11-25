package Practica.Examen2.TipoExamen;

import java.util.*;

public class Act3GestionOpenIAUnArray {
    static final Scanner sc = new Scanner(System.in);
    static final String delimitador = ":";

    static void mostrarMenu() {
        System.out.println("\n1. Ingresar");
        System.out.println("2. Mostrar");
        System.out.println("3. Lenguaje");
        System.out.println("4. Eliminar");
        System.out.println("5. Salarios");
        System.out.println("6. Aumentos");
        System.out.println("7. Ordenar");
        System.out.println("8. Matriz");
        System.out.println("0. Salir");

    }

    static String elegirLenguaje() {
        int opcion;
        String lenguajeElegido="";

        do {
            lenguajeElegido = "";

            System.out.println("Elije un lenguaje: ");
            System.out.println("\t1. Java");
            System.out.println("\t2. Python");
            System.out.println("\t3. PHP");
            System.out.println("\t4. JS");
            System.out.println("\t5. CPP");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> lenguajeElegido = "JAVA";
                case 2 -> lenguajeElegido = "PYTHON";
                case 3 -> lenguajeElegido = "PHP";
                case 4 -> lenguajeElegido = "JS";
                case 5 -> lenguajeElegido = "CPP";
                default -> System.out.println("Esa opción no se puede elegir");
            }
        } while (opcion < 1 || opcion > 5);

        return lenguajeElegido;
    }

    static String extraerNombreEmpleado(String[] listaEmpleados, int indiceEmpleado) {
        String[] unicoEmpleado = listaEmpleados[indiceEmpleado].split(delimitador);

        return unicoEmpleado[0];
    }

    static String extraerLenguajeEmpleado(String[] listaEmpleados, int indiceEmpleado) {
        String[] unicoEmpleado = listaEmpleados[indiceEmpleado].split(delimitador);

        return unicoEmpleado[1];
    }

    static int extraerKeyEmpleado(String[] listaEmpleados, int indiceEmpleado) {
        String[] unicoEmpleado = listaEmpleados[indiceEmpleado].split(delimitador);

        return Integer.parseInt(unicoEmpleado[2]);
    }

    static double extraerSalarioEmpleado(String[] listaEmpleados, int indiceEmpleado) {
        String[] unicoEmpleado = listaEmpleados[indiceEmpleado].split(delimitador);

        return Double.parseDouble(unicoEmpleado[3]);
    }

    static int localizarIndiceEmpleado(String[] listaEmpleados, int keyEmpleadoALocalizar) {
        for (int i = 0; i < listaEmpleados.length; i++) {
            if (extraerKeyEmpleado(listaEmpleados, i) == keyEmpleadoALocalizar) {
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

    static String[] ingresarEmpleado(String[] listaEmpleados, String nombre, String lenguaje, int key, double salario) {
        if (localizarIndiceEmpleado(listaEmpleados, key) != -1) {
            System.out.println("La key de ese empleado ya este registrada");

            return listaEmpleados;

        } else {
            String nuevoEmpleado = nombre + delimitador + lenguaje + delimitador + key + delimitador + salario;
            listaEmpleados = agregarElemento(listaEmpleados, nuevoEmpleado);

            System.out.println("Empleado agregado con existo");

            return listaEmpleados;
        }
    }

    static void mostrarUnEmpleado(String[] listaEmpleados, int indiceEmpleado) {
        System.out.println((indiceEmpleado+1) + "º empleado: Nombre-> " +
            extraerNombreEmpleado(listaEmpleados, indiceEmpleado) + " Lenguaje-> " +
            extraerLenguajeEmpleado(listaEmpleados, indiceEmpleado) + " Key-> " +
            extraerKeyEmpleado(listaEmpleados, indiceEmpleado) + " Salario-> " +
            extraerSalarioEmpleado(listaEmpleados, indiceEmpleado));
    }

    static void mostrarEmpleados(String[] listaEmpleados) {
        for (int i = 0; i < listaEmpleados.length; i++) {
            mostrarUnEmpleado(listaEmpleados, i);
        }
    }

    static String[] extraerEmpleadosXLenguaje(String[] listaEmpleados, String lenguaje) {
        String[] listaEmpleadosXLenguaje = new String[0];

        for (int i = 0; i < listaEmpleados.length; i++) {
            if (extraerLenguajeEmpleado(listaEmpleados, i).equalsIgnoreCase(lenguaje)) {
                listaEmpleadosXLenguaje = agregarElemento(listaEmpleadosXLenguaje, listaEmpleados[i]);
            }
        }

        return listaEmpleadosXLenguaje;
    }

    static String[] eliminarEmpleado(String[] listaEmpleados, int key) {
        String[] listaEmpleadosActualizada = new String[0];

        if (localizarIndiceEmpleado(listaEmpleados, key) == -1) {
            System.out.println("Esa key no pertenece a ningún empleado");

            return listaEmpleados;

        } else {
            for (int i = 0; i < listaEmpleados.length; i++) {
                if (extraerKeyEmpleado(listaEmpleados, i) != key) {
                    listaEmpleadosActualizada = agregarElemento(listaEmpleadosActualizada, listaEmpleados[i]);
                }
            }
            System.out.println("Empleado eliminado con existo");

            return listaEmpleadosActualizada;
        }   
    }

    static void mostrarEmpleadoEntreSalarios(String[] listaEmpleados, double salario1, double salario2) {
        double salarioMax = salario1 > salario2 ? salario1 : salario2;
        double salarioMin = salario1 < salario2 ? salario1 : salario2;

        for (int i = 0; i < listaEmpleados.length; i++) {
            if (extraerSalarioEmpleado(listaEmpleados, i) >= salarioMin && extraerSalarioEmpleado(listaEmpleados, i) <= salarioMax) {
                mostrarUnEmpleado(listaEmpleados, i);
            }
        }
    }

    public static void main(String[] args) {
        // userName(0):language(1):key(2):salary(3)
        String[] listaEmpleados = new String[3];
        int opcion;

        listaEmpleados[0] = "Raul:JAVA:111:2000";
        listaEmpleados[1] = "Pedro:PHP:112:3000";
        listaEmpleados[2] = "Raul:JAVA:113:1000";

        do {
            mostrarMenu();

            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce el nombre del nuevo empleado: ");
                    String nombreEmpleadoNuevo = sc.next();

                    String lenguajeEmpleadoNuevo = elegirLenguaje();

                    System.out.print("Introduce la key del nuevo empleado: ");
                    int keyEmpleadoNuevo = sc.nextInt();

                    System.out.print("Introduce el salario del nuevo empleado: ");
                    double salarioEmpleadoNuevo = sc.nextDouble();

                    listaEmpleados = ingresarEmpleado(listaEmpleados, nombreEmpleadoNuevo, lenguajeEmpleadoNuevo, keyEmpleadoNuevo, salarioEmpleadoNuevo);
                }
                case 2 -> mostrarEmpleados(listaEmpleados);
                case 3 -> {
                    String lenguaje = elegirLenguaje();

                    String[] listaEmpleadosXLenguaje = extraerEmpleadosXLenguaje(listaEmpleados, lenguaje);
                    mostrarEmpleados(listaEmpleadosXLenguaje);
                }
                case 4 -> {
                    System.out.print("Introduce la key del empleado que quieres eliminar: ");
                    int keyEmpleadoAEliminar = sc.nextInt();

                    listaEmpleados = eliminarEmpleado(listaEmpleados, keyEmpleadoAEliminar);
                }
                case 5 -> {
                    System.out.print("Introduce desde que salario quieres buscar: ");
                    double salario1 = sc.nextDouble();

                    System.out.print("Introduce hasta que salario quieres buscar: ");
                    double salario2 = sc.nextDouble();

                    mostrarEmpleadoEntreSalarios(listaEmpleados, salario1, salario2);
                }
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opción no existe");
            }

        } while (opcion != 0);
    }
}
