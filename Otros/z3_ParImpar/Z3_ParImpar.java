/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package z3_parimpar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Z3_ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pide un número y dile al 
        usuario si es par o impar.
        */
        
        double numero, resto;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Numero: "); 
        numero = sc.nextDouble();
        
        resto = numero%2;
        
        if (resto==0) 
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
              
    }
    
}
