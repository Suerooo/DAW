/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2act6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class U2act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que pida una hora de la siguiente forma: 
        hora, minutos y segundos. El programa debe mostrar qué hora será 
        un segundo más tarde. Por ejemplo: hora actual [10:41:59] -› 
        hora actual +1 segundo: [10:42:00]
        */
        
        int seg, min, hora;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Horas: "); 
        hora = sc.nextInt();
        
        System.out.print("Minutos: "); 
        min = sc.nextInt();
        
        System.out.print("Segundos: "); 
        seg = sc.nextInt();
        
        if (hora>=25 || min>=60 || seg>=60) {
            System.out.println("Error: horas/minutos/segundos inválidos");
            System.exit(1);
        }
        
        if (seg>=59) {
            seg = 0;
            min = ++min;    
        }
        
        if (min>=59) {
            min = 0;
            hora = ++hora;
        }
        
        if (hora>24) {
            hora = 1;
            min = 0;
            seg = 0;
        }
        
        System.out.println("Dentro de un segundo serán las: " + hora + ":" + min + ":" + seg);
        
    }
    
}
