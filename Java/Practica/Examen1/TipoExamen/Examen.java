package Practica.Examen1.TipoExamen;

import java.util.Scanner;

public class Examen {
    
    static Scanner sc = new Scanner(System.in);
    
    static void mostrarMenu() {
        System.out.println("MENÚ");
        System.out.println();
        System.out.println("1. Calculadora de tramos");
        System.out.println("2. Contador de pares");
        System.out.println("3. Validar email");
        System.out.println("4. Mini Calculadora");
        System.out.println();
        System.out.println("0. Salir del programa");
        System.out.println("---------------------");
    }
    
    static void calcularTramos() {
        
        System.out.print("Introduce tu salario bruto anual: ");
        double salarioBruto = sc.nextDouble();
        
        double porcentajeRetencion=0.0, retencion=0.0, salarioNeto=0.0;
        
        if (salarioBruto>0) {
        
            if (salarioBruto<20000) {

                porcentajeRetencion=0.15;
                retencion=salarioBruto*porcentajeRetencion;
                salarioNeto=salarioBruto-retencion;

            } else if (salarioBruto>=20000 && salarioBruto<=35000) {

                porcentajeRetencion=0.20;
                retencion=salarioBruto*porcentajeRetencion;
                salarioNeto=salarioBruto-retencion;

            } else if (salarioBruto>35000) {

                porcentajeRetencion=0.25;
                retencion=salarioBruto*porcentajeRetencion;
                salarioNeto=salarioBruto-retencion;

            } 
        
            System.out.println("Retención ("+(porcentajeRetencion*100)+"%): "+retencion);
            System.out.println("Tu salario neto anual es: "+salarioNeto+"€");
        
        } else System.out.println("Error: tu salario bruto no puede ser menor o igual que 0");
        
    }
    
    static void contadorPares() {
        
        System.out.print("Introduce un número positivo (N): ");
        int maximo = sc.nextInt();
        
        if (maximo>0) {
        
            System.out.println("Contando números pares desde 1 a "+maximo+"...");

            int numerosPares=0;

            for (int i=1; i<=maximo; i++) {
                if (i%2==0) numerosPares++;
            }

            System.out.println("Total de números pares encontrados: "+numerosPares);
            
        } else System.out.println("Error: tienes introducir un número mayor que 0");
        
    }
    
    static boolean validadorEmail(String email) {
        
        boolean esValido=true;

        //Regla 1 (debe contener exactamente un @)
        int contadorArroba=0;
        
        for (int i=0; i<email.length(); i++) {
            if (email.charAt(i)=='@') contadorArroba++; 
        }

        if (contadorArroba!=1) esValido=false;

        //Regla 2 (debe contener al menus un punto después del nombre del domino)
        int posicionArroba=0;
        
        for (int i=0; i<email.length(); i++) {
            if (email.charAt(i)=='@') {
                posicionArroba=i;
            }
        }
        
        int contadorPuntos=0;
        for (int i=posicionArroba; i<email.length(); i++) {
            if (email.charAt(i)=='.') contadorPuntos++;
        }
        
        if (contadorPuntos<1) esValido=false;

        //Regla 3 (No puede ni empezar ni terminar con un @)
        if (email.charAt(0)=='@' || email.charAt(email.length()-1)=='@') esValido=false;

        return esValido;
        
    }
    
    static void miniCalculadora() {
        
        System.out.print("Introduce el primer número: ");
        double a = sc.nextDouble();
        
        System.out.print("Introduce el operador (+, -, *, /): ");
        String operador = sc.next();
        
        System.out.print("Introduce el segundo número: ");
        double b = sc.nextDouble();
        
        double resultado=0.0;
        
        switch (operador) {
            case "+" -> {
                System.out.println("Llamando a la función 'sumar'...");
                resultado=sumar(a, b);
            }
            case "-" -> {
                System.out.println("Llamando a la función 'restar'...");
                resultado=restar(a, b);
            }
            case "*" -> {
                System.out.println("Llamando a la función 'multiplicar'...");
                resultado=multiplicar(a, b);
            }
            case "/" -> {
                System.out.println("Llamando a la función 'dividir'...");
                resultado=dividir(a, b);
            }
            default -> System.out.println("Error: ese operador no existe en esta calculadora");
        }
        
        System.out.println("El resultado es: "+resultado);
    
    }
    
    public static double sumar(double a, double b) {
        return a+b;
    }
    
    public static double restar(double a, double b) {
        return a-b;
    }
    
    public static double multiplicar(double a, double b) {
        return a*b;
    }
    
    public static double dividir(double a, double b) {
        
        double resultado=0.0;
        
        if (b==0) {
            System.out.println("Error: División por cero");
        } else {
            resultado=a/b;
        }
        return resultado;
        
    }

    public static void main(String[] args) {
        
        int opcion;
        
        do {
            mostrarMenu();
            
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> calcularTramos();
                case 2 -> contadorPares();

                case 3 -> {
                    System.out.print("Email: ");
                    String email=sc.next();
                    
                    if (validadorEmail(email)) {
                        System.out.println("El email ES válido");
                    } else System.out.println("El email NO es válido");
                }
                case 4 -> miniCalculadora();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Error: esa opción no esta en el menú");
            }
            
        } while (opcion!=0);
        
        sc.close();
        
    }
    
}
