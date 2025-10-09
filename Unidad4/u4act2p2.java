package Unidad4;

import java.util.Scanner;

public class u4act2p2 {

    static void areaCilindro(double radio, double altura) {
        double area=2*Math.PI * radio * (altura+radio);
        System.out.println("El area es "+area);
    }

    static void volumenCilindro(double radio, double altura) {
        double volumen=Math.PI * (radio*radio) * altura;
        System.out.println("El volumen es "+volumen);
    }

    @SuppressWarnings("resource")
    static void menu() {
        int opción;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Calcular el area del cilindro (1) o calcular el volumen (2), escribe otro numero para cerrar: ");
            opción = sc.nextInt();

            switch (opción) {
                case 1 -> {
                    System.out.print("Cuantos cm mide la altura del cilindro: ");
                    double altura = sc.nextDouble();

                    System.out.print("Cuantos cm mide el radio del cilindro: ");
                    double radio = sc.nextDouble();

                    areaCilindro(radio, altura);

                }
                case 2 -> {
                    System.out.print("Cuantos cm mide la altura del cilindro: ");
                    double altura = sc.nextDouble();

                    System.out.print("Cuantos cm mide el radio del cilindro: ");
                    double radio = sc.nextDouble();

                    volumenCilindro(radio, altura);
                }
                default -> System.out.println("Cerrando...");
            }

        } while (opción==1 || opción==2);
    }

    public static void main(String[] args) {
        
        menu();

    }
}
