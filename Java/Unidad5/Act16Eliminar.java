package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Act16Eliminar {
    static Scanner sc = new Scanner(System.in);

    static int[] borrarElementoTabla(int[] tabla, int elementoAEliminar) {
        Arrays.sort(tabla);
        int[] tablaSinElemento=new int[0];

        for(int i=0; i<tabla.length; i++) {
            if (tabla[i]!=elementoAEliminar) {
                tablaSinElemento=Arrays.copyOf(tablaSinElemento, tablaSinElemento.length+1);
                tablaSinElemento[tablaSinElemento.length-1]=tabla[i];
            }
        }

        return tablaSinElemento;
    }
    public static void main(String[] args) {
        /*Crea una función que realice el borrado de un elemento de una tabla ordenada.*/
        int[] tabla={1, 3, 6, 1, 3, 5, 7, 2};
        
        System.out.print("Que elemento quieres eliminar de la tabla: ");
        System.out.println("Elemento eliminado!! \n"+Arrays.toString(borrarElementoTabla(tabla, sc.nextInt())));
        
    }
}
