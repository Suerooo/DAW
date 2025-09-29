/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u1act7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class U1act7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que solicite las notas del primer, 
        segundo y tercer trimestre (notas enteras que se solicitarán al usuario).
        El programa debe mostrar la nota media del curso como se utiliza en el boletín 
        de calificaciones (solo la parte entera) y como se usa en el expediente académico (con decimales).
        */
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Cual fue tu nota el primer trimestre(sin decimales): "); 
        double pri = sc.nextInt(); 
        
        System.out.print("Cual fue tu nota el segundo trimestre(sin decimales): "); 
        double seg = sc.nextInt();
        
        System.out.print("Cual fue tu nota el tercer trimestre(sin decimales): "); 
        double ter = sc.nextInt();
                
        double mediad = ((pri+seg+ter)/3);
        int media = (int)mediad;
        
        System.out.println("Notas: \n Boletín: " + media + "\n Expediente académico: " + mediad);

        //Cierra la variable sc
        sc.close();
        
    }
    
}