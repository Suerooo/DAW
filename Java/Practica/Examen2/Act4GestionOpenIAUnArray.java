package Practica.Examen2;

import java.util.*;

public class Act4GestionOpenIAUnArray {
    static final Scanner sc = new Scanner(System.in);
    static final String DELIMITADOR = ":";

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
    
    // ----------------------------------------------------------------------
    // ----------------------  Extraer datos  -------------------------------
    // ----------------------------------------------------------------------

    static String extraerNombreEmpleado(String[] listaEmpleados, int indiceEmpleado) {
        String[] unicoEmpleado = listaEmpleados[indiceEmpleado].split(DELIMITADOR);

        return unicoEmpleado[0];
    }

    static String extraerLenguajeEmpleado(String[] listaEmpleados, int indiceEmpleado) {
        String[] unicoEmpleado = listaEmpleados[indiceEmpleado].split(DELIMITADOR);

        return unicoEmpleado[1];
    }

    static int extraerKeyEmpleado(String[] listaEmpleados, int indiceEmpleado) {
        String[] unicoEmpleado = listaEmpleados[indiceEmpleado].split(DELIMITADOR);

        return Integer.parseInt(unicoEmpleado[2]);
    }

    static double extraerSalarioEmpleado(String[] listaEmpleados, int indiceEmpleado) {
        String[] unicoEmpleado = listaEmpleados[indiceEmpleado].split(DELIMITADOR);

        return Double.parseDouble(unicoEmpleado[3]);
    }

    // ----------------------------------------------------------------------
    // --------------------  Agregar elementos  -----------------------------
    // ----------------------------------------------------------------------

    static String[] agregarElemento(String[] array, String elemento) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = elemento;

