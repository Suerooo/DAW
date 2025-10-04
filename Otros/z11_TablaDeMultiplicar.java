import java.util.Scanner;

public class z11_TablaDeMultiplicar {
    public static void main(String[] args) {
        /*Pide un número y muestra su tabla 
        de multiplicar del 1 al 10.*/

        //Variables
        int numero, resultado;

        //Pide el numero al usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();

        //For que multiplica el numero hasta diez
        for (int multi=1;multi<=10;multi++) {
            resultado=numero*multi;
            System.out.println(numero+"*"+multi+"="+resultado);
        }

        //Cierra la variable sc
        sc.close();
    }
}
