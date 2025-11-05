package Unidad5;

import java.util.Arrays;

public class U5act18 {
    public static void main(String[] args) {
        /*Implementa la  función:  int  []  suma(int  t  []  ,  int  numElementos),  
        que  crea  y devuelve una tabla con las sumas de los numElementos elementos 
        consecutivos de t. Veamos un ejemplo, sea t = [10, 1,5, 8, 9, 2]. Si los 
        elementos de t se agrupan de 3 en 3, se harán las sumas:
        10 + 1 +5. Igual a 16.
        1+5 + 8. Igual a 14.
        5 + 8 + 9. Igual a 22.
        8 + 9 + 2. Igual a 19.
        Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22, 19]. */

        int[] t={10, 1, 5, 8, 9, 2};
        int numElementos=3;

        //FUNCION
        int[] suma=new int[0];
        int sumaNumElementos=0;

        for (int i=0; i<numElementos; i++) {
            sumaNumElementos+=t[i];
        }
        
        suma=Arrays.copyOf(suma, suma.length+1);
        suma[suma.length-1]=sumaNumElementos;

        System.out.println(Arrays.toString(suma));
    }
}
