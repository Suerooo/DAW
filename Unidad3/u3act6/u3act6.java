package u3act6;

import java.util.Scanner;

public class u3act6 {
    public static void main(String[] args) {
        /*Pedir 5 calificaciones 
        de alumnos y decir al 
        final si hay algún suspenso */

        //Variables
        double nota;
        int suspensos=0;
        
        for (int veces=0; veces!= 5; veces++) {
            //Pide la nota
            Scanner sc = new Scanner(System.in); 
            System.out.print("Introduce una calificación: "); 
            nota = sc.nextInt();

            //If para guardar la cantidad de suspensos
            if (nota<5) suspensos++;
        }

        //If para imprimir la cantidad de suspensos
        if (suspensos == 0) 
            System.out.println("No hay ningún suspenso.");
        else {
            System.out.println("Si hay suspensos.");
            System.out.println("    Cantidad de suspensos: " + suspensos);
        }
    }
}
