package Unidad3;

import java.util.Scanner;

public class Act8MenuOperadores {
    static Scanner sc = new Scanner(System.in); 
    
    public static void main(String[] args) {
        /*Realiza un menú con las siguientes opciones:
        ----------------------------------------------------
        1. Calcula la suma de dos números
        2. Muestra la tabla de multiplicar de un número
        3. Calcula el área de un triángulo
        4. Calcula del descuento X sobre un Precio Y
        0. Salir
        -------------------------------------------------------
        El menú debe repetirse hasta que el usuario decida salir. */

        //Variables
        int opcion;

        //Bucle para el menu
        do {
            //Pregunta al usuario que opción quiere usar
            System.out.print("Que opción quieres usar: ");
            opcion = sc.nextInt();

            //Switch que funciona como menu
            switch (opcion) {
                //Suma dos números
                case 1:
                    //Pide el primer numero
                    System.out.print("Introduce un número: ");
                    int suma1 = sc.nextInt();
                    //Pide el segundo numero
                    System.out.print("Introduce un número: ");
                    int suma2 = sc.nextInt();
                    //Los imprime y suma
                    System.out.println("La suma es: "+suma1+"+"+suma2+"="+(suma1+suma2));
                    break;
                //Muestra la tabla de multiplicar del numero
                case 2:
                    //Pide el numero del que quiere la tabla de multiplicar
                    System.out.print("Quiere la tabla de multiplicar del numero: ");
                    int tabla = sc.nextInt();
                    //For para calcular la tabla de multiplicar
                    for (int veces=0; veces<=10; veces++) System.out.println(tabla+"*"+veces+"="+(tabla*veces));
                    break;
                //Calcula el area de un triangulo
                case 3:
                    //Pide la base y la altura del triangulo
                    System.out.print("Base del triangulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Altura del triangulo: ");
                    double altura = sc.nextDouble();
                    //Imprime el area del triangulo
                    System.out.println("El area del triangulo es: "+((base*altura)/2));
                    break;
                //Calcula del descuento X sobre un Precio Y
                case 4:
                    //Pide el descuento y el precio
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Descuento: ");
                    double descuento = sc.nextDouble();
                    //Imprime el descuento
                    System.out.println("Descuento: "+((precio*descuento)/100));
                    break;
                //En caso de que el usuario escriba un numero que no esta entre el 0 y el 4
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        //Cuando el usuario escriba 0 termina el bucle
        } while (opcion!=0);
        System.out.println("Cerrando programa");
    }
}
