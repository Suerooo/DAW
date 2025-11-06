package Unidad5;

import java.util.Scanner;

public class U5act20 {
    static Scanner sc = new Scanner(System.in);

    static void imprimirTablero(int[][] tablero) {
        for(int i=0; i<tablero.length; i++) {
        System.out.println();
            for(int j=0; j<tablero[i].length; j++) {
                System.out.print(tablero[i][j]+", ");
            }
        }
    }

    static int sumarDiagonalPrincipal(int[][] tablero) {
        int sumaDiagonal=0;
        
        for(int i=0; i<tablero.length; i++) {
            sumaDiagonal+=tablero[i][i];
        }
        System.out.println();

        return sumaDiagonal;
    }

    static boolean buscarNumero(int[][] tablero, int numeroBuscado) {
        for(int i=0; i<tablero.length; i++) {
            for(int j=0; j<tablero[i].length; j++) {
                if (numeroBuscado==tablero[i][j]) return true;
            }
        }
        return false;
    }

    static int sumarFilaCompleta(int[][] tablero, int numeroFila) {
        int sumaFila=0;

        for(int i=0; i<tablero[numeroFila].length; i++) {
            sumaFila+=tablero[numeroFila][i];
        }

        return sumaFila;
    }
    public static void main(String[] args) {
        /*Crear una matriz cuadrada (ej. 4x4) de números enteros en la función main.
        Crear una función llamada imprimirTablero que reciba la matriz e imprima por consola el tablero de forma ordenada, fila por fila.
        Crear una función llamada sumarDiagonalPrincipal que reciba la matriz y devuelva la suma de los números que están en la diagonal principal (donde el índice de la fila es igual al índice de la columna, ej: [0][0], [1][1], [2][2], etc.).
        Crear una función llamada buscarNumero que reciba la matriz y un numeroBuscado, y devuelva true si el número existe en el tablero, o false si no se encuentra.
        Crear una función llamada sumarFilaCompleta que reciba la matriz y un número de fila, y devuelva la suma total de todos los números en esa fila específica.
        En la función main, llama a todas estas funciones para probarlas.*/

        int[][] tablero = {
            {22, 21, 19, 21},
            {28, 39, 27, 29},
            {15, 17, 16, 0},
            {5, 47, 62, 10}
        };

        //imprimirTablero
        imprimirTablero(tablero);

        //sumarDiagonalPrincipal
        System.out.println("La suma de la diagonal principal es: "+sumarDiagonalPrincipal(tablero));

        //buscarNumero
        System.out.print("Que numero quieres buscar: ");
        int numeroBuscado=sc.nextInt();

        if (buscarNumero(tablero, numeroBuscado)) System.out.println("Ese número si esta en el tablero"); 
        else System.out.println("Ese número no esta en el tablero"); 
        
        //sumarFilaCompleta
        System.out.print("De que ciudad quieres calcular la media (1-"+tablero.length+"): ");
        int numeroFila=sc.nextInt();

        System.out.println("La suma de la fila "+numeroFila+" es: "+sumarFilaCompleta(tablero, numeroFila-1));
        
    }
}
