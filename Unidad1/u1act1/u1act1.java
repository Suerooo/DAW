package u1act1;

import java.util.Scanner;

public class u1act1 {

    public static void main(String[] args) {
        System.out.println("SEX");
        Scanner sc = new Scanner(System.in);
        System.out.print("Cual es tu edad: ");
        int edad = sc.nextInt();
        System.out.println("La edad del usuario es: " + edad);

        System.out.print("Como te llamas: ");
        String nombre = sc.next();
        System.out.println("El usuario se llama: " + nombre);

        System.out.print("Cual es tu apellido: ");
        String apellido = sc.next();
        System.out.println("El apellido del usuario es: " + apellido);
        
        System.out.println("Entonces el usuario tiene " + edad + " años y se llama " + nombre + " " + apellido);

    }
    
}
