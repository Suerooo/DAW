package Unidad7.Act12Lista2;

public class Main2 {
    public static void main(String[] args) {
        Listas2 lista = new Listas2();
        Listas2 lista2 = new Listas2();

        lista2.insertarNumeroFinal(1);
        lista2.insertarNumeroFinal(2);

        lista.insertarNumeroFinal(1);
        lista.insertarNumeroFinal(2);
        lista.insertarNumeroFinal(3);
        lista.insertarNumeroFinal(4);
        System.out.println(lista);

        lista.insertarNumeroInicio(20);
        System.out.println(lista);

        lista.insertarNumero(25, 3);
        lista.insertarNumero(25, 10);
        System.out.println(lista);

        lista.insertarListaAdicional(lista2);
        System.out.println(lista);

        lista.eliminarElemento(1);
        System.out.println(lista);

        System.out.println(lista.obtenerElemento(2));

        System.out.println(lista.buscarElemento(3));
        System.out.println(lista.buscarElemento(10));
    }
}
