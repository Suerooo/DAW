package Examenes.Examen1;

import java.util.Scanner;

public class Act12SalarioNeto {
    public static void main(String[] args) {
        /*Las primeras 35 horas se pagan al precio normal por hora
        Las horas que exceden esas 35 horas se pagan 1,5 veces el precio normal.
        Las tasas impositivas son:
        Los primeros 500 € son libres de impuestos.
        los próximos 400 € tienen un impuesto del 25%
        Y el resto una tasa de impuestos del 45%.
        Los datos de entrada son:
        € precio por hora
        número de horas.
        Datos resultantes:
        Pago bruto
        Salario neto 
        Impuestos*/

        //Variables
        Double precioPorHora = 0.0, numeroDeHoras = 0.0, pagoBruto=0.0, salarioNeto = 0.0, impuestos = 0.0, numeroDeHorasExtras=0.0, pagoPorHorasExtras = 0.0;

        //Pide al usuario el precio por hora
        Scanner sc = new Scanner(System.in);
        System.out.print("Cual es el precio por hora: ");
        precioPorHora = sc.nextDouble();
        //Pide al usuario el numero de horas
        System.out.print("Cuantas horas se han ejercido: ");
        numeroDeHoras = sc.nextDouble();

        //If para aplicar bonus de 1.5 en las horas extras
        if (numeroDeHoras>35) {
            numeroDeHorasExtras=numeroDeHoras-35;
            pagoPorHorasExtras=numeroDeHorasExtras*(precioPorHora*1.5);
            numeroDeHoras=numeroDeHoras-numeroDeHorasExtras;
        }

        //Calcula el pago bruto sin importar los impuestos
        pagoBruto=(precioPorHora*numeroDeHoras)+pagoPorHorasExtras;

        //If para cuando el pago bruto es menos de 500
        if (pagoBruto<=500)
            impuestos=0.0;
        
        //If para saber si hay que añadir impuestos del 25%
        if (pagoBruto>500) 
            impuestos=(pagoBruto-500)*0.25;  
        

        //If para saber si hay que añadir impuestos del 45%
         if (pagoBruto>900) 
            impuestos=(400*0.25)+(pagoBruto-900)*0.45;
        
        //Calcular salario neto
        salarioNeto=pagoBruto-impuestos;
        
        //Imprime los datos resultantes
        System.out.println("Resultados: ");
        System.out.println("    Pago bruto "+pagoBruto);
        System.out.println("    Salario neto: "+salarioNeto);
        System.out.println("    Impuestos: "+impuestos);

        //Cierra la variable sc
            }
}
