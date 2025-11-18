import java.util.Scanner;

public class Act4PalabraPalabra {
    static Scanner sc=new Scanner(System.in);

    static String palabraPalabra() {
        String palabra, frase="";
        do {
            System.out.print("Que palabra quiere añadir (escribe 'fin' para dejar de añadir): ");
            palabra=sc.nextLine();

            if (!(palabra.equalsIgnoreCase("FIN"))) {
                frase+=palabra+" ";
            } else {
                break;
            }
            
        } while (!(palabra.equalsIgnoreCase("FIN")));

        return frase;
    }
    public static void main(String[] args) {
        /*Introducir por teclado una frase palabra a palabra, y mostrar la frase 
        completa separando las palabras introducidas con espacios en blanco. 
        Terminar de leer la frase cuando alguna de las palabras introducidas 
        sea la cadena «fin» escrita con cualquier combinación de mayúsculas y 
        minúsculas. La cadena «fin» no aparecerá en la frase final. */

        System.out.println(palabraPalabra());
    }
}
