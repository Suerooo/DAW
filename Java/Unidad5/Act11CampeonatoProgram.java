package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Act11CampeonatoProgram {
    static Scanner sc = new Scanner(System.in);

    static int[] guardarDatos() {
        int datos=0;
        int[] array=new int[0];

        do {
            for(int i=0; i<5; i++){
                System.out.print("Puntuación del "+(i+1)+"º participante: ");
                datos=sc.nextInt();

                if (datos==-1) {
                    System.out.println("Mostrando resultados ordenados...");
                    break;
                } else {
                    array=Arrays.copyOf(array, array.length+1);
                    array[array.length-1]=datos;
                }
            }

            if (datos!=-1) System.out.println("Registrado los 5 participantes. Si no se van a sumar mas participantes escribe '-1'");
        } while (datos!=-1);

        Arrays.sort(array);

        return array;
    }

    public static void main(String[] args) {
        /*Diseñar una aplicación para gestionar un campeonato de programación, 
        donde se introduce la puntuación (enteros) obtenidos por 5 programadores, 
        conforme van terminando su prueba. La aplicación debe mostrar las datoses 
        ordenadas de los 5 participantes. En ocasiones, cuando finalizan los 5 participantes 
        anteriores, se suman al campeonato programadores de exhibición, cuyos puntos se incluyen
        con el resto. La forma de especificar que no intervienen más programadores de exhibición
        es introducir como puntuación un -1. La aplicación debe mostrar, finalmente, los puntos 
        ordenados de todos los participantes. */

        int[] puntuacionTotal=guardarDatos();

        System.out.println(Arrays.toString(puntuacionTotal));
    }
}
