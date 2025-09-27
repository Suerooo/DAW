/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u1act9;

import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class U1act9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Un biólogo está realizando un estudio de distintas especies de 
        invertebrados y necesita una aplicación que le ayude a contabilizar 
        el número de patas que tienen en total todos los animales capturados 
        durante una jornada de trabajo. Para ello, te ha solicitado que 
        escribas una aplicación a la que hay que proporcionar:
        - El número de hormigas capturadas (6 patas).
        - El número de arañas capturadas (8 patas).
        - El número de cochinillas capturadas (14 patas).
        - La aplicación debe mostrar el número total de patas.
        */
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Cuantas hormigas ha captruado: "); 
        int hor = sc.nextInt(); 
        
        System.out.print("Cuantas arañas ha capturado: "); 
        int ara = sc.nextInt();
        
        System.out.print("Cuantas cochinillas ha capturado: "); 
        int coh = sc.nextInt();
        
        int phor = hor*6;
        int para = ara*8;
        int pcoh = coh*14;
        
        int patas = phor + para + pcoh;
        
        System.out.println("El numero total de patas es: " + patas);
 
    }
    
}
