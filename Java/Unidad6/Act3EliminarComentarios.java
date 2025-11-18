import java.util.Arrays;

public class Act3EliminarComentarios {

    static String eliminarComentarios(String codigo) {
        int[] indiceComentarioApertura= new int[0];
        int[] indiceComentarioCierre= new int[0];

        for (int i=0; i<codigo.length()-1; i++) {
            if (codigo.charAt(i)=='/' && codigo.charAt(i+1)=='*') {
                indiceComentarioApertura=Arrays.copyOf(indiceComentarioApertura, indiceComentarioApertura.length+1);
                indiceComentarioApertura[indiceComentarioApertura.length-1]=i;

            } else if (codigo.charAt(i)=='*' && codigo.charAt(i+1)=='/') {
                indiceComentarioCierre=Arrays.copyOf(indiceComentarioCierre, indiceComentarioCierre.length+1);
                indiceComentarioCierre[indiceComentarioCierre.length-1]=i+1;
            }
        }

        String codigoSinComentarios="";
        int indiceActual=0;
        
        for (int i = 0; i < indiceComentarioApertura.length; i++) {
            codigoSinComentarios+=codigo.substring(indiceActual, indiceComentarioApertura[i]);
            
            indiceActual=indiceComentarioCierre[i]+1;
        }
        codigoSinComentarios+=codigo.substring(indiceActual);
        
        return codigoSinComentarios;
    }
    public static void main(String[] args) {
        String codigo="if (a==3) /* igual a tres */\r\n" + //
                        "\r\n" + //
                        "     a++; /* incrementamos a */";

        System.out.println(eliminarComentarios(codigo));
    }
}
