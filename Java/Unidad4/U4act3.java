package Unidad4;

import java.util.Scanner;


public class U4act3 {
    static Scanner sc = new Scanner(System.in); 

    //Método que determina si un numero es primo o no primo
    static boolean esPrimo(int numero) {
        boolean primo=true;
        for (int i=2; i<numero; i++) {
            if (numero%i==0) {
                primo=false;
            }
        }

        return primo;
    }

    //Método que calcula los números primos de los divisores de un numero
    static void divisoresPrimos() {
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        for (int i=1; i<=numero; i++) {
            if (esPrimo(i)) {
                System.out.println(i+" es primo");
            } else {
                System.out.println(i+" no es primo");
            }
        }
    }
    
    public static void main(String[] args) {
        /*Escribir una función a la que se le pase un número entero y 
        devuelva el número de divisores primos que tiene. */

        //Llama al método divisoresPrimos
        divisoresPrimos();
    }
}
