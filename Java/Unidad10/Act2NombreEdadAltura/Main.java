package Unidad10.Act2NombreEdadAltura;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String linea;
        String[] jugadores = new String[0];
        try (FileReader file = new FileReader("Java\\Unidad10\\Act2NombreEdadAltura\\Jugadores.txt")) {
            BufferedReader in = new BufferedReader(file);
            while ((linea = in.readLine()) != null) {
                if (!linea.isEmpty()) {
                    jugadores = Arrays.copyOf(jugadores, jugadores.length + 1);
                    jugadores[jugadores.length - 1] = linea.trim();
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        String[] jugador;
        double mediaEdad = 0;
        double mediaAltura = 0;
        for (int i = 0; i < jugadores.length; i++) {
            jugador = jugadores[i].split(" ");
            System.out.println("Nombre: " + jugador[i]);
            mediaEdad += Double.valueOf(jugador[1]);
            mediaAltura += Double.valueOf(jugador[2]);
        }

        System.out.println("Media edad: " + mediaEdad / jugadores.length);
        System.out.println("Media altura: " + mediaAltura / jugadores.length);
    }
}
