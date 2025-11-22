package Practica.Examen2.TipoExamen;

import java.util.*;

public class Act2GestionMicrosoft {
    static Scanner sc=new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("\n1. Cálculo de matriz de datos IA.");
        System.out.println("2. Ingresar usuario.");
        System.out.println("3. Mostrar empleados entre dos niveles");
        System.out.println("4. Edad máxima y mínima.");
        System.out.println("5. Media de edad");
        System.out.println("6. Mostrar datos.");
        System.out.println("7. Eliminar un usuario");
        System.out.println("8. Ordenar");
        System.out.println("0. Salir");
    }

    static double[] sumarColumnas(double[][] matriz) {
        int filas=matriz.length;
        int columnas=matriz[0].length;

        double[] sumaColumnas=new double[columnas];

        for (int i=0; i<columnas; i++) {
            for (int j=0; j<filas; j++) {
                sumaColumnas[i]+=matriz[j][i];
            }
        }

        return sumaColumnas;
    }

    static int[] agregarElementoInt(int[] array, int elemento) {
        array=Arrays.copyOf(array, array.length+1);
        array[array.length-1]=elemento;

        return array;
    }

    static double[] agregarElementoDouble(double[] array, double elemento) {
        array=Arrays.copyOf(array, array.length+1);
        array[array.length-1]=elemento;

        return array;
    }

    static String[] agregarElementoString(String[] array, String elemento) {
        array=Arrays.copyOf(array, array.length+1);
        array[array.length-1]=elemento;

        return array;
    }

    static String[] agregarDatosUsuario(String[] datosUsuarios, String nombre, String dni, int edad) {
        return agregarElementoString(datosUsuarios, (nombre+" - "+dni+" - "+edad));
    }

    static double[] agregarSueldoUsuario(double[] sueldosUsuarios, double sueldo) {
        return agregarElementoDouble(sueldosUsuarios, sueldo);
    }

    static int[] agregarNivelUsuarios(int[] nivelesUsuarios, int nivel) {
        return agregarElementoInt(nivelesUsuarios, nivel);
    }
    
    static String guardarNombreUsuario(String[] datosUsuarios, int indiceUsuario) {
        String[] usuario=datosUsuarios[indiceUsuario].split(" - ");

        return usuario[0];
    }

    static String guardarDNIUsuario(String[] datosUsuarios, int indiceUsuario) {
        String[] usuario=datosUsuarios[indiceUsuario].split(" - ");

        return usuario[1];
    }
    
    static int guardarEdadUsuario(String[] datosUsuarios, int indiceUsuario) {
        String[] usuario=datosUsuarios[indiceUsuario].split(" - ");

        return Integer.parseInt(usuario[2]);
    }

    static void motrarUsuario(String[] datosUsuarios, double[] sueldosUsuarios, int[] nivelesUsuarios, int indiceUsuario) {
        System.out.println(
        "Nombre: "+guardarNombreUsuario(datosUsuarios, indiceUsuario)+" "+
        "DNI: "+guardarDNIUsuario(datosUsuarios, indiceUsuario)+" "+
        "Edad: "+guardarEdadUsuario(datosUsuarios, indiceUsuario)+" "+
        "Sueldo: "+sueldosUsuarios[indiceUsuario]+" "+
        "Nivel: "+nivelesUsuarios[indiceUsuario]);
    }

    static void mostrarUsuarioEntreDosNiveles(String[] datosUsuarios, double[] sueldosUsuarios, int[] nivelesUsuarios, int nivelMaximo, int nivelMinimo) {
        if (nivelMinimo>nivelMaximo) {
            int temp=nivelMaximo;
            nivelMaximo=nivelMinimo;
            nivelMinimo=temp;
        }

        for(int i=0; i<nivelesUsuarios.length; i++) {
            if (nivelesUsuarios[i]>=nivelMinimo && nivelesUsuarios[i]<=nivelMaximo) {
                motrarUsuario(datosUsuarios, sueldosUsuarios, nivelesUsuarios, i);
            }
        }
    }

    static void mostrarEdadMaxMin(String[] datosUsuarios, double[] sueldosUsuarios, int[] nivelesUsuarios) {
        int edadMax=guardarEdadUsuario(datosUsuarios, 0);
        int edadMin=guardarEdadUsuario(datosUsuarios, 0);
        int indiceEdadMax=0;
        int indiceEdadMin=0;

        for (int i=0; i<datosUsuarios.length; i++) {
            if (edadMax<guardarEdadUsuario(datosUsuarios, i)) {
                edadMax=guardarEdadUsuario(datosUsuarios, i);
                indiceEdadMax=i;
            }

            if (edadMin>guardarEdadUsuario(datosUsuarios, i)) {
                edadMin=guardarEdadUsuario(datosUsuarios, i);
                indiceEdadMin=i;
            }
        }

        System.out.println("Usuario mas viejo: ");
        motrarUsuario(datosUsuarios, sueldosUsuarios, nivelesUsuarios, indiceEdadMax);

        System.out.println("Usuario mas joven: ");
        motrarUsuario(datosUsuarios, sueldosUsuarios, nivelesUsuarios, indiceEdadMin);
    }

    static void mostrarEdadMedia(String[] datosUsuarios) {
        double edadMedia=0;

        for (int i=0; i<datosUsuarios.length; i++) {
            edadMedia+=guardarEdadUsuario(datosUsuarios, i);
        }

        System.out.println("Edad media de los usuarios: "+edadMedia);
    }

    static void mostrarListaUsuarios(String[] datosUsuarios, double[] sueldosUsuarios, int[] nivelesUsuarios) {
        for (int i=0; i<datosUsuarios.length; i++) {
            motrarUsuario(datosUsuarios, sueldosUsuarios, nivelesUsuarios, i);
        }
    }

    public static void main(String[] args) {
        double[][] matriz = { 
        {1, 2, 3, 4, 5, 6}, 
        {1, 2, 3, 4, 5, 6}, 
        {1, 2, 3, 4, 5, 6}, 
        {1, 2, 3, 4, 5, 6}, 
        {1, 2, 3, 4, 5, 6} 
        }; 

        String[] datosUsuarios = {
            "Juan - 12345678A - 30",
            "María - 87654321B - 25",
            "Pedro - 11223344C - 40",
            "Lucía - 44556677D - 28",
            "Carlos - 99887766E - 35"
        };

        double[] sueldosUsuarios = {
            2500.0,   // Juan
            1800.5,   // María
            3200.75,  // Pedro
            2100.0,   // Lucía
            2950.3    // Carlos
        };

        int[] nivelesUsuarios = {
            3,  // Juan
            5,  // María
            2,  // Pedro
            7,  // Lucía
            4   // Carlos
        };

        int opcion=0;

        do {
            mostrarMenu();

            System.out.print("Introduce la opción que deseas usar: ");
            opcion=sc.nextInt();

            switch (opcion) {
                //Calculo de una matriz de datos IA
                case 1 -> sumarColumnas(matriz); 
                //Ingresar usuario
                case 2 -> { 
                    System.out.print("Introduce el nombre del nuevo usuario: ");
                    String nombreUsuario=sc.next();
                    System.out.print("Introduce el dni del nuevo usuario: ");
                    String dniUsuario=sc.next();
                    System.out.print("Introduce la edad del nuevo usuario: ");
                    int edadUsuario=sc.nextInt();
                    datosUsuarios=agregarDatosUsuario(datosUsuarios, nombreUsuario, dniUsuario, edadUsuario);

                    System.out.print("Introduce el sueldo del nuevo usuario: ");
                    sueldosUsuarios=agregarSueldoUsuario(sueldosUsuarios, sc.nextDouble());

                    int nivelUsuario;
                    do {
                        System.out.print("Introduce el nivel del nuevo usuario(desde 1 hasta 10): ");
                        nivelUsuario=sc.nextInt();
                    } while (nivelUsuario<1 || nivelUsuario>10);

                    nivelesUsuarios=agregarNivelUsuarios(nivelesUsuarios, nivelUsuario);
                }
                //Mostrar empleados entre dos niveles
                case 3 -> {
                    System.out.print("Introduce el 1º nivel: ");
                    int nivel=sc.nextInt();

                    System.out.print("Introduce el 2º nivel: ");
                    int nivel2=sc.nextInt();
                    mostrarUsuarioEntreDosNiveles(datosUsuarios, sueldosUsuarios, nivelesUsuarios, nivel, nivel2);
                }
                //Edad máxima y mínima
                case 4 -> mostrarEdadMaxMin(datosUsuarios, sueldosUsuarios, nivelesUsuarios);
                //Media de edad
                case 5 -> mostrarEdadMedia(datosUsuarios);
                //Mostar datos
                case 6 -> mostrarListaUsuarios(datosUsuarios, sueldosUsuarios, nivelesUsuarios);
                default -> System.out.println("Ese número no esta entre las opciones");
            }
            
        } while (opcion!=0);
        System.out.println("Saliendo...");
    }
}