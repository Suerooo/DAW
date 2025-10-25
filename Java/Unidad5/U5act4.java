package Unidad5;

import java.util.Scanner;

public class U5act4 {
    static Scanner sc = new Scanner(System.in);

    static int buscar (int[] t, int clave) {
        int posicionClave=-1;

        for (int i=0; i<t.length; i++) {
            if (t[i]==clave) posicionClave=i;
        }

        return posicionClave;
    }

    public static void main(String[] args) {
        /*Escribe la función: int buscar (int t [] , int clave)
        que busca de forma secuencial en la tabla t el valor clave.
        En caso de encontrarlo, devuelve en qué posición lo encuentra; y en caso contrario, devolverá -1. */

        //Ejemplo: implementación del método buscar
        int[] notas={1, 2, 7, 3, 5, 7};

        System.out.print("Que nota quieres buscar: ");
        int notaBuscada = sc.nextInt();

        if (buscar(notas, notaBuscada)==-1) {
            System.out.println("Error esa nota no esta");
        } else {
            System.out.println("La nota "+notaBuscada+" esta en la posición "+buscar(notas, notaBuscada));
        }
        

    }
}
