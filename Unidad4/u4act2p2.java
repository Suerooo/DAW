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
    static void menu(int opción) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int opcion = sc.nextInt();

            
        } while (opción!=1 || opción!=2);
    }

    public static void main(String[] args) {
        
    }
}
