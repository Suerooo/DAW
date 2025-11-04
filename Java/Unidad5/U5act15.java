package Unidad5;

import java.util.Arrays;

public class U5act15 {
    public static void main(String[] args) {
        /*Crear una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma: 
        el elemento de la posición [n][m] debe contener el valor 10 x n + m. Después se debe mostrar su contenido. */
        int[][] tablaBidimensional=new int[5][5];//Dimensiones de la tabla

        for(int i=0; i<tablaBidimensional.length; i++){
            for(int j=0; j<tablaBidimensional[0].length; j++){
                tablaBidimensional[i][j]=(10*i+j);
            }
        }
        System.out.println(Arrays.deepToString(tablaBidimensional));
    }
}
