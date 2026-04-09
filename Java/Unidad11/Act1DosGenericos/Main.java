package Unidad11.Act1DosGenericos;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Contenedor<String, Integer> contenedor1 = new Contenedor<>("Hola", 2);
        Contenedor<Integer, String> contenedor2 = new Contenedor<>(3, "Hola");

        System.out.println(contenedor1);
        System.out.println(contenedor2);
    }

}
