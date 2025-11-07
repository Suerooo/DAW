package Unidad5;

import java.util.Scanner;

public class Act3MediasCero {
    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        /*Introduce por teclado un número n; a continuación, solicita al usuario
        que teclee n números. Realiza la media de los números positivos, la media
        de los negativos y cuenta el número de ceros introducidos. */

        System.out.print("Cantidad de números que quieres almacenar: ");
        int cantidad = sc.nextInt();

        double[] almacen = new double[cantidad];

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
            } else if (almacen[i]<0) {
                totalNegativo+=almacen[i];
                contadorNegativo++;
            } else if (almacen[i]==0) {
                contador0++;
            }
        }
        double mediaPositivo = 0.0;
        double mediaNegativo = 0.0;

        if (contadorPositivo > 0) {
            mediaPositivo = totalPositivo / contadorPositivo;
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        if (contadorNegativo > 0) {
            mediaNegativo = totalNegativo / contadorNegativo;
        } else {
            System.out.println("No se introdujeron números negativos.");
        }

        if (contadorPositivo > 0) {
            System.out.println("La media de los números positivos es: " + mediaPositivo);
        }
        if (contadorNegativo > 0) {
            System.out.println("La media de los números negativos es: " + mediaNegativo);
        }
        System.out.println("La cantidad de ceros es: " + contador0);
    }
}
