package Unidad7.Act13Decorar;

import java.util.Arrays;

public class Color {
    private String[] colores = { "ROJO", "AMARILLO", "AZUL" };

    public Color(String[] colores) {
        this.colores = colores;
    }

    public Color() {
    }

    public void introducirColor(String color) {
        colores = Arrays.copyOf(colores, colores.length + 1);
        colores[colores.length - 1] = color.toUpperCase();
    }

    @Override
    public String toString() {
        return "Color [colores=" + Arrays.toString(colores) + "]";
    }

    public void paletaColores() {
        int index = (int) (Math.random() * colores.length);

        for (int i = 0; i < colores.length; i++) {
            if (i >= index) {
                System.out.print(colores[i] + " ");
            }
        }
    }
}
