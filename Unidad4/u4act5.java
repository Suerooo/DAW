package Unidad4;

import java.util.Scanner;

public class u4act5 {

    static int diferenciaMin (int hora1,  int min1,  int  hora2,  int  min2) {
        int hora = Math.abs(hora1-hora2);
        int min = Math.abs(min1-min2);
        int diferencia = (hora*60)+min;
        return diferencia;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo, con el siguiente prototipo:

        Static int diferenciaMin (int hora1,  int minuto1,  int  hora2,  int  minuto2)

        La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados. */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int hora1 = sc.nextInt();

        System.out.print("Introduce un número: ");
        int min1 = sc.nextInt();

        System.out.print("Introduce un número: ");
        int hora2 = sc.nextInt();

        System.out.print("Introduce un número: ");
        int min2 = sc.nextInt();

        int diferencia=diferenciaMin(hora1, min1, hora2, min2);
        System.out.println("La diferencia en minutos es "+diferencia);
    }
}
