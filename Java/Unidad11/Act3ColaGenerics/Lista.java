package Unidad11.Act3ColaGenerics;

import java.util.Arrays;

public class Lista<T> implements Pila<T>, Cola<T> {
    T[] tabla;

    public Lista(T[] tabla) {
        this.tabla = tabla;
    }

    void insertarPrincipio(T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    void insertarFinal(Lista<T> otraLista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    void insertar(int posicion, T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1,
                tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    T eliminar(int indice) {
        T eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    T get(int indice) {
        T resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }
        return resultado;
    }

    int buscar(T claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }

    public int numeroElementos() {
        return tabla.length;
    }

    public T[] getTabla() {
        return Arrays.copyOf(tabla, tabla.length);
    }

    public static <T> Lista<T> concatena(Lista<T> x, Lista<T> y) {
        Lista<T> nuevaLista = new Lista<>(null);

        nuevaLista.insertarFinal(x);
        nuevaLista.insertarFinal(y);

        return nuevaLista;
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }

    @Override
    public boolean equals(Object obj) {
        Lista<T> lista = (Lista<T>) obj;
        T[] tabla2 = lista.getTabla();

        if (tabla.length != tabla2.length) {
            return false;
        }

        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] != tabla2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void apilar(T numero) {
        insertarFinal(numero);
    }

    @Override
    public T desapilar() {
        return eliminar(tabla.length - 1);
    }

    @Override
    public T desencolar() {
        return eliminar(0);
    }

    @Override
    public void encolar(T numero) {
        insertarFinal(numero);
    }

}
