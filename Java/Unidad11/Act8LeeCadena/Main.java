package Unidad11.Act8LeeCadena;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(leeCadena(sc.nextLine()));
    }

    public static List<Character> leeCadena(String cadena) {
        List<Character> listCharacter = new ArrayList<>();

        for (int i = 0; i < cadena.length(); i++) {
            listCharacter.add(cadena.charAt(i));
        }

        return listCharacter;
    }
}
