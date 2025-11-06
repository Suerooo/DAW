package Unidad1;

/*
 */


import java.util.Scanner;

/**
 *
 * @author 49399328C
 */
public class Act5PuedoSalir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Diseñar un algoritmo que nos indique si podemos salir a la calle. 
        Existen aspectos que influirán en esta decisión: si está lloviendo y si hemos terminado nuestras tareas. 
        Solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. 
        Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: 
        el hecho de que tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro, etc.). 
        Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. 
        El algoritmo debe mostrar mediante un booleano (true o false) si es posible que se le otorgue permiso para ir a la calle.
        */
        /*
        boolean permiso = false;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Necesitas ir a la biblioteca true or false: ");
        boolean biblio = sc.nextBoolean();
        
        if (biblio==true){
            permiso=true;
            System.out.println("El usuario puede salir: " + permiso);
            System.exit(0);
        }     
        
        System.out.print("Esta lloviendo true or false: ");
        boolean llueve = sc.nextBoolean();
        
        System.out.print("Has finalizado las tareas true or false: ");
        boolean tarea = sc.nextBoolean();
        
        if((llueve==false) & (tarea==true))
            permiso=true;
                    
        if((llueve==true) | (tarea==false))
            permiso=false;
        
        System.out.println("Puedo salir: " + permiso);
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Necesitas ir a la biblioteca true or false: ");
        boolean biblio = sc.nextBoolean();
        
        System.out.print("Esta lloviendo true or false: ");
        boolean llueve = sc.nextBoolean();
        
        System.out.print("Has finalizado las tareas true or false: ");
        boolean tarea = sc.nextBoolean();
        
        boolean salir = (((llueve == false) && (tarea==true)) || (biblio==true));
        System.out.println("Puedo salir: " + salir);

        //Cierra la variable sc
        sc.close();
        
    }
    
}
