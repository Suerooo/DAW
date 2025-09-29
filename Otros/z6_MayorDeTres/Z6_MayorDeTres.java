/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package z6_MayorDeTres;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Z6_MayorDeTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pide tres números y 
        muestra cuál es el mayor.
        */
        
        double a, b, c;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Primer numero: "); 
        a = sc.nextDouble();
        
        System.out.print("Segundo numero: "); 
        b = sc.nextDouble();
        
        System.out.print("Tercer numero: "); 
        c = sc.nextDouble();
        
        if (a>b==true)
            if (a>c==true)
                System.out.println("El numero mas grande es: " + a);
                else 
                System.out.println("El numero mas grande es: " +  c);
        else
            if (b>c==true)
                System.out.println("El numero mas grande es: " + b);
                else 
                System.out.println("El numero mas grande es: " +  c);

        //Cierra la variable sc
        sc.close();
        
    }
    
}
