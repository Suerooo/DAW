package Unidad9.Act7SocioSort;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio[] aux = new Socio[5];

        aux[0] = new Socio(1, "Raul", "Sueo", 53);
        aux[1] = new Socio(2, "Antonio", "dsa", 323);
        aux[2] = new Socio(3, "Don", "gfd", 24);
        aux[3] = new Socio(4, "Boolean", "dsad", 233);

        // Arrays.sort(aux);

        // Comparator comparaId = new Comparator() {
        // public int compare(Object o1, Object o2) {
        // return ((Socio) o1).getId() - ((Socio) o2).getId();
        // }
        // };

        // Comparator<Socio> comparaId = new Comparator<Socio>() {
        // public int compare(Socio o1, Socio o2) {
        // return o1.getId() - o2.getId();
        // }
        // };

        Comparator<Socio> comparaId = (o1, o2) -> o1.getId() - o2.getId();

        Arrays.sort(aux, comparaId);

        Arrays.sort(aux, (o1, o2) -> o1.getId() - o2.getId());
        System.out.println(Arrays.deepToString(aux));

        Arrays.sort(aux, new CompareNombreEdad());
        System.out.println(Arrays.deepToString(aux));

    }
}
