package Unidad11.Act7MetodosArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            randomNumbers.add(ThreadLocalRandom.current().nextInt(1, 21));
        }

        System.out.println(randomNumbers);

        Integer[] table = randomNumbers.toArray(new Integer[0]);
        Arrays.sort(table);

        randomNumbers = Arrays.asList(table);
        System.out.println(randomNumbers);

        table = randomNumbers.toArray(new Integer[0]);
        Arrays.sort(table, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 - o2) * -1;
            }
        });
        
        randomNumbers = Arrays.asList(table);
        System.out.println(randomNumbers);
    }
}
