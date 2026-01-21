package Unidad7.Act13Decorar;

import java.util.Arrays;

public class Color {
    private String[] colores = { "ROJO", "AMARILLO", "AZUL", "VERDE", "BLANCO", "MORADO", };

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

    public String[] paletaColores(int cantidadColores) {
        String[] paletaColores = new String[cantidadColores];
        boolean repetido = true;

        for (int i = 0; i < cantidadColores; i++) {
            do {
                int index = (int) (Math.random() * colores.length);
                if (Arrays.asList(paletaColores).contains(colores[index])) {
                    repetido = true;
                } else {
                    repetido = false;
                    paletaColores[i] = colores[index];
                }
            } while (repetido);
        }

        return paletaColores;
    }
}
