package Unidad9.Act7SocioSort;

import java.util.Comparator;

public class CompareNombreEdad implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        int compare = o1.getNombre().compareTo(o2.getNombre());

        if (compare == 0) {
            return o1.getEdad() - o2.getEdad();
        } else {
            return compare;
        }
    }

}
