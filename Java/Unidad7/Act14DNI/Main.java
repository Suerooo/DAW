package Unidad7.Act14DNI;

public class Main {
    public static void main(String[] args) {
        NIF nif1 = new NIF();
        System.out.println("NIF por defecto: " + nif1);

        NIF nif2 = new NIF(87654321);
        System.out.println("NIF con DNI válido: " + nif2);

        NIF nif3 = new NIF(123);
        System.out.println("NIF con DNI inválido: " + nif3);

        nif3.setDni(23456789);
        System.out.println("NIF después de setDni válido: " + nif3);

        nif3.setDni(123);
        System.out.println("NIF después de setDni inválido: " + nif3);

        System.out.println("Prueba de leer() - introduce un DNI:");
        char letra = NIF.leer();
        System.out.println("Letra calculada: " + letra);

        System.out.println("Letra del NIF2: " + nif2.getLetra());
    }
}
