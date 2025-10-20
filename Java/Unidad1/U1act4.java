package Unidad1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class U1act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar una aplicación que solicite al usuario su edad y 
        le indique si es mayor de edad (mediante un literal booleano: true o false).
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Cual es tu edad: ");
        int edad = sc.nextInt();
        
        boolean mayoría = edad >= 18;
        
        System.out.println("El usuario es mayor de edad: " + mayoría);
        
        //Cierra la variable sc
        sc.close();
    }
    
}
