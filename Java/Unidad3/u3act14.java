import java.util.Scanner;

public class u3act14 {
    public static void main(String[] args) {
        /*Crea un programa en Java que le pida al usuario que
        ingrese una frase y luego cuente cuántas vocales (a, e, i, o, u)
        hay en esa frase, ignorando las mayúsculas. */

        //Pide al usuario que introduzca una frase
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        
        //Establece la variable contadorVocales a 0
        int contadorVocales = 0;

        /*Lee el numero de caracteres que tiene la frase, después va transformando y guardando cada
        caracter en una variable y si es una vocal incrementa la variable contadorVocales y asi hasta que no queden mas caracteres */ 
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }

        //Imprime el numero de vocales calculado
        System.out.println("El total de vocales en la frase es: " + contadorVocales);
        scanner.close();
    }
}

