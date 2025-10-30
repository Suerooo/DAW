package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class U5act6 {
    static Scanner sc = new Scanner(System.in);

    static int[] buscarTodos(int[] t, int clave) {
        int cantidadClave=0;

        for (int i=0; i<t.length; i++) {
            if (t[i]==clave) {
                cantidadClave++; 
            }
        }

        if (cantidadClave==0) return new int[0];

        else {
            int[] posicionClaves=new int[cantidadClave];
            int indice=0;

            for (int i=0; i<t.length; i++) {
                if (t[i]==clave) {
                    posicionClaves[indice]=i;
                    indice++;
                }
            }

            return posicionClaves; 
        }
    }

    public static void main(String[] args) {
        /*Realiza la función: int[]  buscarTodos  (int  t  []  ,  int  clave), 
        que  crea  y  devuelve una tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda.
        En el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía. */

        //Ejemplo: implementación del método buscarTodo
        int[] notas={3, 4, 6, 3, 1, 7, 3, 7, 8, 8, 8, 2};

        System.out.print("Los indices de que notas quieres buscar: ");
        int notaBuscada=sc.nextInt();

        if (notaBuscada>=0 && notaBuscada<=10) {
            System.out.println("La lista de indices para la nota "+notaBuscada+" es "+Arrays.toString(buscarTodos(notas, notaBuscada)));
        } else {
            System.out.println("Error: Nota invalida");
        }
    }
}
