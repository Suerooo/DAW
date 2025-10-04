/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class U2act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear una aplicación que solicite 
        al usuario una fecha (día, mes y año)
        y muestre la fecha correspondiente al día siguiente.
        Febrero tiene 28 días
        */
        
        int dia, mes, año, díasDelMes = 0;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Dia: "); 
        dia = sc.nextInt();
        
        System.out.print("Mes: "); 
        mes = sc.nextInt();
        
        System.out.print("Año: "); 
        año = sc.nextInt();
        
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) díasDelMes=31;
        if (mes==4 || mes==6 || mes==9 || mes==11) díasDelMes=30;
        if (mes==2) díasDelMes=28;
        
        if (mes>12 || dia > díasDelMes) {
            System.out.println("Fecha invalida");
            System.exit(1);
        }
        
        if (dia<díasDelMes)
            ++dia; 
        else {
            dia = 1;
            ++mes;
        }
        
        if (mes>12) {
            mes = 1;
            ++año;
        }
        
        System.out.println("Mañana sera " + dia + "/" + mes + "/" + año);
        
        //Cierra la variable sc
        sc.close();
    }
    
}