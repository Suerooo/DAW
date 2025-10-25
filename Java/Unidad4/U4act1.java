package Unidad4;

import java.util.Scanner;

public class U4act1 {
    static Scanner sc = new Scanner(System.in); 


    //Función
        static void numeroEntre(int x, int y) {

            //Calcula que variable(x,y) es mayor y cual es menor para guardarlo en unas variables (max,min)
            int max = x>y ? x : y;
            int min = x<y ? x : y;

            //Imprime los números comprendidos entre las variables(max,min)
            for (int i=min; i<=max; i++) {
                System.out.println(i);
            }

        }

    public static void main(String[] args) {
        /* Escribir una función a la que se le pasen dos 
        enteros y muestre todos los números comprendidos entre ellos.*/

        //Pregunta y guarda los valores x e y que usamos para imprimir los números que hay entre ellos
        System.out.print("Quieres los todos números desde el: ");
        int x = sc.nextInt();

        System.out.print("Hasta: ");
        int y = sc.nextInt();
        
        //LLama a la función que imprime todos los números entre el mínimo y el máximo
        numeroEntre(x, y);
        

    }
}
