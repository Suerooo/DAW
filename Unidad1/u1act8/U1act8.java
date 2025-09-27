/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u1act8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class U1act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realiza un programa que nos pida la base y 
        la altura de un triángulo y muestre por pantalla su área.
        */
        
        Scanner a = new Scanner(System.in); 
        System.out.print("Cual es la base de tu triangulo: "); 
        double bas = a.nextDouble(); 
        
        Scanner b = new Scanner(System.in); 
        System.out.print("Cual es la altura de tu triangulo: "); 
        double alt = b.nextDouble();
        
        double area = ( (bas*alt)/2 );
        
        System.out.println("El area de tu triangulo es: " + area);
        
    }
    
}