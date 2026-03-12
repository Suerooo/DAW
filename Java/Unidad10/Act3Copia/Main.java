package Unidad10.Act3Copia;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Como se llama tu archivo: ");
        String archivo = sc.next();

        if (!archivo.contains(".")) {
            archivo = archivo + ".txt";
        }

        try (BufferedReader original = new BufferedReader(new FileReader("Java\\Unidad10\\Act3Copia\\" + archivo));
                BufferedWriter copia = new BufferedWriter(new FileWriter("Java\\Unidad10\\Act3Copia\\copia_de_" + archivo))) { 
            String lineaCopia;
            while ((lineaCopia = original.readLine()) != null) {
                copia.write(lineaCopia);
                copia.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
