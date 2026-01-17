package Unidad7.Act12Lista;

public class Main {
    public static void main(String[] args) {
        Listas lista = new Listas();
        Listas lista2 = new Listas();

        lista2.insertarNumeroFinal(1);
        lista2.insertarNumeroFinal(2);

        lista.insertarNumeroFinal(1);
        lista.insertarNumeroFinal(2);
        lista.insertarNumeroFinal(3);
        lista.insertarNumeroFinal(4);
        System.out.println(lista);
        System.out.println(lista.getNumeroElementos());

        lista.insertarNumeroInicio(20);
        System.out.println(lista);
        System.out.println(lista.getNumeroElementos());

        lista.insertarNumero(25, 3);
        lista.insertarNumero(25, 10);
        System.out.println(lista);
        System.out.println(lista.getNumeroElementos());

        lista.insertarListaAdicional(lista2);
        System.out.println(lista);
        System.out.println(lista.getNumeroElementos());

        lista.eliminarElemento(1);
        System.out.println(lista);
        System.out.println(lista.getNumeroElementos());

        System.out.println(lista.obtenerElemento(2));

        System.out.println(lista.buscarElemento(3));
        System.out.println(lista.buscarElemento(10));
    }
}
