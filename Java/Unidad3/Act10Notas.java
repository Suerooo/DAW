package Unidad3;

import java.util.Scanner;

public class Act10Notas {
    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        /*Dadas 6 notas, 
        escribir la cantidad de
        alumnos aprobados, condicionados 
        (nota igual a cuatro) y suspensos */

        //Variables
        int aprobados = 0, condicionados = 0, suspensos = 0; 
        double nota;

        //For que pregunta 6 veces las notas
        int respuestas = 0;
        while (respuestas < 6) {
            //Pide una nota al usuario
            System.out.print("Introduce una nota: ");
            nota = sc.nextDouble();

            //Evita que el usuario introduzca una nota incorrecta
            if (nota<0 || nota >10) {
                System.out.println("Nota incorrecta");
                continue;
            }

            //If para los aprobados
            if (nota>=5) aprobados++;

            //If para los suspensos
            if (nota<4) suspensos++;

            //If para los condicionados
            if (nota==4) condicionados++;

            respuestas++;
        }

        //Imprime los aprobados suspensos y condicionados
        System.out.println("Resultados: ");
        System.out.println(" Aprobados: " +aprobados);
        System.out.println(" Suspensos: " +suspensos);
        System.out.println(" Condicionados: " +condicionados);
    }
}
