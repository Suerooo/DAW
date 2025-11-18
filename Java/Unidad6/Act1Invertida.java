public class Act1Invertida {

    static String invertirString(String texto) {
        String textoInvertido="";

        for (int i=texto.length()-1; i>=0; i--) {
            textoInvertido+=texto.charAt(i);
        }

        return textoInvertido;
    }

    public static void main(String[] args) {
        /*Diseñar una función a la que se le pase una cadena de caracteres
        y la devuelva invertida. Un ejemplo, la cadena <hola mundo> quedaría <odnum aloH>. */

        String hola="Hola mundo";
        System.out.println(invertirString(hola));
    }
}
