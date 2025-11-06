import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Act4CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pide dos números y muestra 
        las operaciones: suma, resta, 
        multiplicación y división.
        */
        
        double a, b, suma, resta, multi, divi;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Primer numero: "); 
        a = sc.nextDouble();
        
        System.out.print("Segundo numero: "); 
        b = sc.nextDouble();
        
        suma = a+b;
        resta = a-b;
        multi = a*b;
        divi = a/b;
        
        System.out.println("Resultados: ");
        System.out.println("    Suma: " + suma);
        System.out.println("    Resta: " + resta);
        System.out.println("    Multiplicación: " + multi);
        System.out.println("    Division: " + divi);

        //Cierra la variable sc
        sc.close();
        
    }
    
}
