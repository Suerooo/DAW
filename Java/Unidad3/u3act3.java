

import java.util.Random;
import java.util.Scanner;

public class u3act3 {
    public static void main(String[] args) {
        /*Desarrollar un juego que ayude a mejorar
        el cálculo mental de la suma. El jugador
        tendrá que introducir la solución de la
        suma de dos números aleatorios comprendidos
        entre 1 y 100. Mientras la solución introducida
        sea correcta, el juego continuará. En caso
        contrario, el programa terminará y mostrará 
        el número de operaciones realizadas correctamente.*/

        //Variables
        int numero1, numero2, respuesta, aciertos=0;

        do {
            //Genera el primer numero aleatorio
            Random rand = new Random();
            numero1 = rand.nextInt(100) + 1;

            //Genera el segundo numero aleatorio
            numero2 = rand.nextInt(100) + 1;

            //Cuenta la cantidad de aciertos
            ++aciertos;

            //Pregunta cual es la respuesta
            Scanner sc = new Scanner(System.in); 
            System.out.print("Cuanto es: "+numero1+"+"+numero2+"="); 
            respuesta = sc.nextInt();

        } while (numero1+numero2==respuesta);
        
        //Print de respuesta incorrecta
        System.out.println("Respuesta incorrecta");
        System.out.println("Total de aciertos: "+(aciertos-1));

    }
}
