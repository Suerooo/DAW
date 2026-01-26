package Unidad1;

/*
 */


import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class Act3Frutero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. Por este motivo, 
        es necesario diseñar una aplicación que solicite las ventas (en kilos) de cada semestre para cada fruta. 
        La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos kilos de manzanas ha vendido el primer semestre: ");
        double manzana1 = sc.nextDouble();
        
        System.out.print("Cuantos kilos de peras ha vendido el primer semestre: ");
        double pera1 = sc.nextDouble();
        
        System.out.print("Cuantos kilos de manzanas ha vendido el segundo semestre: ");
        double manzana2 = sc.nextDouble();
        
        System.out.print("Cuantos kilos de peras ha vendido el segundo semestre: ");
        double pera2 = sc.nextDouble();
        
        double manzana = (manzana1+manzana2);
        double pera = (pera1+pera2);
        
        double importe = ((manzana*2.35) + (pera*1.95));
        System.out.println("Usted tiene un beneficio anual de: " + importe + " euros");

        //Cierra la variable sc
            }
    
}
