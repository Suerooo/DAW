package Unidad5;

import java.util.Scanner;

public class u5act3 {
    public static void main(String[] args) {
        /*Introduce por teclado un número n; a continuación, solicita al usuario
        que teclee n números. Realiza la media de los números positivos, la media
        de los negativos y cuenta el número de ceros introducidos. */

        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de numeros que quieres almacenar: ");
        int cantidad = sc.nextInt();

        double almacen[] = new double[cantidad];

        for (int i=0; i<almacen.length; i++) {
            System.out.print((i+1)+"º numero: ");
            almacen[i] = sc.nextDouble();
        }

        double totalNegativo=0.0, totalPositivo=0.0;
        int contador0=0, contadorPositivo=0, contadorNegativo=0;
        for (int i=0; i<almacen.length; i++) {
            if (almacen[i]>0) {
                totalPositivo+=almacen[i];
                contadorPositivo++;

            } if (almacen[i]<0) {
                totalNegativo+=almacen[i];
                contadorNegativo++;

            } if (almacen[i]==0) {
                contador0++;
            }
        }
        double mediaPositivo=totalPositivo/contadorPositivo;
        double mediaNegativo=totalNegativo/contadorNegativo;

        System.out.println("La media de los numeros postiivos es: "+mediaPositivo);
        System.out.println("La media de los numeros negativos es: "+mediaNegativo);
        System.out.println("La cantidad de ceros es: "+contador0);
    }
}
