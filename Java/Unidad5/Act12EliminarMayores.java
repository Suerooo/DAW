package Unidad5;

import java.util.Arrays;

public class Act12EliminarMayores {

    static int[] eliminarMayores(int[] t, int valor) {
        int[] tSinMayoresDeValor=new int[0];

        for (int i=0; i<t.length; i++) {
            if (t[i]<valor) {
                tSinMayoresDeValor=Arrays.copyOf(tSinMayoresDeValor, tSinMayoresDeValor.length+1);
                tSinMayoresDeValor[tSinMayoresDeValor.length-1]=t[i];
            }
        }

        return tSinMayoresDeValor;
    }

    public static void main(String[] args) {
        /*Escribir la función
        int[] eliminarMayores(int t[], int valor)
        que crea y devuelve una copia de la tabla t donde se han eliminado todos los elementos que son mayores que valor. */
        int[] t={1, 2, 5, 7 ,2 ,6, 8, 2, 10, 8, 7, 9, 1, 3};
        int valor=6;

        System.out.println(Arrays.toString(eliminarMayores(t, valor)));
    }
}
