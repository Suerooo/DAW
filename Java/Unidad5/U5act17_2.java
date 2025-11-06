package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class U5act17_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar 
        encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. 
        Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces 
        el número de encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor-1.
        
        Una vez terminada la entrada de datos, muestra la siguiente información:
        -Todos los sueldos introducidos ordenados de forma decreciente.
        -El sueldo máximo y mínimo.
        -La media de los sueldos. */
        
        double sueldo;
        double[] nivelAdquisitivo=new double[0];

        do {
            System.out.print("Introduce: ");
            sueldo=sc.nextDouble();

            if (sueldo==-1) {
                break;
            } else if(sueldo<0) {
                System.out.println("Error: no se permiten número negativos");
            } else {
                nivelAdquisitivo=Arrays.copyOf(nivelAdquisitivo, nivelAdquisitivo.length+1);
                nivelAdquisitivo[nivelAdquisitivo.length-1]=sueldo;
            }

        } while (sueldo!=-1);

        //Imprimir todos los sueldos ordenados de forma decreciente
        Arrays.sort(nivelAdquisitivo);
        double[] nivelAdquisitivoDecreciente=new double[nivelAdquisitivo.length];

        for(int i=0, j=1; i<nivelAdquisitivo.length; i++, j++) {
            nivelAdquisitivoDecreciente[i]=nivelAdquisitivo[nivelAdquisitivo.length-j];
        }

        System.out.println("Todos los sueldos introducidos "+Arrays.toString(nivelAdquisitivoDecreciente));

        //Imprimir sueldo máximo y mínimo
        System.out.println("Sueldo máximo "+nivelAdquisitivoDecreciente[0]);
        System.out.println("Sueldo mínimo "+nivelAdquisitivoDecreciente[nivelAdquisitivoDecreciente.length-1]);

        //Imprimir media de sueldos
        double sumaSueldo=0.0;

        for(int i=0; i<nivelAdquisitivoDecreciente.length; i++) {
            sumaSueldo+=nivelAdquisitivoDecreciente[i];
        }
        
        System.out.println("La media de todos los sueldos es: "+(sumaSueldo/nivelAdquisitivoDecreciente.length));
    }
}
