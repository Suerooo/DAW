package Unidad4;

import java.util.Scanner;

public class u4act5 {

    //Método que calcula la diferencia de minutos entre dos horas
    static int diferenciaMin (int hora1,  int min1,  int  hora2,  int  min2) {
        //Calcula la diferencia de hora y de minutos y usa el método Math.abs para en caso de dar negativo volverlo positivo
        int hora = Math.abs(hora1-hora2);
        int min = Math.abs(min1-min2);

        //Transforma la diferencia de horas en minutos y le suma la diferencia de minutos
        int diferencia = (hora*60)+min;

        //Devuelve el valor calculado
        return diferencia;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo, con el siguiente prototipo:

        Static int diferenciaMin (int hora1,  int minuto1,  int  hora2,  int  minuto2)

        La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados. */

        //Pregunta y guarda la primera hora y minuto y la segunda hora y minuto
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int hora1 = sc.nextInt();

        System.out.print("Introduce un número: ");
        int min1 = sc.nextInt();

        System.out.print("Introduce un número: ");
        int hora2 = sc.nextInt();

        System.out.print("Introduce un número: ");
        int min2 = sc.nextInt();

        //Llama al método diferenciaMin y lo guarda el resultado en una variable para imprimir el resultado
        int diferencia=diferenciaMin(hora1, min1, hora2, min2);
        System.out.println("La diferencia en minutos es "+diferencia);
    }
}
