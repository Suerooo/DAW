/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package z2_AreaPerimetro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class z2_AreaPerimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Calcula el área y perímetro de un 
        rectángulo pidiendo base y altura al usuario.
        */
        
        double area, perimetro, base, altura;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Cuantos metros mide la base del rectangulo: "); 
        base = sc.nextDouble();
        
        System.out.print("Cuantos metros mide la altura del rectangulo: "); 
        altura = sc.nextDouble();
        
        area = base*altura;
        perimetro = (2*base) + (2*altura);
        
        System.out.println("Medidas rectangulo: ");
        System.out.println("    Area: " + area + " metros.");
        System.out.println("    Perimetro " + perimetro + " metros");
        
    }
    
}
