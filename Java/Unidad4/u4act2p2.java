package Unidad4;

import java.util.Scanner;

public class u4act2p2 {

    //Método que calcula el area del cilindro con las variables (altura, radio)
    static void areaCilindro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos cm mide la altura del cilindro: ");
        double altura = sc.nextDouble();

        System.out.print("Cuantos cm mide el radio del cilindro: ");
        double radio = sc.nextDouble();

        double area=2*Math.PI * radio * (altura+radio);
        System.out.println("El area es "+area);
    }

    //Método que calcula el volumen del cilindro con las variables (altura, radio)
    static void volumenCilindro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos cm mide la altura del cilindro: ");
        double altura = sc.nextDouble();

        System.out.print("Cuantos cm mide el radio del cilindro: ");
        double radio = sc.nextDouble();

        double volumen=Math.PI * (radio*radio) * altura;
        System.out.println("El volumen es "+volumen);
    }

    
    //Método que crea un menu en el que puedes elegir que método llamar, areaCilindro o volumenCilindro
    static void menu() {
        int opción;
        do {
            //Pregunta y guarda la elección del usuario
            Scanner sc = new Scanner(System.in);
            System.out.print("Calcular el area del cilindro (1) o calcular el volumen (2), escribe otro numero para cerrar: ");
            opción = sc.nextInt();

            /*Pregunta y guarda las variables (altura, radio) y si el usuario en la variable (opción)
            eligió 1 llama el método areaCilindro y si eligió 2 llama al método volumenCilindro 
            en caso de elegir otro numero termina el programa e imprime "Cerrando..."*/
            switch (opción) {
                case 1 -> {

                    areaCilindro();

                }
                case 2 -> {

                    volumenCilindro();
                }
                default -> System.out.println("Cerrando...");
            }

        } while (opción==1 || opción==2);
    }

    public static void main(String[] args) {
        
        //Llama al método menu
        menu();

    }
}
