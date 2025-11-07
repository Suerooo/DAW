package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Act17Ayuntamiento {
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
        Double[] nivelAdquisitvo=new Double[0];

        do {
            System.out.print("Introduce: ");
            sueldo=sc.nextDouble();

            if (sueldo==-1) {
                break;
            } else if(sueldo<0) {
                System.out.println("Error: no se permiten número negativos");
            } else {
                nivelAdquisitvo=Arrays.copyOf(nivelAdquisitvo, nivelAdquisitvo.length+1);
                nivelAdquisitvo[nivelAdquisitvo.length-1]=sueldo;
            }

        } while (sueldo!=-1);

        //Imprimir todos los sueldos
        Arrays.sort(nivelAdquisitvo, java.util.Collections.reverseOrder());
        System.out.println("Todos los sueldos introducidos "+Arrays.toString(nivelAdquisitvo));

        //Imprimir sueldo máximo y mínimo
        System.out.println("Sueldo máximo "+nivelAdquisitvo[0]);
        System.out.println("Sueldo mínimo "+nivelAdquisitvo[nivelAdquisitvo.length-1]);

        //Imprimir media de sueldos
        double sumaSueldo=0.0;

        for(int i=0; i<nivelAdquisitvo.length; i++) {
            sumaSueldo+=nivelAdquisitvo[i];
        }
        
        System.out.println("La media de todos los sueldos es: "+(sumaSueldo/nivelAdquisitvo.length));
    }
}