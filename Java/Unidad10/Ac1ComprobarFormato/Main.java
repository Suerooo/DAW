package Unidad10.Ac1ComprobarFormato;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        Integer num = sc.nextInt();
        try {
            return num;
        } catch (InputMismatchException e) {
            System.out.println(e);
            leerEntero();
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(leerEntero());
    }
}
