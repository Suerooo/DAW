

import java.util.Scanner;

public class u3act7 {
    public static void main(String[] args) {
        /*Escribe un programa que incremente la hora
        de un reloj. Se pide por teclado la hora, minutos
        y segundos, así como cuantos segundos se desea
        incrementar la hora introducida. La aplicación mostrará
        la nueva hora. Por ejemplo, si las 13:59:51 se incrementa
        en 10 segundos, resultan las 14:00:01 */

        //Variables
        int horas, minutos, segundos, cuantos;

        //Pide la hora
        Scanner sc = new Scanner(System.in); 
        System.out.print("Hora: "); 
        horas = sc.nextInt();

        System.out.print("Minutos: "); 
        minutos = sc.nextInt();

        System.out.print("Segundos: "); 
        segundos = sc.nextInt();

        System.out.print("Cuantos segundos incrementamos: "); 
        cuantos = sc.nextInt();

        //For para incrementar n segundos
        for (int veces=0; veces<cuantos; veces++) {
            //Incrementa un segundo
            segundos++;

            //If para cuando los segundos superen los 59
            if (segundos>59) {
                minutos+=1;
                segundos-=60;
            }

            //If para cuando los minutos superen los 59
            if (minutos>59) {
                minutos=0;
                horas++;
            }

            //If para cuando las horas superen los 23
            if (horas>23) {
                horas=0;
            }
        }

        //Imprime la hora
        System.out.println("Son las "+ horas + ":" + minutos + ":" + segundos);
    }
}
