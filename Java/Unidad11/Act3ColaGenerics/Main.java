package Unidad11.Act3ColaGenerics;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Cola<Integer> queue = new Lista<>();
        Integer number = 0;
        Integer numeroQueue;

        do {
            System.out.print("Introduce un número: ");
            number = sc.nextInt();

            if (number != -1)
                queue.encolar(number);

        } while (number != -1);

        while ((numeroQueue = queue.desencolar()) != null) {
            System.out.println(numeroQueue);
        }
    }
}
