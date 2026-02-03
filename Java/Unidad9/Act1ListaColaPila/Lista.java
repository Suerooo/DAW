package Unidad9.Act1ListaColaPila;

import java.util.Arrays;

public class Lista implements Pila, Cola {
    Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];
    }

    void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1,
                tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    Integer eliminar(int indice) {
        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    Integer get(int indice) {
        Integer resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }
        return resultado;
    }

    int buscar(Integer claveBusqueda) {
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

    public Integer[] getTabla() {
        return Arrays.copyOf(tabla, tabla.length);
    }

    public static Lista concatena(Lista x, Lista y) {
        Lista nuevaLista = new Lista();

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
        Lista lista = (Lista) obj;
        Integer[] tabla2 = lista.getTabla();

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
    public void apilar(Integer numero) {
        insertarFinal(numero);
    }

    @Override
    public Integer desapilar() {
        return eliminar(tabla.length - 1);
    }

    @Override
    public Integer desencolar() {
        return eliminar(0);
    }

    @Override
    public void encolar(Integer numero) {
        insertarFinal(numero);
    }

}
