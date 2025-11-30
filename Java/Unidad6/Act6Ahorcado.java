package Unidad6;

import java.util.Scanner;

public class Act6Ahorcado {
    static Scanner sc=new Scanner(System.in);

    static String ocultarPalabra(String palabraAOcultar) {
        String palabraOcultada="";

        for (int i=0; i<palabraAOcultar.length(); i++) {
            palabraOcultada+="_";
        }

        return palabraOcultada;
    }

    static String revelarLetras(String palabraVisible, String palabraOculta, char letraARevelar) {
        for(int i=0; i<palabraVisible.length(); i++) {
            if (letraARevelar==palabraVisible.charAt(i)) {
                palabraOculta=palabraOculta.substring(0, i)+palabraVisible.charAt(i)+palabraOculta.substring(i+1);
            }
        }

        return palabraOculta;
    }

    public static void main(String[] args) {
        /*Realiza el juego del ahorcado. Las reglas del juego son:
        a) El jugador A teclea una palabra, sin que el jugador B la vea.
        b) Ahora se le muestra tantos guiones como letras tenga la palabra secreta. Por ejemplo, para «hola» será «_ _ _ _».
        c) El jugador B intentará acertar, letra a letra, la palabra secreta.
        d) Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán ocultas como guiones. 
        Siguiendo con el ejemplo anterior, y suponiendo que se ha introducido la ‘o’, la ‘j’ y la ‘a’, se mostrará: «_ o _a».
        e)El jugador B solo tiene 7 intentos.
        f)La partida terminará al acertar todas las letras que forman la palabra secreta (gana el jugador B) o cuando se agoten todos los intentos (gana el jugador A). */

        System.out.print("Jugador A - Teclea tu palabra: ");
        String palabraAAdivinar=sc.nextLine().toLowerCase();

        String palabraOculta=ocultarPalabra(palabraAAdivinar);
        int intentos=7;

        System.out.println("\n Palabra: "+palabraOculta);

        do {
            System.out.print("Jugador B - Con que letra quieres intentar: ");
            char letraIntentada=sc.next().toLowerCase().charAt(0);

            if (palabraAAdivinar.indexOf(letraIntentada) != -1) {
                palabraOculta=revelarLetras(palabraAAdivinar, palabraOculta, letraIntentada);
                System.out.println("Acertaste!! \n");
                
            } else {
                System.out.println("Fallaste te quedan "+(intentos-1)+" intentos \n");
                intentos--;
            }

            if (intentos>0) {
                System.out.println("Palabra: "+palabraOculta);
                
            } else {
                System.out.println("Intentos gastados - Ganador: Jugador A");
            }

        } while (intentos>0 && palabraOculta.indexOf('_') != -1);

        if (intentos>0) {
            System.out.println("Palabra adivinada - Ganador: Jugador B");
        }
    }
}
