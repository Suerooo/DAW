/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2act2;

import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class U2act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pedir dos números y mostrarlos 
        ordenados de forma decreciente (Operador ternario).
        */
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Primer numero: "); 
        double a = sc.nextDouble();
        
        System.out.print("Segundo numero: "); 
        double b = sc.nextDouble();
        
        String orden = a>b ? (a+">"+b) : (b+">"+a);
        System.out.println(orden);

        //Cierra la variable sc
        sc.close();
        
    }
    
}
