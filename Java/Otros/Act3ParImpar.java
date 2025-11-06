import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Act3ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pide un número y dile al 
        usuario si es par o impar.
        */
        
        double numero, resto;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Numero: "); 
        numero = sc.nextDouble();
        
        resto = numero%2;
        
        if (resto==0) 
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
        
        //Cierra la variable sc
        sc.close();
    }
    
}
