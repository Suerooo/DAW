import java.util.Scanner;

public class z7_edad {
    public static void main(String[] args) {
        /*
        Pide la edad de una persona y muestra:
        "Eres menor de edad" si es menor de 18.
        "Eres adulto" si tiene entre 18 y 64.
        "Eres adulto mayor" si tiene 65 o más.
         */

        //Variables
        int edad;

        //Pide la edad
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la edad: ");
        edad = sc.nextInt();

        if (edad<18) System.out.println("Eres menor de edad");
        if (edad>=18 && edad<=64) System.out.println("Eres adulto");
        if (edad>=65) System.out.println("Eres adulto mayor");

        //Cierra la variable sc
        sc.close();
    }
}
