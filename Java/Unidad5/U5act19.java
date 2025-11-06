package Unidad5;

import java.util.Scanner;

public class U5act19 {
    static Scanner sc = new Scanner(System.in);

    static double encontrarTempMaxima(double[][] temperatura) {
        double temperaturaMaxima=temperatura[0][0];

        for (int i=0; i<temperatura.length; i++) {
            for (int j=0; j<temperatura[i].length; j++) {
                temperaturaMaxima=temperatura[i][j]>temperaturaMaxima ? temperatura[i][j] : temperaturaMaxima;
            }
        }

        return temperaturaMaxima;
    }

    static double calcularMediaCiudad(double[][] temperatura, int comprobarCiudad) {
        double sumaTemperaturas=0.0;

        for (int i=0; i<temperatura[comprobarCiudad-1].length; i++) {
            sumaTemperaturas+=temperatura[comprobarCiudad-1][i];
        }

        return sumaTemperaturas/temperatura[comprobarCiudad-1].length;
    }

    static boolean huboAlertaHelada(double[][] temperatura) {
        boolean huboAlertaHelada=false;

        for (int i=0; i<temperatura.length; i++) {
            for (int j=0; j<temperatura[i].length; j++) {
                if (temperatura[i][j]<=0) huboAlertaHelada=true;
            }
        }

        return huboAlertaHelada;
    }
    
    public static void main(String[] args) {
        /*Crear una matriz de 3x4 (3 ciudades, 4 días) con temperaturas (números enteros) que tú inventes.
        Crear una función llamada encontrarTempMaxima que reciba la matriz de temperaturas y devuelva la temperatura más alta registrada en cualquier ciudad y cualquier día.
        Crear una función llamada calcularMediaCiudad que reciba la matriz y el número de una ciudad (la fila) y devuelva la temperatura media de esa ciudad durante los 4 días.
        Crear una función llamada huboAlertaHelada que reciba la matriz y devuelva true si alguna temperatura fue de 0 grados o menos, y false si todas fueron positivas.
        En la función main, llama a estas funciones e imprime los resultados. */

        double[][] temperatura = {
            {22, 24, 19, 21},
            {28, 30, 27, 29},
            {15, 17, 16, -1}
        };

        //encontrarTempMaxima
        System.out.println("La temperatura máxima es: "+encontrarTempMaxima(temperatura));

        //calcularMediaCiudad
        System.out.print("De que ciudad quieres calcular la media (1-"+(temperatura.length+1)+"): ");
        System.out.println("La media es: "+calcularMediaCiudad(temperatura, sc.nextInt()));

        //huboAlertaHelada
        if (huboAlertaHelada(temperatura)) System.out.println("Si hubo alerta helada");
        else System.out.println("No hubo alerta helada");
    }
}

