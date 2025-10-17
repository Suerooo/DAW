package Unidad5;

import java.util.Scanner;

public class u5act1 {
    public static void main(String[] args) {
        /*Crear un programa en Java que permita almacenar las notas de un grupo 
        de alumnos, calcular la media, y encontrar la nota más alta y la más baja. */

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos alumnos hay en la clase: ");
        int numeroAlumnos = sc.nextInt();

        double notas[] = new double[numeroAlumnos];

        for (int i=0; i<numeroAlumnos; i++){
            System.out.print("Nota del "+(i+1)+"º alumno: ");
            notas[i] = sc.nextDouble();
        }

        double sumaNotas=0;
        for (int i=0; i<numeroAlumnos; i++) {
            sumaNotas=sumaNotas+notas[i];
        }
        double media=sumaNotas/numeroAlumnos;
        System.out.println("La media es: " +media);

        double notaBaja=10, notaAlta=0;
        for (int i=0; i<numeroAlumnos; i++) {
            notaBaja=notas[i]<notaBaja ? notas[i] : notaBaja;
            notaAlta=notas[i]>notaAlta ? notas[i] : notaAlta;
        }
        System.out.println("La nota mas baja es: "+notaBaja);
        System.out.println("La nota mas baja es: "+notaAlta);
    }
}
