package Unidad4;

import java.util.Scanner;

public class u4act4 {

    static void aleatorio(int cantidad, int min, int max) {

        for (int i=1; i<=cantidad; i++){
            int numeroAleatorio = (int) (Math.random()*(max-min+1)+min);
            System.out.println("El numero aleatorio es: "+numeroAleatorio);
        }

    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*Crea una función que muestre por consola una serie de números
        aleatorios enteros. Los parámetros de la función serán: la cantidad
        de números aleatorios que se mostrarán y los valores mínimos y máximos que estos pueden tomar. */

        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de números aleatorios: ");
        int cantidad = sc.nextInt();

        System.out.print("Mínimo: ");
        int min = sc.nextInt();

        System.out.print("Máximo: ");
        int max = sc.nextInt();

        aleatorio(cantidad, min, max);
    }
}
