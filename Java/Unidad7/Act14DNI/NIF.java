package Unidad7.Act14DNI;

import java.util.Scanner;

public class NIF {
    private int dni;
    private char letra;
    private static final String MENSAJE_INVALIDO = "El DNI debe de tener 8 numeros";

    public NIF() {
        this.dni = 12345678;
        this.letra = calcularLetra(this.dni);
    }

    public NIF(int dni) {
        setDni(dni);
        this.letra = calcularLetra(this.dni);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        if (dniValido(dni)) {
            System.out.println(MENSAJE_INVALIDO);
            this.dni = 12345678;
        } else {
            this.dni = dni;
        }
    }

    public static char leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un dni: ");
        int dni = sc.nextInt();

        if (dniValido(dni)) {
            System.out.println(MENSAJE_INVALIDO);
            return '?';
        } else {
            return calcularLetra(dni);
        }
    }

    @Override
    public String toString() {
        return dni + "-" + letra;
    }

    private static boolean dniValido(int dni) {
        return !(dni > 99999999 || dni < 10000000);
    }

    public static char calcularLetra(int dni) {
        switch (dni % 23) {
            case 0:
                return 'T';
            case 1:
                return 'R';
            case 2:
                return 'W';
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';
            case 7:
                return 'F';
            case 8:
                return 'P';
            case 9:
                return 'D';
            case 10:
                return 'X';
            case 11:
                return 'B';
            case 12:
                return 'N';
            case 13:
                return 'J';
            case 14:
                return 'Z';
            case 15:
                return 'S';
            case 16:
                return 'Q';
            case 17:
                return 'V';
            case 18:
                return 'H';
            case 19:
                return 'L';
            case 20:
                return 'C';
            case 21:
                return 'K';
            case 22:
                return 'E';
            default:
                System.out.println(MENSAJE_INVALIDO);
                return '?';
        }
    }

    public char getLetra() {
        return letra;
    }
}
