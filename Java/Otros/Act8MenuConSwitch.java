import java.util.Scanner;

public class Act8MenuConSwitch {
    public static void main(String[] args) {
        /*Pide una opción del 1 al 4 y 
        muestra un mensaje distinto para 
        cada una usando switch.*/

        //Variables
        int numero;

        //Pide un número del 1 al 4
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 4: ");
        numero = sc.nextInt();

        //Switch que que contempla del 1 al 4
        switch (numero) {
            case 1:
                System.out.println("Tu numero fue 1");
                break;
            case 2:
                System.out.println("Tu numero fue 2");
                break;
            case 3:
                System.out.println("Tu numero fue 3");
                break;
            case 4:
                System.out.println("Tu numero fue 4");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
        
        //Cierra la variable sc
            sc.close();
    }
}
