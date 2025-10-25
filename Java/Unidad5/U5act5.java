package Unidad5;

public class U5act5 {

    static int maximo(int[] t) {
        int numeroMaximo=0;

        for (int i=0; i<t.length; i++) {
            numeroMaximo=t[i]>numeroMaximo ? t[i] : numeroMaximo;
        }

        return numeroMaximo;
    }

    public static void main(String[] args) {
        /*Diseñar la función: int máximo(int t[])
        que devuelve el máximo valor contenido en la tabla t. */

        //Ejemplo: implementación del método máximo
        int[] nota={1, 3, 3, 7, 6, 7, 3, 8, 4, 5, 7};

        System.out.println("La nota más alta es: "+maximo(nota));
    }
}
