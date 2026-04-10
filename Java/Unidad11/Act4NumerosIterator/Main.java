package Unidad11.Act4NumerosIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            randomNumbers.add(ThreadLocalRandom.current().nextInt(1, 11));
        }

        System.out.println("List: " + randomNumbers + " Size: " + randomNumbers.size());

        Iterator<Integer> it = randomNumbers.iterator();

        while (it.hasNext()) {
            Integer number = it.next();

            if (number == 5) {
                it.remove();
            }
        }

        System.out.println("List: " + randomNumbers + " Size: " + randomNumbers.size());
    }
}
