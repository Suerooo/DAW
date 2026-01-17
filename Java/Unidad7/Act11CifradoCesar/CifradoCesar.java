package Unidad7.Act11CifradoCesar;

import java.util.Arrays;

public class CifradoCesar {

    private CifradoCesar() {
    }

    public static String cifrar(String mensaje, int n) {
        char[] abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        mensaje = mensaje.toLowerCase();
        char[] mensajeArray = mensaje.toCharArray();
        String mensajeCifrado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            int ubicacion = Arrays.binarySearch(abecedario, mensajeArray[i]);

            if (ubicacion == -1) {
                mensajeCifrado += mensajeArray[i];
            } else {
                int nuevaUbicacion = (ubicacion + n + abecedario.length) % abecedario.length;
                mensajeCifrado = mensajeCifrado + abecedario[nuevaUbicacion];
            }
        }
        return mensajeCifrado;
    }
}
