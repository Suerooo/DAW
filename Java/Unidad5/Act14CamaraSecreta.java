package Unidad5;

import java.util.Scanner;

public class Act14CamaraSecreta {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*Desarrollar el juego «la cámara secreta», que consiste en abrir una cámara 
        mediante su combinación secreta, que está formado por una combinación de dígitos 
        del uno al cinco. El jugador especificará cuál es la longitud de la combinación 
        a mayor longitud, mayor será la dificultad del juego. La aplicación genera, de forma 
        aleatoria, una combinación secreta que el usuario tendrá que acertar. En cada intento 
        se muestra como pista, para cada dígito de la combinación introducido por el jugador, 
        si es mayor, menor o igual que el correspondiente en la combinación secreta. */

        System.out.println("---ELEGIR DIFICULTAD---");
        System.out.print("Tamaño de la cámara: ");
        int tamanoCamara=sc.nextInt();

        //Crea array con números aleatorios
        int[] camaraSecreta=new int[tamanoCamara];
        
        for(int i=0; i<camaraSecreta.length; i++) {
            camaraSecreta[i]=(int) (Math.random()*5+1);
        }
        
        //Juego
        int i=0;
        do {
            System.out.print("Que número crees que es: ");
            int intento=sc.nextInt();

            if (intento==camaraSecreta[i]) {
                System.out.println("Correcto!!");
                i++;
            } else {

                if (intento<camaraSecreta[i]) {
                    System.out.println("Demasiado pequeño vuelve a intentarlo");
                }

                if (intento>camaraSecreta[i]) {
                    System.out.println("Demasiado grande vuelve a intentarlo");
                }
            }
        } while (i<camaraSecreta.length);
        System.out.println("HAS GANADO!!");
    }
}
