/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package z1_ConversionDeGrados;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class z1_ConversionDeGrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribe un programa que convierta 
        grados Celsius a Fahrenheit y viceversa.
        */
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Que conversion quieres usar F->C(escribe: f) o C->F(escribe: c): "); 
        String conversion = sc.next();
        
        if ("f".equals(conversion)){
            System.out.print("Grados fahrenheit: ");
            double fah = sc.nextDouble();
            double cel= (fah-32)*5/9;
            System.out.println(fah + " grados fahrenheit son " + cel + " grados celsius");
        }
            
        if ("c".equals(conversion)){
            System.out.print("Grados celsius: ");
            double cel = sc.nextDouble();
            double fah = (cel*9/5)+32;
            System.out.println(cel + " grados celsius son " + fah + " grados fahrenheit");
        }

        //Cierra la variable sc
        sc.close();
        
    }
    
}
