package Unidad7.Act15ClaseHora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Horas hora1 = new Horas();

        System.out.println("Hora: ");
        int valor = sc.nextInt();
        hora1.setHora(valor);

        System.out.println("Minuto: ");
        valor = sc.nextInt();
        hora1.setMinuto(valor);

        System.out.println("Segundo: ");
        valor = sc.nextInt();
        hora1.setSegundo(valor);

        System.out.println("Cuántos segundos quiere mostrar: ");
        int numSegundos = sc.nextInt();

        for (int i = 0; i <= numSegundos; i++) {
            // mostramos la hora
            System.out.println(hora1.getHora() + ":" + hora1.getMinuto() + ":" + hora1.getSegundo());
            hora1.incrementaSegundo();
        }

            }
}
