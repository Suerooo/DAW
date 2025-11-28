package Examenes.Examen2;

public class Act1ComprimirCadena {

    static String comprimirCadena(String cadenaAComprimir) {
        String cadenaComprimida="";
        int contadorLetrasRepetidas=0;
        char letra=cadenaAComprimir.charAt(0);

        for (int i=0; i<cadenaAComprimir.length(); i++) {
            if (letra=='a') { //AQI
                contadorLetrasRepetidas++;
            }
        }
        System.out.println(contadorLetrasRepetidas);

        if (cadenaComprimida.length()<cadenaAComprimir.length()) {
            return cadenaComprimida;
        } else {
            return cadenaAComprimir;
        }
    }

    public static void main(String[] args) {
        /*Dada una cadena, genera otra donde cada grupo de caracteres repetidos se reemplace por 
        el carácter seguido del número de repeticiones. 
        ●  Ejemplo: "aaabccccdd" → "a3b1c4d2" 
        ●  Si la cadena comprimida no es más corta que la original, devuelve la original. */

        String cadena1="aaabccccdd";

        System.out.println(comprimirCadena(cadena1));
    }
}
