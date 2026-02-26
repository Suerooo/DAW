package Examenes.Examen4.Act1Interface;

import java.util.Arrays;
import java.util.Comparator;

import Examenes.Examen4.Act1Interface.Triatleta.Estado;
import Examenes.Examen4.Act1Interface.Triatleta.Triatleta;
import Examenes.Examen4.Act1Interface.Vehiculo.Coche;

public class Main {
    public static void espaciado() {
        System.out.println("\n\n\n");
    }

    public static void main(String[] args) {
        // ----------------------------------
        // ----------- VEHICULO -------------
        // ----------------------------------
        espaciado();

        Coche coche1 = new Coche("1");
        Coche coche2 = new Coche("2", 60.0);

        coche1.acelerar(20.5);
        System.out.println(coche1);

        coche2.frenar();
        System.out.println(coche2);

        // ----------------------------------
        // ----------- TRIATLETA ------------
        // ----------------------------------
        espaciado();

        Triatleta tri1 = new Triatleta("Pepe", 19, Estado.CORRIENDO);

        tri1.nadar();
        System.out.println(tri1);

        tri1.correr();
        System.out.println(tri1);

        // ----------------------------------
        // ----------- PERSONA --------------
        // ----------------------------------
        espaciado();

        Persona[] listaPersonas = new Persona[5];
        listaPersonas[0] = tri1;
        listaPersonas[1] = new Triatleta("Juan", 43, Estado.NADANDO);
        listaPersonas[2] = new Triatleta("Antonio", 23, Estado.CORRIENDO);
        listaPersonas[3] = new Triatleta("Jose", 53, Estado.NADANDO);
        listaPersonas[4] = new Triatleta("Ajose", 53, Estado.CORRIENDO);

        System.out.println("--- Orden natural ---");
        Arrays.sort(listaPersonas);
        System.out.println(Arrays.deepToString(listaPersonas));

        System.out.println("--- Orden Nombre ---");
        // Arrays.sort(listaPersonas, new Comparator<Persona>() {
        // public int compare(Persona o1, Persona o2) {
        // return o1.getNombre().compareTo(o2.getNombre());
        // }
        // });
        Comparator<Persona> compareNombre = (o1, o2) -> o1.getNombre().compareTo(o2.getNombre());
        Arrays.sort(listaPersonas, compareNombre);
        System.out.println(Arrays.deepToString(listaPersonas));

        System.out.println("--- Orden Edad/Nombre ---");
        // Arrays.sort(listaPersonas, new Comparator<Persona>() {
        // public int compare(Persona o1, Persona o2) {
        // int compare = o1.compareTo(o2);

        // if (compare == 0) {
        // return o1.getNombre().compareTo(o2.getNombre());
        // } else {
        // return compare;
        // }
        // }
        // });
        Arrays.sort(listaPersonas, (o1, o2) -> {
            int compare = o1.compareTo(o2);

            if (compare == 0) {
                return o1.getNombre().compareTo(o2.getNombre());
            } else {
                return compare;
            }
        });
        System.out.println(Arrays.deepToString(listaPersonas));
    }
}
