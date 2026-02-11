package Unidad9.Act7SocioSort;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio[] aux = new Socio[5];

        aux[0] = new Socio(1, "Raul", "Sueo");
        aux[1] = new Socio(2, "Antonio", "dsa");
        aux[2] = new Socio(3, "Don", "gfd");
        aux[3] = new Socio(4, "Boolean", "dsad");

        // Arrays.sort(aux);

        Comparator comparaId = new Comparator<Socio>() {
            public int compare(Socio o1, Socio o2) {
                return o1.getId() - o2.getId();
            }
        };

        Arrays.sort(aux, comparaId);

        System.out.println(Arrays.deepToString(aux));
    }
}
