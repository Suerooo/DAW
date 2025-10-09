package Unidad4;

import java.util.Scanner;

public class u4act1 {

    //Función
        static void numeroEntre(int x, int y) {

            int max = x>y ? x : y;
            int min = x<y ? x : y;

            for (int i=min; i<=max; i++) {
                System.out.println(i);
            }

        }

    public static void main(String[] args) {
        /* Escribir una función a la que se le pasen dos 
        enteros y muestre todos los números comprendidos entre ellos.*/

        //Pregunta al usuario el numero mínimo y el máximo
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Quieres los todos números desde el: ");
        int x = sc.nextInt();

        System.out.print("Hasta: ");
        int y = sc.nextInt();
        
        //LLama a la función que imprime todos los números entre el mínimo y el máximo
        numeroEntre(x, y);
        

    }
}
