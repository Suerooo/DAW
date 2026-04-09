package Unidad11.Act2MetodoGenerico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <U> List<U> combinar(List<U> tabla1, List<U> tabla2) {
        List<U> resultado = new ArrayList<>();

        resultado.addAll(tabla1);
        resultado.addAll(tabla2);
        return resultado;
    }

    public static void main(String[] args) {
        List<String> tabla1 = new ArrayList<>();
        List<String> tabla2 = new ArrayList<>();
        tabla1.add("Hola");
        tabla2.add("Adios");
        
        System.out.println(combinar(tabla1, tabla2));
    }
}
