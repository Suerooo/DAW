package u3act5;

import java.util.Scanner;

public class u3act5 {
    public static void main(String[] args) {
        /*Pedir diez números enteros
        por teclado y mostrar la media.*/

        //Variables
        int veces, num;
        double total=0, media;

        //Bucle para pedir 10 números
        for (veces=0;veces!=10;veces++) {

            //Pide uno de los números
            Scanner sc = new Scanner(System.in); 
            System.out.print("Introduce un numero: "); 
            num = sc.nextInt();

            //Lo añade al total
            total+=num;

            //Cierra la variable sc
            sc.close();
        }
        
        //Calculo de la media y print para mostrar lo
        media=total/10.0;
        System.out.println("Media de todos los números: "+media);
        
    }
}