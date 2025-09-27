/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u1act6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class U1act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Un economista te ha encargado un programa para realizar cálculos con el IVA. 
        La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. 
        Muestra el importe correspondiente al IVA y al total.
        */
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Cual es la base imponible: "); 
        double base = sc.nextDouble(); 
        
        System.out.print("Y cual es el porcentaje del IVA: "); 
        int ivai = sc.nextInt();
        
        double iva = ivai;
        double ivap =(base*(iva/100));
        double total=(base+ivap);
        
        System.out.println("Importe: \n IVA: " + ivap + " euros\n Total: " + total + " euros"  );
    }
    
}