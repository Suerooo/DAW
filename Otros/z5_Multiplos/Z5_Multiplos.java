/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package z5_Multiplos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Z5_Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Verifica si un número 
        ingresado es múltiplo de 5 o de 10.
        */
        
        double numero, mul5, mul10;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Numero: "); 
        numero = sc.nextDouble();
        
        mul5 = numero%5;
        mul10 = numero%10;
        
        if (mul5==0)
            System.out.println("El numero es multiplo de 5");
        
        if (mul10==0)
            System.out.println("El numero es multiplo de 10");
        
        if (mul5!=0 && mul10!=0)
            System.out.println("El numero no es multiplo ni de 10 ni de 5");
    }
    
}
