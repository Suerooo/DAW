package Unidad11.Act6MetodosGlobales;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            randomNumbers.add(ThreadLocalRandom.current().nextInt(1, 11));
        }

        System.out.println("List: " + randomNumbers + " Size: " + randomNumbers.size());

        Iterator<Integer> it = randomNumbers.iterator();

        while (it.hasNext()) {
            Integer number = it.next();

            if (number.equals(5)) {
                it.remove();
            }
        }

        System.out.println("List: " + randomNumbers + " Size: " + randomNumbers.size());
    }
    
    
}