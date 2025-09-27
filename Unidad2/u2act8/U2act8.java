/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2act8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class U2act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        EI DNI consta de un entero de 8 dígitos seguido de una 
        letra que se obtiene a partir del número de la siguiente forma:
        letra = número DNI módulo 22
        Basándote en esta información, elige la letra a 
        partir de la numeración de la siguiente tabla:
        y diseña una aplicación en la que, dado un número de 
        DNI, calcule la letra que le corresponde. Observa que 
        un número de 8 dígitos está dentro del rango del tipo int.
        */
        
        
        int dni, restodni;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("8 digitos del DNI: "); 
        dni = sc.nextInt();
        
        restodni = dni%23;
        
        
        switch (restodni) {
            case 0:
                System.out.println("La letra de tu dni es T: " + dni + "T");
                break;
            case 1:
                System.out.println("La letra de tu dni es R: " + dni + "R");
                break;
            case 2:
                System.out.println("La letra de tu dni es W: " + dni + "W");
                break;
            case 3:
                System.out.println("La letra de tu dni es A: " + dni + "A");
                break;
            case 4:
                System.out.println("La letra de tu dni es G: " + dni + "G");
                break;
            case 5:
                System.out.println("La letra de tu dni es M: " + dni + "M");
                break;
            case 6:
                System.out.println("La letra de tu dni es Y: " + dni + "Y");
                break;
            case 7:
                System.out.println("La letra de tu dni es F: " + dni + "F");
                break;
            case 8:
                System.out.println("La letra de tu dni es P: " + dni + "P");
                break;
            case 9:
                System.out.println("La letra de tu dni es D: " + dni + "D");
                break;
            case 10:
                System.out.println("La letra de tu dni es X: " + dni + "X");
                break;
            case 11:
                System.out.println("La letra de tu dni es B: " + dni + "B");
                break;
            case 12:
                System.out.println("La letra de tu dni es N: " + dni + "N");
                break;
            case 13:
                System.out.println("La letra de tu dni es J: " + dni + "J");
                break;
            case 14:
                System.out.println("La letra de tu dni es Z: " + dni + "Z");
                break;
            case 15:
                System.out.println("La letra de tu dni es S: " + dni + "S");
                break;
            case 16:
                System.out.println("La letra de tu dni es Q: " + dni + "Q");
                break;
            case 17:
                System.out.println("La letra de tu dni es V: " + dni + "V");
                break;
            case 18:
                System.out.println("La letra de tu dni es H: " + dni + "H");
                break;
            case 19:
                System.out.println("La letra de tu dni es L: " + dni + "L");
                break;
            case 20:
                System.out.println("La letra de tu dni es C: " + dni + "C");
                break;
            case 21:
                System.out.println("La letra de tu dni es K: " + dni + "K");
                break;  
            case 22:
                System.out.println("La letra de tu dni es E: " + dni + "E");
                break;  
        }
        
    }
    
}
