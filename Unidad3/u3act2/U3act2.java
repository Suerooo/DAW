/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u3act2;

import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class U3act2 {

    /**
     * @param args the command line arguments
     */
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
        int edad = 0, total = 0, media = 0, alumnos = 0, mayores = 0;
        
        //Loop en el que pregunta la edad hasta que sea un numero negativo
        while (edad>=0) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Edad del alumno: "); 
        edad = sc.nextInt();
        
        //Para evitar que la ultima edad (la negativa) cambia los resultados
            if (edad>=0){
                //Numero de alumnos
                ++alumnos;
                //Calcular la suma de las edades
                total = total + edad;
                // Calcular la media de las edades
                media = total/alumnos;
                //Cuantos son mayores de edad 
                if (edad>=18) ++mayores;
            }
        }
        
        System.out.println("Resultados: ");
        System.out.println(" Suma de todas las edades: " + total);
        System.out.println(" Media de todas las edades: " + media);
        System.out.println(" Numero total de alumnos: " + alumnos);
        System.out.println(" Numero total de alumnos mayores de edad: " + mayores);
        
    }
    
}
