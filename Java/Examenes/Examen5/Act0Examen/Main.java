package Examenes.Examen5.Act0Examen;
import java.util.Arrays;

import Examenes.Examen5.Act0Examen.Contenido.*;

public class Main {
    public static void main(String[] args) {
        /* ------- Crear catalogo --------- */
        Contenido[] catalogo = new Contenido[8];
        catalogo[0] = new Pelicula("DPeli", 9, 120);
        catalogo[1] = new Pelicula("LPeli", 10, 57);
        catalogo[2] = new Pelicula("RPeli", 6, 123);
        catalogo[3] = new Pelicula("GPeli", 4, 60);
        catalogo[4] = new Serie("BSerie", 10, 9);
        catalogo[5] = new Serie("TSerie", 4, 8);
        catalogo[6] = new Serie("CSerie", 5, 13);
        catalogo[7] = new Serie("NSerie", 7, 2);

        /* ------- 1. --------- */
        System.out.println("-------- Sin ordenar ---------");
        System.out.println(Arrays.deepToString(catalogo));

        /* ------- 2 --------- */
        System.out.println("-------- Orden natural ---------");

        Arrays.sort(catalogo);
        System.out.println(Arrays.deepToString(catalogo));

        /* ------- 3 --------- */
        System.out.println("-------- Orden magnitud ---------");

        Arrays.sort(catalogo, (o1, o2) -> {
            if (o1 instanceof Pelicula && o2 instanceof Pelicula) {
                return (((Pelicula) o1).getDuracion() - ((Pelicula) o2).getDuracion()) * -1;

            } else if (o1 instanceof Serie && o2 instanceof Serie) {
                return (((Serie) o1).getTemporadas() - ((Serie) o2).getTemporadas()) * -1;

            } else if (o1 instanceof Serie && o2 instanceof Pelicula) {
                return ((Serie) o1).getTemporadas() - ((Pelicula) o2).getDuracion();

            } else {
                return ((Pelicula) o1).getDuracion() - ((Serie) o2).getTemporadas();
            }
        });

        // Implementacion sin usar lambda ni generic<> (añade 'import
        // java.util.Comparator;' para usarlo)

        // Arrays.sort(catalogo, new Comparator() {
        // @Override
        // public int compare(Object o1, Object o2) {
        // if (o1 instanceof Pelicula && o2 instanceof Pelicula) {
        // return (((Pelicula) o1).getDuracion() - ((Pelicula) o2).getDuracion()) * -1;

        // } else if (o1 instanceof Serie && o2 instanceof Serie) {
        // return (((Serie) o1).getTemporadas() - ((Serie) o2).getTemporadas()) * -1;

        // } else if (o1 instanceof Serie && o2 instanceof Pelicula) {
        // return ((Serie) o1).getTemporadas() - ((Pelicula) o2).getDuracion();

        // } else {
        // return ((Pelicula) o1).getDuracion() - ((Serie) o2).getTemporadas();
        // }
        // }
        // });

        System.out.println(Arrays.deepToString(catalogo));

        /* ------- Tests Visualiable --------- */
        System.out.println("-------- Tests Visualizable ---------");

        catalogo[2].mostrarAviso();

        System.out.println("\nMarcamos como visto la serie: " + catalogo[1].getTitulo());
        catalogo[1].marcarVisto();
        System.out.println(catalogo[1]);

        /* ------- Tests Clasificable --------- */
        System.out.println("-------- Tests Clasificable ---------");

        for (int i = 0; i < catalogo.length; i++) {

            System.out.printf("Calificacion: %.2f | Es top ventas %s%n",
                    catalogo[i].getCalificacion(), catalogo[i].esTopVentas());
        }

        /* ------- Otros tests --------- */
        System.out.println("\n-------- Otros tests ---------");
        Pelicula test = new Pelicula("DPeli", 9, 120);

        System.out.println("\n--- Tests Equals (True) ---");

        System.out.print(catalogo[5] + " y " + test);
        System.out.println("Son iguales: " + catalogo[5].equals(test) + "\n");

        System.out.println("\n--- Tests Equals (False) ---");

        test.setCalificacion(10);
        System.out.print(catalogo[2] + " y " + test);
        System.out.println("Siguen siendo iguales: " + catalogo[2].equals(test));

        System.out.println("\n--- Tests set ---");

        try {
            test.setCalificacion(11);

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
