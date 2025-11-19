package Unidad3;

import java.util.Scanner;

public class Act9NumerosPrimos {
	public static void main(String[] args) {
        /*Realiza un programa que nos pida un número n y que nos diga
        cuantos números primos hay entre 1 y n. Un número primo es aquel
        que solo es divisible por 1 y por el mismo. Veamos un ejemplo para n=8.
        1 - no primo
        2 - primo 
        3 - primo
        4 - no primo
        5 - primo
        6 - no primo
        7 - primo
        8 - no primo
        5 Números primos en total */
        
        //Variables
        int limite, restoAcumulado=1, resto = 0;

        //Pregunta hasta que numero quiere saber cuales son primos
        Scanner sc = new Scanner(System.in);
        System.out.print("Hasta que numero quieres saber cuales son primos: ");
        limite = sc.nextInt();


        //Segmenta el numero (n) ingresado por el usuario
        for (int j=2; j<=limite; j++) {

            //Segmenta los segmentos del for anterior
            for (int i=2; i<j; i++) {
                resto=j%i;
                restoAcumulado*=resto;
            }

            //Entonces si primo==0 el numero no es primo porque significa que existe una division que no es 1 o el propio numero que no tiene resto
            if (restoAcumulado==0) {
                    System.out.println(j+" - no primo");
                }
                //Si primo!=0 significa que ignorando 1 y el propio numero no existe ninguna otra division sin resto 
                else {
                    System.out.println(j+" - primo");
                }
            
            //Reseteamos las variables para calcular el siguiente numero
            restoAcumulado=1;
        }

        //Cierra la variable sc
        sc.close();
    }
}
