package Unidad11.Act6MetodosGlobales;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> randomNumbers = new ArrayList<>();

        fillRandomNumbers(randomNumbers);

        System.out.println("List: " + randomNumbers + " Size: " + randomNumbers.size());

        removeNum(randomNumbers, 5);

        System.out.println("List: " + randomNumbers + " Size: " + randomNumbers.size());
    }

    public static void fillRandomNumbers(Collection<Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add(ThreadLocalRandom.current().nextInt(1, 11));
        }
    }

    public static void removeNum(Collection<Integer> list, int num) {
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer number = it.next();

            if (number.equals(num)) {
                it.remove();
            }
        }
    }
}