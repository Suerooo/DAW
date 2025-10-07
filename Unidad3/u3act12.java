

import java.util.Scanner;

public class u3act12 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n = 4:
        * * * *
        * * *
        * *
        * 
        */

        //Pregunta al usuario el limite del triangulo rectángulo
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        
        for (int i=n; i>=1; i--) {
            System.out.println();

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
        }
    }
}
