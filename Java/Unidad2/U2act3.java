/*
 */


import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class U2act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que calcule el dinero 
        recaudado en un concierto. La aplicación solicitará 
        el aforo máximo del local, el precio por entrada 
        (suponemos que todas las entradas tienen el mismo precio) 
        y el número de entradas vendidas. Hay que tener en cuenta 
        que, si el número de entradas vendidas no supera el 20% del 
        aforo del local, se cancela el concierto. Si el número de 
        entradas vendidas no supera el 50% del aforo del local, se 
        realiza una rebaja del 25% del precio de la entrada.
        */
        
        int aforo, vendidas;
        double precio, recaudado;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Aforo del local: "); 
        aforo = sc.nextInt();
        
        System.out.print("Precio de las entradas: "); 
        precio = sc.nextDouble();
        
        System.out.print("Entradas vendidas: "); 
        vendidas = sc.nextInt();
        
        if (vendidas>aforo*0.2) {
            
            if (vendidas<aforo*0.5) {
                precio=precio-precio*0.25;
                System.out.println("Las entradas vendidas no superan el 50% descuento del 25% aplicado");
            }
            else
                System.out.println("Las entradas vendidas superan el 50%");
        }
        
        else {
            System.out.println("Las entradas vendidas no superan el 20% el concierto queda cancelado se devuelve el dinero");
            precio=0;   
        }
        
        recaudado = vendidas*precio;
        System.out.println("Dinero total recaudado: " + recaudado);
        
        //Cierra la variable sc
        sc.close();
    }
    
}
