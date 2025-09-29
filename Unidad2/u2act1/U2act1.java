/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2act1;

import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class U2act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Implementar un programa que pida por teclado un número decimal 
        e indique si es un número casi-cero, que son aquellos, positivos o 
        negativos, que se acercan a 0 por menos de 1 unidad, aunque
        curiosamente el O no se considera un número casi-cero. Ejemplos 
        de números casi-cero son el 0,3, el -0,99 o el 0,123; algunos 
        números que no se consideran casi-ceros son: el 12,3, el 0 o el -1.
        */
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Numero decimal: "); 
        double numero = sc.nextDouble();
        
        if (numero<1 && numero>-1 && numero!=0) {
            System.out.println("Es un numero casi-cero");
        }
        else
            System.out.println("No es un numero casi-cero");
        
        //Cierra la variable sc
        sc.close();
    }
    
}
