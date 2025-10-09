package Unidad4;

import java.util.Scanner;

public class u4act4 {

    static void aleatorio(int cantidad, double min, double max) {

        for (int i=1; i<=cantidad; i++){
            int numeroAleatorio = (int) (Math.random()*((max-min)+min)+1);
            System.out.println("El numero aleatorio es: "+numeroAleatorio);
        }

    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*Crea una función que muestre por consola una serie de números
        aleatorios enteros. Los parámetros de la función serán: la cantidad
        de números aleatorios que se mostrarán y los valores mínimos y máximos que estos pueden tomar. */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int cantidad = sc.nextInt();

        System.out.print("Introduce un número: ");
        int min = sc.nextInt();

        System.out.print("Introduce un número: ");
        int max = sc.nextInt();

        aleatorio(cantidad, min, max);
    }
}
