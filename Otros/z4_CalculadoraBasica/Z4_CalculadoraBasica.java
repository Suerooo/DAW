/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package z4_calculadorabasica;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Z4_CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pide dos números y muestra 
        las operaciones: suma, resta, 
        multiplicación y división.
        */
        
        double a, b, suma, resta, multi, divi;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Primer numero: "); 
        a = sc.nextDouble();
        
        System.out.print("Segundo numero: "); 
        b = sc.nextDouble();
        
        suma = a+b;
        resta = a-b;
        multi = a*b;
        divi = a/b;
        
        System.out.println("Resultados: ");
        System.out.println("    Suma: " + suma);
        System.out.println("    Resta: " + resta);
        System.out.println("    Multiplicacion: " + multi);
        System.out.println("    Division: " + divi);
        
    }
    
}
