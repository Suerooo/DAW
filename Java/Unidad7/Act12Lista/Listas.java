package Unidad7.Act12Lista;

import java.util.Arrays;

public class Listas {
    private Integer[] lista;
    private int numeroElementos = 0;

    public Listas() {
        lista = new Integer[numeroElementos];
    }

    public int getNumeroElementos() {
        return numeroElementos;
    }

    public Integer[] getLista() {
        return lista;
    }

    public void insertarNumeroFinal(Integer numero) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = numero;
        numeroElementos++;
    }

    public void insertarNumeroInicio(Integer numero) {
        Integer[] listaTemp = Arrays.copyOf(lista, lista.length);
        lista = Arrays.copyOf(lista, lista.length + 1);
        for (int i = 0; i < lista.length; i++) {
            if (i != 0) {
                lista[i] = listaTemp[i - 1];
            }
        }
        lista[0] = numero;
        numeroElementos++;
    }

    public void insertarNumero(Integer numero, int indice) {
        if (indice >= lista.length) {
            System.out.println("Error no existe ese indice en la lista");
        } else {
            lista[indice] = numero;
        }
    }

    public void insertarListaAdicional(Listas listaAdicional) {
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
        return "Listas [lista=" + Arrays.toString(lista) + "]";
    }
}
