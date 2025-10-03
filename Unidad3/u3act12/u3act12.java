package u3act12;

import java.util.Scanner;

public class u3act12 {
    public static void main(String[] args) {
        /*Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n = 4:
        * * * *
        * * *
        * *
        * 
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++)
            System.out.println("*"*j);
        }
    }
}
