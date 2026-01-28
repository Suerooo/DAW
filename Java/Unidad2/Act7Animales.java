package Unidad2;

import java.util.Scanner;
public class Act7Animales {

    public static void main(String[] args) {
        /*
        En una granja se compra diariamente una cantidad (comidaDiaria) 
        de comida para los animales. El número de animales que alimentar 
        (todos de la misma especie) es numAnimales, y sabemos que cada 
        animal come una media de kilosPorAnimal.
        Diseña un programa que solicite al usuario los 
        valores anteriores y determine si disponemos de alimento
        suficiente para cada animal. En caso negativo, ha de calcular 
        cuál es la ración que corresponde a cada uno de los animales.
        Nota: Evitar que la aplicación realice divisiones por cero.
        */
        
        int numAnimales;
        double kilosPorAnimal,comidaDiaria, reKilosPorAnimal;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Comida comprada: "); 
        comidaDiaria = sc.nextDouble();
        
        System.out.print("Kilos que come cada animal: "); 
        kilosPorAnimal = sc.nextDouble();
        
        System.out.print("Numeros de animales: "); 
        numAnimales = sc.nextInt();
        
        if (kilosPorAnimal<=0 || numAnimales<=0) {
            System.out.println("Error los kilos por animal/números de animales es <= 0");
            System.exit(1);
        }
        
        if ( (comidaDiaria/kilosPorAnimal) == numAnimales ) {
            System.out.println("Se cumple la recomendación de kilos por animal \n Dale a cada animal " + kilosPorAnimal + " kilos");
        }

        if ( (comidaDiaria/kilosPorAnimal) > numAnimales ) {
            System.out.println("Se cumple la recomendación de kilos por animal \n Dale a cada animal " + kilosPorAnimal + " kilos y sobra "+(comidaDiaria-(kilosPorAnimal*numAnimales)));
        }

        else {
            System.out.println("No se cumple la recomendación de kilos por animal");
            reKilosPorAnimal = comidaDiaria/(double)numAnimales;
            System.out.println("Tendríamos que darle " + reKilosPorAnimal + " kilos a cada animal");
        }

        //Cierra la variable sc
            }
}
