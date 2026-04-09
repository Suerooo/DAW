package Unidad11.Act3ColaGenerics;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Cola<Integer> cola = new Lista<>();
        Integer numero = 0;
        Integer numeroCola;

        do {
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();
            
            if (numero != -1)
                cola.encolar(numero);
            
        } while (numero != -1);

        while ((numeroCola = cola.desencolar()) != null) {
            System.out.println(numeroCola);
        }
    }
}
