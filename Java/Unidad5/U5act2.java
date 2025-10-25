package Unidad5;

import java.util.Scanner;

public class U5act2 {
    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        /*Crear un programa que verifica si un nombre introducido por el usuario se encuentra en una lista predefinida de invitados. 
        Crea un array de tipo String llamado listaInvitados.
        Inicialízalo directamente en el código con una lista de 5 a 7 nombres. Por ejemplo: "Ana", "Carlos", "Berta", "David", "Elena".
        Pide al usuario que escriba un nombre para comprobar si está en la lista.*/

        //Pregunta el numero de invitados para crear un array del tamaño del numero de invitados
        System.out.print("Cuantos invitados quieres: ");
        int numeroInvitado = sc.nextInt();

        String[] listaInvitados= new String[numeroInvitado];

        //Pregunta y guarda el nombre en mayúsculas de cada invitado para guardarlo en el array
        for (int i=0; i<numeroInvitado; i++) {
            System.out.print("Nombre del "+(i+1)+"º invitado: ");
            listaInvitados[i] = sc.next().toUpperCase();
        }

        //Pregunta y guarda el nombre en mayúscula que quiere consular en el array
        System.out.print("Que nombre quieres consultar: ");
        String consulta = sc.next().toUpperCase();

        //Comprueba si el nombre de consulta es igual a algún nombre del array y en caso de ser así le da a la variable invitado true en caso de que ningún nombre coincida se queda en false
        boolean invitado=false;
        for (int i=0; i<numeroInvitado; i++) {

            if (listaInvitados[i].equals(consulta)) {
                invitado=true;
            }

        }

        //Si la variable invitado es true imprime que si esta invitado y si es false imprime que no esta invitado
        if (invitado) {
            System.out.println(consulta+" si esta invitado");
        } else {
            System.out.println(consulta+" no esta invitado");
        }

    }
}
