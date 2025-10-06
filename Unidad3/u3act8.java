

import java.util.Scanner;

public class u3act8 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        /*Realiza un programa que nos pida un número n y que nos diga
        cuantos números primos hay entre 1 y n. Un número primo es aquel
        que solo es divisible por 1 y por el mismo. Veamos un ejemplo para n=8.
        1 - primo
        2 - primo 
        3 - primo
        4 - no primo
        5 - primo
        6 - no primo
        7 - primo
        8 - no primo
        5 Números primos en total */
        
        //Variables
        int n, primo=1,resto;

        //Pregunta hasta que numero quiere saber cuales son primos
        Scanner sc = new Scanner(System.in);
        System.out.print("Hasta que numero quieres saber cuales son primos: ");
        n = sc.nextInt();

        //For 
        for (int i=2; i<n; i++) {
            resto=n%i;
            System.out.println(i+" Resto: "+resto);
            primo*=resto;
        }


        System.out.println(primo);
        if (primo==0) {
                System.out.println("No es primo");
            } else {
                System.out.println("Es primo");
            }
    }
}
