package Practica.Examen1;

import java.util.Scanner;

public class Act10SumaDeNumeros {
    public static void main(String[] args) {
        /*Usando un while, pide números al usuario
        hasta que introduzca un número 
        negativo y muestra la suma total. */

        //Variables
        int numero=0, total=0;

        //While en el que pregunta números hasta que introduzca uno negativo
        while (numero>=0) {
            //Le pide un número al usuario
            Scanner sc = new Scanner(System.in); 
            System.out.print("Introduce un número: "); 
            numero = sc.nextInt();
            //Cierra la variable sc
            sc.close();

            //If que suma el número siempre y cuando no sea negativo
            if (numero>=0) total+=numero;
        }

        //Imprime el total
        System.out.println("El total es "+total);
    }
}
