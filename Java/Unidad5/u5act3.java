package Unidad5;

import java.util.Scanner;

public class u5act3 {
    public static void main(String[] args) {
        /*Introduce por teclado un número n; a continuación, solicita al usuario
        que teclee n números. Realiza la media de los números positivos, la media
        de los negativos y cuenta el número de ceros introducidos. */

        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de números que quieres almacenar: ");
        int cantidad = sc.nextInt();

        double almacén[] = new double[cantidad];

        for (int i=0; i<almacén.length; i++) {
            System.out.print((i+1)+"º numero: ");
            almacén[i] = sc.nextDouble();
        }

        double totalNegativo=0.0, totalPositivo=0.0;
        int contador0=0, contadorPositivo=0, contadorNegativo=0;
        for (int i=0; i<almacén.length; i++) {
            if (almacén[i]>0) {
                totalPositivo+=almacén[i];
                contadorPositivo++;

            } if (almacén[i]<0) {
                totalNegativo+=almacén[i];
                contadorNegativo++;

            } if (almacén[i]==0) {
                contador0++;
            }
        }
        double mediaPositivo=totalPositivo/contadorPositivo;
        double mediaNegativo=totalNegativo/contadorNegativo;

        System.out.println("La media de los números positivos es: "+mediaPositivo);
        System.out.println("La media de los números negativos es: "+mediaNegativo);
        System.out.println("La cantidad de ceros es: "+contador0);
    }
}
