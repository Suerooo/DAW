package Unidad5;

import java.util.Arrays;

public class Act18SumasConsecutivas2 {

    static int[] suma(int[] t, int numElementos) {
        int[] suma=new int[0];
        int sumaElementos=0;

        for (int i=0; i<t.length-(numElementos-1); i++) {
            int[] copia=Arrays.copyOfRange(t, i, i+numElementos);

            for (int j=0; j<copia.length; j++) {
                sumaElementos+=copia[j];
            }

            suma=guardarDatosIntArray(suma, sumaElementos);

            sumaElementos=0;
        }
        return suma;
    }

    static int[] guardarDatosIntArray (int[] array, int dato) {
        array=Arrays.copyOf(array, array.length+1);
        array[array.length-1]=dato;

        return array;
    }
    
    public static void main(String[] args) {
        /*Implementa la  función:  int  []  suma(int  t  []  ,  int  numElementos),  
        que  crea  y devuelve una tabla con las sumas de los numElementos elementos 
        consecutivos de t. Veamos un ejemplo, sea t = [10, 1, 5, 8, 9, 2]. Si los 
        elementos de t se agrupan de 3 en 3, se harán las sumas:
        10 + 1 +5. Igual a 16.
        1+5 + 8. Igual a 14.
        5 + 8 + 9. Igual a 22.
        8 + 9 + 2. Igual a 19.
        Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22, 19]. */

        int[] t={10, 1, 5, 8, 9, 2,};
        int numElementos=3;

        System.out.println(Arrays.toString(suma(t, numElementos)));
    }
}