package Unidad9.Act12NumerosEntre20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] aux = new Integer[20];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = (int) (Math.random() * 100 + 1);
        }

        Arrays.sort(aux, new CompareInteger().reversed());
        System.out.println(Arrays.deepToString(aux));
    }
}
