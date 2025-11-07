package Unidad5;

import java.util.Arrays;

public class Act10Loteria {

    static int comprobarAciertosArrays(int[] arrayAComparar, int[] arrayModelo) {
        Arrays.sort(arrayModelo);
        int aciertos=0;

        for (int i=0; i<arrayModelo.length; i++) {
            for (int j=0; j<arrayModelo.length; j++) {
                if (arrayAComparar[i]==arrayModelo[j]) aciertos++;
            }
        }
        return aciertos;
    } 
    public static void main(String[] args) {
        /*Definir una función que tome como parámetros dos tablas, la primera con los 6 
        números de una apuesta de la primitiva, y la segunda (ordenada) con los 6 números de 
        la combinación ganadora. La función devolverá el número de aciertos. */
        int[] primitivaUsuario={5, 3, 2, 7, 1, 8};
        int[] combinacionGanadora={5, 8 ,2 ,1, 6, 3};

        System.out.println("Cantidad de aciertos: "+comprobarAciertosArrays(primitivaUsuario, combinacionGanadora));
    }
}
