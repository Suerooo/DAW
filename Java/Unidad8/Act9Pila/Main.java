package Unidad8.Act9Pila;

public class Main {
    public static void main(String[] args) {
        Pila x = new Pila();
        Pila y = new Pila();

        System.out.println(x.equals(y));
        x.insertarFinal(2);
        x.insertarFinal(3);
        x.insertarFinal(4);
        System.out.println(x.equals(y));

        System.out.println(x);
        System.out.println(y);

        y.insertarFinal(99);
        x.insertarFinal(y);
        x.insertarPrincipio(20);

        System.out.println(x);
        System.out.println(y);

        x.insertar(2, 120);
        x.eliminar(2);
        x.eliminar();
        x.insertarFinal(23);
        x.insertarFinal(24);
        x.eliminar();
        x.insertarFinal(25);

        System.out.println(x);
        System.out.println(y);

        System.out.println(Pila.concatena(x, y));
    }
}
