package Unidad9.Act12NumerosEntre20;

import java.util.Comparator;

public class CompareInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
