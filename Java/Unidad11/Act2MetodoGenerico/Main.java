package Unidad11.Act2MetodoGenerico;

import java.util.Arrays;

public class Main {
    public static <T> T[] mixArrays(T[] array1, T[] array2) {
        T[] result = Arrays.copyOf(array1, array1.length);

        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }

    public static void main(String[] args) {
        Integer[] array1 = { 1, 2, 3 };
        Integer[] array2 = { 4, 5 };

        System.out.println(Arrays.deepToString(mixArrays(array1, array2)));
    }
}
