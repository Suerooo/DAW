package Unidad6;

import java.util.Arrays;

public class Act1Invertida {

    static String invertirString(String texto) {
        char[] arrayTextoInvertido=new char[0];

        for (int i=texto.length()-1; i>=0; i--) {
            arrayTextoInvertido=Arrays.copyOf(arrayTextoInvertido, arrayTextoInvertido.length+1);
            arrayTextoInvertido[arrayTextoInvertido.length-1]=texto.charAt(i);
        }

        return new String(arrayTextoInvertido);
    }

    public static void main(String[] args) {
        /*Diseñar una función a la que se le pase una cadena de caracteres
        y la devuelva invertida. Un ejemplo, la cadena <hola mundo> quedaría <odnum aloH>. */

        String hola="Hola mundo";
        System.out.println(invertirString(hola));
    }
}
