package Unidad3;

import java.util.Scanner;

public class Act1ParPositivoCuadrado {
    public static void main(String[] args) {

        /*
        Diseñar un programa que muestre, 
        para cada número introducido por 
        teclado, si es par, si es positivo y 
        su cuadrado. El proceso se repetirá hasta 
        que el número introducido sea cero.
        */

        //Variables
        int num=1;

        //Bucle que se repite hasta que el numero sea 0
        while (num!=0) {

            //Pide un numero
            Scanner sc = new Scanner(System.in); 
            System.out.print("Di un un numero: "); 
            num = sc.nextInt();

            //Comprueba si es par o impar
            if ((num%2) == 0)
                System.out.println("El numero es par");
            else
                System.out.println("El numero es impar");

            //Comprueba si es positivo o negativo
            if (num>0)
                System.out.println("El numero es positivo");
            else
                System.out.println("El numero es negativo");

            //Cuadrado del numero
            System.out.println("El cuadrado de "+num+" es "+num*num);

            //Cierra la variable sc
            sc.close();
        }
    }
}
