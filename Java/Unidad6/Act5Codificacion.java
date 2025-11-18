import java.util.Scanner;

public class Act5Codificacion {
    static Scanner sc=new Scanner(System.in);

    static char codificarLetra(char[] conjunto1, char[] conjunto2, char c) {   
        c=Character.toLowerCase(c);

        for (int i=0; i<conjunto1.length; i++) {
            if (conjunto1[i]==c) {
                c=conjunto2[i];

                return c;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        System.out.print("Que frase quieres codificar: ");
        String fraseACodificar=sc.nextLine();

        String fraseCodificada="";
        for (int i=0; i<fraseACodificar.length(); i++) {
            fraseCodificada+=codificarLetra(conjunto1, conjunto2, fraseACodificar.charAt(i));
        }

        System.out.println(fraseCodificada);
    }
}
