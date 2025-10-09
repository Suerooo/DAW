package Unidad4;

import java.util.Scanner;

public class u4act2 {

    //Función
    static void areaVolumen(int opción, double altura, double radio) {
        
        final double pi=3.14159265359;

        if (opción==1) {

            double area=2*pi * radio * (altura+radio);
            System.out.println("El area es "+area);

        } else if(opción==2){

            double volumen=pi * (radio*radio) * altura;
            System.out.println("El volumen es "+volumen);
            
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*Realizar una función que calcule y muestre el área 
        o el volumen de un cilindro, según se especifique. Para distinguir
        un caso de otro se le pasará como opción un número: 1 (para el área)
        o el 2 (para el volumen). Además, hay que pasarle a la función el radio
        de la base y la altura.

        Área = 2*pi * radio * (altura + radio)

        Volumen = pi * radio2 * altura  */

        Scanner sc = new Scanner(System.in);
        System.out.print("Quieres calcular el area (escribe 1) o el volumen (escribe 2): ");
        int opción = sc.nextInt();

        System.out.print("Cuantos cm mide la altura del cilindro: ");
        double altura = sc.nextDouble();

        System.out.print("Cuantos cm mide el radio del cilindro: ");
        double radio = sc.nextDouble();

        areaVolumen(opción, altura, radio);
    }
}
