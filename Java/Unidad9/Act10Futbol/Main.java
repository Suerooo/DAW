package Unidad9.Act10Futbol;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Futbolista[] aux = new Futbolista[5];
        aux[0] = new Futbolista(2, "Pepe", 22, 11);
        aux[1] = new Futbolista(1, "Manuel", 12, 12);
        aux[2] = new Futbolista(3, "Jose", 42, 13);
        aux[3] = new Futbolista(4, "Pedro", 32, 14);
        aux[4] = new Futbolista(5, "Jun", 52, 15);

        Arrays.sort(aux);
        System.out.println(Arrays.deepToString(aux));

        System.out.println("-----------------------------------");

        // Comparator compareNombre = new Comparator() {
        // public int compare(Object o, Object a) {
        // Futbolista o1 = (Futbolista) o;
        // Futbolista a1 = (Futbolista) a;
        // return o1.getNombre().compareTo(a1.getNombre());
        // }
        // };

        Comparator<Futbolista> compareNombre = (o1, o2) -> o1.getNombre().compareTo(o2.getNombre());

        Arrays.sort(aux, compareNombre);
        System.out.println(Arrays.deepToString(aux));

        System.out.println("-----------------------------------");

        // Comparator compareEdad = new Comparator() {
        // public int compare(Object o, Object a) {
        // Futbolista o1 = (Futbolista) o;
        // Futbolista a1 = (Futbolista) a;
        // return o1.getEdad() - a1.getEdad();
        // }
        // };

        Comparator<Futbolista> compareEdad = (o1, o2) -> o1.getEdad() - o2.getEdad();

        Arrays.sort(aux, compareEdad);
        System.out.println(Arrays.deepToString(aux));
    }
}
