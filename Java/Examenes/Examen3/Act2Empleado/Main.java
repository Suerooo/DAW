package Examenes.Examen3.Act2Empleado;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmpleadoTemporal[] array = new EmpleadoTemporal[10];
        for (int i = 0; i < 4; i++) {
            array[i] = new EmpleadoTemporal(null, null, i, i, null);
        }

        System.out.println(Arrays.toString(array));
    }
}
