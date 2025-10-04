/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class U1act10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Una empresa que gestiona un parque acuático te solicita
        una aplicación que les ayude a calcular el importe que hay
        que cobrar en la taquilla por la compra de una serie de entradas
        (cuyo número será introducido por el usuario). Existen dos tipos 
        de entrada: infantiles, que cuestan 15,50 €; y de adultos, 
        que cuestan 20 €. En el caso de que el importe total sea igual 
        o superior a 100 €, se aplicará automáticamente un bono descuento del 5%.
        */
        
        double precioInfantil = 15.50;
        double precioAdulto = 20;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Cantidad de entradas infantiles: "); 
        int inf = sc.nextInt(); 
        
        System.out.print("Cantidad de entradas de adultos: "); 
        int adu = sc.nextInt();
        
        double imp = ( (precioInfantil*inf) + (precioAdulto*adu) );
        double des = imp * 0.05;
        
        if (imp >= 100)
            imp = imp - des;
        
        System.out.println("Importe total: " + imp + " euros");
        
        //Cierra la variable sc
        sc.close();

    }
    
}
