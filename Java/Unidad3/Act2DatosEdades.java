package Unidad3;

import java.util.Scanner;

public class Act2DatosEdades {

    public static void main(String[] args) {
        /*
        Implementar una aplicación para calcular datos
        estadísticos de las edades de los alumnos de un
        centro educativo. Se introducirán datos hasta que
        uno de ellos sea negativo, y se mostrará: la suma
        de todas las edades introducidas, la media, el número 
        de alumnos y cuántos son mayores de edad.
        */
        
        //Variables
        int edad = 0, total = 0, alumnos = 0, mayores = 0;
        double media = 0;
        
        //Loop en el que pregunta la edad hasta que sea un numero negativo
        while (edad>=0) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Edad del alumno(introduce numero negativo para terminar): "); 
        edad = sc.nextInt();
        
        //Para evitar que la ultima edad (la negativa) cambia los resultados
        if (edad>=0){
            //Numero de alumnos
            ++alumnos;
            //Calcular la suma de las edades
            total += edad;
            // Calcular la media de las edades
            media = (double)total/alumnos;
            //Cuantos son mayores de edad 
            if (edad>=18) ++mayores;
            }
            
        //Cierra la variable sc
         sc.close();
        }
        
        System.out.println("Resultados: ");
        System.out.println(" Suma de todas las edades: " + total);
        System.out.println(" Media de todas las edades: " + media);
        System.out.println(" Numero total de alumnos: " + alumnos);
        System.out.println(" Numero total de alumnos mayores de edad: " + mayores);
        
        
    }
    
}
