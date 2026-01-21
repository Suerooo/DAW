package Unidad7.Act13Decorar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Color aux1 = new Color();

        System.out.println(aux1);

        aux1.introducirColor("negro");
        System.out.println(aux1);

        System.out.println(Arrays.toString(aux1.paletaColores(1)));
    }
}