        return array;
    }

    static double[] agregarElemento(double[] array, double elemento) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = elemento;

        return array;
    }

    // ----------------------------------------------------------------------
    // -----------------------  Auxiliares  ---------------------------------
    // ----------------------------------------------------------------------

    static int localizarIndiceEmpleado(String[] listaEmpleados, int keyEmpleadoALocalizar) {
        for (int i = 0; i < listaEmpleados.length; i++) {
            if (extraerKeyEmpleado(listaEmpleados, i) == keyEmpleadoALocalizar) {
                return i;
            }
        }

        return -1;
    }

    static void mostrarUnEmpleado(String[] listaEmpleados, int indiceEmpleado) {
        String nombre = extraerNombreEmpleado(listaEmpleados, indiceEmpleado);
        String lenguaje = extraerLenguajeEmpleado(listaEmpleados, indiceEmpleado);
        int key = extraerKeyEmpleado(listaEmpleados, indiceEmpleado);
        double salario = extraerSalarioEmpleado(listaEmpleados, indiceEmpleado);

        System.out.println(
            (indiceEmpleado + 1) + "º empleado: " +
            "Nombre -> " + nombre +
            " | Lenguaje -> " + lenguaje +
            " | Key -> " + key +
            " | Salario -> " + salario
        );
    }

    // ----------------------------------------------------------------------
    // --------------------------  Menú  ------------------------------------
    // ----------------------------------------------------------------------

    // --- 1ª opción "Ingresar" ---
    static String[] ingresarEmpleado(String[] listaEmpleados, String nombre, String lenguaje, int key, double salario) {
        if (localizarIndiceEmpleado(listaEmpleados, key) != -1) {
            System.out.println("La key de ese empleado ya este registrada");

            return listaEmpleados;

        } else {
            String nuevoEmpleado = nombre + DELIMITADOR + lenguaje + DELIMITADOR + key + DELIMITADOR + salario;
            listaEmpleados = agregarElemento(listaEmpleados, nuevoEmpleado);

            System.out.println("Empleado agregado con éxito");

            return listaEmpleados;
        }
    }

    // --- 2ª opción "Mostrar" ---
    static void mostrarEmpleados(String[] listaEmpleados) {
        for (int i = 0; i < listaEmpleados.length; i++) {
            mostrarUnEmpleado(listaEmpleados, i);
        }
    }

    // --- 3ª opción "Lenguaje" ---
    static String[] extraerEmpleadosXLenguaje(String[] listaEmpleados, String lenguaje) {
        String[] listaEmpleadosXLenguaje = new String[0];

        for (int i = 0; i < listaEmpleados.length; i++) {
            if (extraerLenguajeEmpleado(listaEmpleados, i).equalsIgnoreCase(lenguaje)) {
                listaEmpleadosXLenguaje = agregarElemento(listaEmpleadosXLenguaje, listaEmpleados[i]);
            }
        }

        return listaEmpleadosXLenguaje;
    }

    // --- 4ª opción "Eliminar" ---
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

    // --- 5ª opción "Salarios" ---
    static void mostrarEmpleadoEntreSalarios(String[] listaEmpleados, double salario1, double salario2) {
        double salarioMax = salario1 > salario2 ? salario1 : salario2;
        double salarioMin = salario1 < salario2 ? salario1 : salario2;

        for (int i = 0; i < listaEmpleados.length; i++) {
            if (extraerSalarioEmpleado(listaEmpleados, i) >= salarioMin && extraerSalarioEmpleado(listaEmpleados, i) <= salarioMax) {
                mostrarUnEmpleado(listaEmpleados, i);
            }
        }
    }

    // --- 6ª opción "Aumento" ---
    static String[] aumentarSalarioEmpleados(String[] listaEmpleados, double aumento) {
        if (aumento>0) aumento /= 100;
        double salarioModificado;

        for (int i = 0; i < listaEmpleados.length; i++) {
            salarioModificado = extraerSalarioEmpleado(listaEmpleados, i) + (aumento * extraerSalarioEmpleado(listaEmpleados, i));

            listaEmpleados[i] = 
            extraerNombreEmpleado(listaEmpleados, i) + DELIMITADOR +
            extraerLenguajeEmpleado(listaEmpleados, i) + DELIMITADOR +
            extraerKeyEmpleado(listaEmpleados, i) + DELIMITADOR +
            salarioModificado;
        }

        return listaEmpleados;
    }
    
    // --- 7ª opción "Ordenar" ---
    static String[] ordenarKeyAscendente(String[] listaEmpleados) {
        for (int i = 0; i < listaEmpleados.length; i++) {
            for (int j = 0; j < listaEmpleados.length - i - 1; j++) {
                if (extraerKeyEmpleado(listaEmpleados, j) > extraerKeyEmpleado(listaEmpleados, j + 1)) {
                    String tempEmpleado = listaEmpleados[j +1];
                    
                    listaEmpleados[j + 1] = listaEmpleados[j];
                    listaEmpleados[j] = tempEmpleado;
                }
            }
        }

        return listaEmpleados;
    }

    // --- 8ª opción "Cálculo de matriz" ---
    static double[] sumarFilasMatriz(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        double[] listaResultadoSuma = new double[0];
        double resultadoSuma;

        for (int i = 0; i < filas; i++) {
            resultadoSuma = 0;

            for (int j = 0; j < columnas; j++) {
                resultadoSuma += matriz[i][j];
            }

            listaResultadoSuma = agregarElemento(listaResultadoSuma, resultadoSuma);
        }

        return listaResultadoSuma;
    }

    public static void main(String[] args) {
        // userName(0):language(1):key(2):salary(3)
        String[] listaEmpleados = new String[3];
        int opcion;

        listaEmpleados[0] = "Raul:JAVA:112:2000";
        listaEmpleados[1] = "Pedro:PHP:113:3000";
        listaEmpleados[2] = "Raul:JAVA:110:1000";

        double[][] matriz = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}
        };

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
                case 6 -> {
                    System.out.print("Introduce el porcentaje de aumento que quiere realizar a los empleados: ");
                    listaEmpleados = aumentarSalarioEmpleados(listaEmpleados, sc.nextDouble());
                }
                case 7 -> listaEmpleados = ordenarKeyAscendente(listaEmpleados);
                case 8 -> {
                    double[] listaResultadoSuma = sumarFilasMatriz(matriz);
                    System.out.println("Resultado suma de filas: " + Arrays.toString(listaResultadoSuma));
                }
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opción no existe");
            }

        } while (opcion != 0);
    }
}
