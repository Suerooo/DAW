package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class U5act11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*Diseñar una aplicación para gestionar un campeonato de programación, 
        donde se introduce la puntuación (enteros) obtenidos por 5 programadores, 
        conforme van terminando su prueba. La aplicación debe mostrar las puntuaciones 
        ordenadas de los 5 participantes. En ocasiones, cuando finalizan los 5 participantes 
        anteriores, se suman al campeonato programadores de exhibición, cuyos puntos se incluyen
        con el resto. La forma de especificar que no intervienen más programadores de exhibición
        es introducir como puntuación un -1. La aplicación debe mostrar, finalmente, los puntos 
        ordenados de todos los participantes. */

        int puntuacion=0;
        int[] puntuacionesTotal=new int[0];
        do {
            for(int i=0; i<5; i++){
                System.out.print("Puntuación del "+(i+1)+"º participante: ");
                puntuacion=sc.nextInt();

                if (puntuacion==-1) {
                    System.out.println("Mostrando resultados ordenados...");
                    break;
                } else {
                    puntuacionesTotal=Arrays.copyOf(puntuacionesTotal, puntuacionesTotal.length+1);
                    puntuacionesTotal[puntuacionesTotal.length-1]=puntuacion;
                }
            }

            if (puntuacion!=-1) System.out.println("Registrado los 5 participantes. Si no se van a sumar mas participantes escribe '-1'");
        } while (puntuacion!=-1);

    }
}
