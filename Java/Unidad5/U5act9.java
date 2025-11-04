package Unidad5;

import java.util.Arrays;

public class U5act9 {
    public static void main(String[] args) {
        /*Crear un tablero de 4x6 y en las casillas donde i y j sean par poner "holi". */
        String[][] holiEnPares=new String[4][6];//Dimensiones del tablero

        for (int i=0; i<holiEnPares.length; i++) {
            //Si la fila no es par pasa a la siguiente, si si es par comprueba las columnas
            if ((i+1)%2!=0) {
                System.out.println("La fila "+(i+1)+" no es par, pasando a la siguiente...");
            } else {
                System.out.println("La fila "+(i+1)+" si es par, comprobando columnas...");
                
                //Si no es par comprueba la siguiente columna, si si es par la guarda
                for (int j=0; j<holiEnPares[0].length; j++) {
                    if ((j+1)%2!=0) {
                        System.out.println("La columna "+(j+1)+" no es par, pasando a la siguiente...");
                    } else {
                        System.out.println("La columna "+(j+1)+" si es par, guardando 'holi'...");
                        holiEnPares[i][j]="holi";
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(holiEnPares));
    }
}
