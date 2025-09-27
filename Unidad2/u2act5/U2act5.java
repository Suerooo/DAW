/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2act5;

import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class U2act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Idear un programa que solicite al usuario un 
        número comprendido entre 1 y 7, correspondiente a 
        un día de la semana. Se debe mostrar el nombre del día 
        de la semana al que corresponde. Por ejemplo, el número 
        1 corresponde a «lunes» y el 6 a «sábado».
        */
        
        int dia;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Dia: "); 
        dia = sc.nextInt();
        
        if (dia<1 || dia>7) {
            System.out.println("Fecha invalida");
            System.exit(1);
        }
        
        switch (dia) {
            case 1:
                System.out.println("Hoy es Lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sabado");
                break;
            case 7:
                System.out.println("Hoy es Domingo");
                break;
                
        }
    }
    
}
