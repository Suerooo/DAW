import java.util.Scanner;

public class u3act13 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*Crea un programa en Java que genere un número aleatorio entre 1 y 100.
        Luego, pide al usuario que adivine el número. El programa debe indicar si 
        la suposición es demasiado alta, demasiado baja o correcta. El juego continúa 
        hasta que el usuario adivine el número.
        */

        //Variables
        int numeroAleatorio, numeroDelUsuario;
        Scanner sc = new Scanner(System.in);

        //Genera un numero aleatorio entre 1 y 100
        numeroAleatorio = (int) (Math.random()*100+1);

        //Do while que pregunta al usuario que numero es hasta que lo adivine
        do {
    
            //Pregunta al usuario que numero cree que es
            System.out.print("Que numero crees que es(1-100): ");
            numeroDelUsuario = sc.nextInt();

            //Si el numero del usuarios mayor al numero del usuario se imprime que es demasiado alto si no que es demasiado bajo
            if (numeroDelUsuario>numeroAleatorio) {
                System.out.println("Demasiado alto \n");
            } 
            if (numeroDelUsuario<numeroAleatorio) {
                System.out.println("Demasiado bajo \n");
            }
            if (numeroDelUsuario==numeroAleatorio) {
               System.out.println("El numero: "+numeroDelUsuario+" es correcto"); 
            } 

        } while (numeroAleatorio!=numeroDelUsuario);
    }
}
