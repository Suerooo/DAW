package u3act4;

import java.util.Scanner;

public class u3act4 {
    public static void main(String[] args) {
        /*Implementa la aplicación ECO, que pide al
        usuario un número y muestra en pantalla la salida:
        ECO
        ECO
        ECO
        Se muestra ECO tantas veces como el número introducido
        por teclado. La salida anterior sería para el número 3 */

        //Variables
        int numero, veces;

        //Pregunta el numero de veces que se tiene que repetir ECO
        Scanner sc = new Scanner(System.in); 
        System.out.print("Cuantas veces si tiene que repetir ECO: "); 
        numero = sc.nextInt();

        //Bucle en el que se repite el ECO un numero de veces
        for (veces=0; numero!=veces; veces++) {
            System.out.println("ECO");
        }

        //Cierra la variable sc
        sc.close();
    }
}
