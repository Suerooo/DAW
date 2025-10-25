package Unidad4;

import java.util.Scanner;

public class U4act4 {
    static Scanner sc = new Scanner(System.in); 

    //Método que crea un números aleatorios comprendidos entre dos números a partir de la variable (cantidad, min, max)
    static void aleatorio(int cantidad, int x, int y) {

        //Calcula que variable(x,y) es mayor y cual es menor para guardarlo en unas variables (max,min)
        int max = x>y ? x : y;
        int min = x<y ? x : y;

        //Imprime un numero aleatorio comprendido entra las variables(max, min) tantas veces como el valor de la variable(cantidad)
        for (int i=1; i<=cantidad; i++){
            int numeroAleatorio = (int) (Math.random()*(max-min+1)+min);
            System.out.println("El numero aleatorio es: "+numeroAleatorio);
        }

    }

    public static void main(String[] args) {
        /*Crea una función que muestre por consola una serie de números
        aleatorios enteros. Los parámetros de la función serán: la cantidad
        de números aleatorios que se mostrarán y los valores mínimos y máximos que estos pueden tomar. */

        //Pregunta y guarda al usuario la cantidad de números aleatorios que hay que imprimir y entre que números tienen que ser los números aleatorios
        System.out.print("Cantidad de números aleatorios: ");
        int cantidad = sc.nextInt();

        System.out.print("Quieres los todos números desde el: ");
        int x = sc.nextInt();

        System.out.print("Hasta: ");
        int y = sc.nextInt();

        //Llama al método aleatorio
        aleatorio(cantidad, x, y);
    }
}
