package Unidad11.Act9ConjuntoClientes;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Cliente> conjuntoClientes = new TreeSet<>();
        conjuntoClientes.add(new Cliente("111", "Marta", "20/04/1990"));
        conjuntoClientes.add(new Cliente("115", "Jorge", "12/01/1987"));
        conjuntoClientes.add(new Cliente("112", "Carlos", "21/09/2000"));

        System.out.println(conjuntoClientes);

        Set<Cliente> conjuntoClientesNombre = new TreeSet<>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.nombre.compareTo(o2.nombre);
            }
        });

        conjuntoClientesNombre.addAll(conjuntoClientes);
        System.out.println(conjuntoClientesNombre);

        Set<Cliente> conjuntoClientesEdad = new TreeSet<>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.edad() - o2.edad();
            }
        });

        conjuntoClientesEdad.addAll(conjuntoClientes);
        System.out.println(conjuntoClientesEdad);
    }
}
