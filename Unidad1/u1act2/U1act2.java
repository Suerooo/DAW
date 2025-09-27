/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u1act2;

import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class U1act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, el usuario debe introducir el radio (que puede contener decimales).

        Recordamos:

        Longitud = 2pi • Radio

        Área = pi. Radio^2
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos metros mide el radio de tu circunferencia: ");
        double radio = sc.nextDouble();
        
        final double PI =  3.14159265359;
        double longitud = ( (2*PI)*radio );
        double area = ( PI*(radio*radio) );
        
        System.out.println("La longitud de tu circunferencia es: " + longitud + " metros" );
        System.out.println("Y el area es: " + area + " metros" );
    }
    
}
