package Unidad4;

import java.util.Scanner;

public class U4act2 {
    static Scanner sc = new Scanner(System.in); 

    //Crea un método que calcula el area y el volumen a partir de 3 variables (altura, radio, opción[que quiere calcular)
    static void areaVolumen(int opcion, double altura, double radio) {
        
        //Crea pi como una variable final
        final double pi=3.14159265359;

        //Si la variable(opción) es == 1, calcula con las anteriores variables(altura,radio) el area y lo imprime
        if (opcion==1) {

            double area=2*pi * radio * (altura+radio);
            System.out.println("El area es "+area);

        //Si la variable(opción) es == 2, calcula con las anteriores variables(altura,radio) el volumen y lo imprime
        } else if(opcion==2){

            double volumen=pi * (radio*radio) * altura;
            System.out.println("El volumen es "+volumen);
            
        }
    }

    public static void main(String[] args) {
        /*Realizar una función que calcule y muestre el área 
        o el volumen de un cilindro, según se especifique. Para distinguir
        un caso de otro se le pasará como opción un número: 1 (para el área)
        o el 2 (para el volumen). Además, hay que pasarle a la función el radio
        de la base y la altura.

        Área = 2*pi * radio * (altura + radio)

        Volumen = pi * radio2 * altura  */

        //Pregunta y guarda la opción que quiere elegir la altura y el radio del cilindro
        System.out.print("Quieres calcular el area (escribe 1) o el volumen (escribe 2): ");
        int opcion = sc.nextInt();

        System.out.print("Cuantos cm mide la altura del cilindro: ");
        double altura = sc.nextDouble();

        System.out.print("Cuantos cm mide el radio del cilindro: ");
        double radio = sc.nextDouble();

        //Llama al método areaVolumen
        areaVolumen(opcion, altura, radio);
    }
}
