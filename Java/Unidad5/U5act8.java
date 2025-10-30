package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class U5act8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*Crea una aplicación donde el usuario meta datos en un array hasta que INTRODUZCA el 99
        Una vez esté el array lleno, ordénalo y muéstralo.
        Un vez esté ordenado, pide al usuario que introduzca un número para buscarlo en el array */

        //Guarda los datos introducidos por el usuario en un array hasta que escribe 99
        int datoIntroducido;
        int[] datosGuardados=new int[0];

        do {
            System.out.print("Dato que quiere guardar (escribe 99 para salir): ");
            datoIntroducido=sc.nextInt();

            if (datoIntroducido!=99) {
                datosGuardados=Arrays.copyOf(datosGuardados, datosGuardados.length+1);
                datosGuardados[datosGuardados.length-1]=datoIntroducido;
            } else {
                System.out.println("Saliendo...");
            }
            
        } while (datoIntroducido!=99);

        //Ordena y muestra los datos array
        Arrays.sort(datosGuardados);
        System.out.println("Datos guardados y ordenados: "+Arrays.toString(datosGuardados));

        //Busca el número clave en el array
        System.out.print("De que número quieres el indice: ");
        int clave=sc.nextInt();

        int indiceDeClave=Arrays.binarySearch(datosGuardados, clave);

        if (indiceDeClave!=-1) {
            System.out.println("El número "+clave+" esta en la posición "+indiceDeClave);
        } else {
            System.out.println("Error: ese número no ha sido guardado");
        }     
    }
}
