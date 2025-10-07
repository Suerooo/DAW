import java.util.Scanner;

public class u3act13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número límite: ");
        int limite = sc.nextInt();

        System.out.println("Comprobando números del 2 al " + limite + ":");

        // Recorremos todos los números desde 2 hasta el límite
        for (int num = 2; num <= limite; num++) {
            boolean esPrimo = true; // asumimos que es primo

            // Comprobamos si num tiene algún divisor entre 2 y num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false; // si tiene divisor, no es primo
                    break; // salimos del bucle
                }
            }

            // Mostramos el resultado
            if (esPrimo) {
                System.out.println(num + " es primo");
            } else {
                System.out.println(num + " no es primo");
            }
        }

        sc.close();
    }
}
