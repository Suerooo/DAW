package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class U5act7 {
    public static void main(String[] args) {
        /*Realiza un programa que pida números por teclado y los guarde en un array.
        Si el dato que se introduce es 99, para de pedir datos y muestra el contenido del array. */
        
        int datoIntroducido;
        int[] datosGuardados=new int[0];

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dato que quiere guardar (escribe 99 para salir): ");
            datoIntroducido=sc.nextInt();

            if (datoIntroducido!=99) {
                datosGuardados=Arrays.copyOf(datosGuardados, datosGuardados.length+1);
                datosGuardados[datosGuardados.length-1]=datoIntroducido;
            } else {
                System.out.println("Mostrando datos guardados...");
                System.out.println(Arrays.toString(datosGuardados));
            }
            
        } while (datoIntroducido!=99);
    }
}
