package Unidad9.Act11ListaObject;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Lista aux = new Lista();
        aux.insertarFinal(new Futbolista(1, "Juan", 12, 2));
        aux.insertarFinal(new Futbolista(2, "Pedro", 32, 5));
        aux.insertarFinal(new Futbolista(3, "Jose", 23, 6));

        System.out.println(aux);
    }
}
