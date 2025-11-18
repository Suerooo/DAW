import java.util.Scanner;

public class Act2NumeroPalabrasFrase {
    static Scanner sc=new Scanner(System.in);

    static int buscarCantidadCoincidencias(String frase, String palabra) {
        int contadorCoincidencias=0;

        for (int i=0; i<frase.length(); i++) {
            if (frase.regionMatches(true, i, palabra, 0, palabra.length()-1)) {
                contadorCoincidencias++;
            }
        }

        return contadorCoincidencias;
    }

    public static void main(String[] args) {
        /*Diseñar un programa que solicite al usuario una frase y una palabra.
        A continuación buscará cuántas veces aparece la palabra en la frase. */

        System.out.print("En que frase quieres buscar la palabra: ");
        String frase=sc.nextLine();

        System.out.print("Que palabra quieres buscar: ");
        String palabra=sc.nextLine();
        
        System.out.println(buscarCantidadCoincidencias(frase, palabra));
    }
}
