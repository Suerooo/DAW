package Unidad11.Act10LeeCadenas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> cad1 = new ArrayList<>();
        List<Character> cad2 = new ArrayList<>();
        cad1.add('H');
        cad1.add('o');
        cad2.add('l');
        cad2.add('a');

        System.out.println(uneCadenas(cad1, cad2));
    }

    public static List<Character> uneCadenas(List<Character> cad1, List<Character> cad2) {
        cad1.addAll(cad2);
        return cad1;
    }
}
