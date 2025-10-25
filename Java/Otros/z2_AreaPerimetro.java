import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Z2_AreaPerimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Calcula el área y perímetro de un 
        rectángulo pidiendo base y altura al usuario.
        */
        
        double area, perimetro, base, altura;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Cuantos metros mide la base del rectángulo: "); 
        base = sc.nextDouble();
        
        System.out.print("Cuantos metros mide la altura del rectángulo: "); 
        altura = sc.nextDouble();
        
        area = base*altura;
        perimetro = (2*base) + (2*altura);
        
        System.out.println("Medidas rectángulo: ");
        System.out.println("    Area: " + area + " metros.");
        System.out.println("    Perímetro " + perimetro + " metros");

        //Cierra la variable sc
        sc.close();
        
    }
    
}
