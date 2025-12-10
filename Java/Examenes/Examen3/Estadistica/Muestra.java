package Examenes.Examen3.Estadistica;

import java.util.Arrays;

public class Muestra {
    private int[] array;
    private int cantidadValores;
    private static final int DEFAULT_SIZE = 10;
    
    public Muestra() {
        array = new int[DEFAULT_SIZE];
    }

    public Muestra(int tamanio) {
        array = new int[tamanio];
    }

    public Muestra(int[] array) {
        this.array = array;
    }

    public void agregarMuestra(int...numero) {
        for (int num : numero) {
            array = Arrays.copyOf(array, array.length +1 );
            array[array.length - 1] = num;
        }
    }
}
