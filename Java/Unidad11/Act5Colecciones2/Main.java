package Unidad11.Act5Colecciones2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static List<Integer> sumLists(List<Integer> listNumbers1, List<Integer> listNumbers2) {
        ArrayList<Integer> total = new ArrayList<>();

        for (int i = 0; i < Math.max(listNumbers1.size(), listNumbers2.size()); i++) {
            int n1 = (i < listNumbers1.size()) ? listNumbers1.get(i) : 0;
            int n2 = (i < listNumbers2.size()) ? listNumbers2.get(i) : 0;

            total.add(n1 + n2);
        }

        return total;
    }

    public static void removeRangeOfValue(List<Integer> list, Integer value1, Integer value2) {
        Integer valueMax = Math.max(value1, value2);
        Integer valueMin = Math.min(value1, value2);

        list.removeIf(value -> value >= valueMin && value <= valueMax);
    }

    public static void main(String[] args) {
        int number;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        do {
            System.out.print("Introduce un número: ");
            number = sc.nextInt();

            if (number > 0) {
                positive.add(number);
            } else if (number < 0) {
                negative.add(number);
            }

        } while (number != 0);

        System.out.println("List: " + positive + " Size: " + positive.size());
        System.out.println("List: " + negative + " Size: " + negative.size());
        System.out.println("List: " + sumLists(positive, negative) + " Size: " + sumLists(positive, negative).size());

        System.out.println("---------------------------");

        removeRangeOfValue(positive, -10, 10);
        removeRangeOfValue(negative, -10, 10);

        System.out.println("List: " + positive + " Size: " + positive.size());
        System.out.println("List: " + negative + " Size: " + negative.size());
        System.out.println("List: " + sumLists(positive, negative) + " Size: " + sumLists(positive, negative).size());
    }
}
