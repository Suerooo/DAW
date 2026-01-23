package Unidad8.Act9Pila;

import java.util.Arrays;

public class Pila extends Lista {

    public Pila() {
        super();
    }

    @Override
    public Integer eliminar(int indice) {
        mensajeError();
        System.out.println("    (no se puede insertar en una posicion concreta [devuelve -1])");
        return -1;
    }

    @Override
    public void insertar(int posicion, Integer nuevo) {
        mensajeError();
        System.out.println("    (no se puede insertar en una posicion concreta)");
    }

    @Override
    public void insertarFinal(Lista otraLista) {
        mensajeError();
        System.out.println("    (no se puede insertar listas en pilas)");
    }

    @Override
    public void insertarPrincipio(Integer nuevo) {
        mensajeError();
        System.out.println("    (no se puede insertar al principio con pilas)");
    }

    public void eliminar() {
        super.tabla = Arrays.copyOf(super.tabla, super.tabla.length - 1);
    }

    private static void mensajeError() {
        System.out.println("No se puede usar este metodo con pilas");
    }
}
