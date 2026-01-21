package Unidad7.Act12Lista2;

import java.util.Arrays;

public class Listas2 {
    private Integer[] lista;
    private int numeroElementos = 0;

    public Listas2() {
        lista = new Integer[numeroElementos];
    }

    public int getNumeroElementos() {
        return numeroElementos;
    }

    public Integer[] getLista() {
        return lista;
    }

    public void insertarNumeroFinal(Integer numero) {
        insertarNumero(numero, numeroElementos);
    }

    public void insertarNumeroInicio(Integer numero) {
        insertarNumero(numero, 0);
    }

    public void insertarNumero(Integer numero, int indice) {
        if (indice < 0 || indice > numeroElementos) {
            System.out.println("Error no existe ese indice en la lista");
        } else {
            Integer[] tempLista = Arrays.copyOf(lista, lista.length + 1);
            tempLista[indice] = numero;
            for (int i = indice + 1; i < tempLista.length; i++) {
                tempLista[i] = lista[i - 1];
            }
            lista = tempLista;
            numeroElementos++;
            mensajeExisto(numero, indice);
        }
    }

    public void insertarListaAdicional(Listas2 listaAdicional) {
        Integer[] integerListaAdicional = listaAdicional.getLista();
        lista = Arrays.copyOf(lista, (lista.length + integerListaAdicional.length));
        int contador = 0;

        for (int i = 0; i < lista.length; i++) {
            if (i >= (lista.length - integerListaAdicional.length)) {
                lista[i] = integerListaAdicional[contador];
                contador++;
            }
        }
        numeroElementos += listaAdicional.getNumeroElementos();
    }

    public void eliminarElemento(int indiceEliminar) {
        Integer[] tempLista = Arrays.copyOf(lista, lista.length - 1);
        int contador = 0;

        for (int i = 0; i < lista.length; i++) {
            if (i != indiceEliminar) {
                tempLista[contador] = lista[i];
                contador++;
            }
        }

        lista = tempLista;
        numeroElementos -= 1;
    }

    public Integer obtenerElemento(int indice) {
        return lista[indice];
    }

    public int buscarElemento(int elemento) {
        if (Arrays.binarySearch(lista, elemento) < 0) {
            return -1;
        } else {
            return Arrays.binarySearch(lista, elemento);
        }
    }

    @Override
    public String toString() {
        return "Lista:" + Arrays.toString(lista) + "\nNumero de elementos: " + numeroElementos;
    }

    private void mensajeExisto(int numero, int indice) {
        String mensaje = "Numero: " + numero + " insertado con existo";

        if (indice == 0) {
            System.out.println(mensaje + " al inicio");
        } else if (indice == numeroElementos) {
            System.out.println(mensaje + " al final");
        } else {
            System.out.println(mensaje + " en el indice: " + indice);
        }
    }
}
