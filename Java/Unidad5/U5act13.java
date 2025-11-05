package Unidad5;

import java.util.Arrays;

public class U5act13 {
    public static void main(String[] args) {
        /*Leer y almacenar n números enteros en una tabla, 
        a partir de la que se construirán otras dos tablas con los elementos con valores pares e impares de la primera, 
        respectivamente. Las tablas pares e impares deben mostrarse ordenadas. */
        int[] tablaOrigen={2, 3, 5, 1, 6 ,2 ,1 ,6, 10, 34, 123, 34, 3};
        int[] tablaPar=new int[0];
        int[] tablaImpar=new int[0];

        for (int i=0; i<tablaOrigen.length; i++) {
            if (tablaOrigen[i]%2==0) {
                tablaPar=Arrays.copyOf(tablaPar, tablaPar.length+1);
                tablaPar[tablaPar.length-1]=tablaOrigen[i];
            } else {
                tablaImpar=Arrays.copyOf(tablaImpar, tablaImpar.length+1);
                tablaImpar[tablaImpar.length-1]=tablaOrigen[i];
            }
        }
        Arrays.sort(tablaPar);
        Arrays.sort(tablaImpar);

        System.out.println("Tabla par: "+Arrays.toString(tablaPar));
        System.out.println("Tabla impar: "+Arrays.toString(tablaImpar));
    }
}
