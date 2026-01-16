package Unidad7.Act10Punto;

public class Main {
    public static void main(String[] args) {
        Punto a = new Punto(-3, 1);
        Punto b = new Punto(3, 1);
        a.muestra();
        b.muestra();
        System.out.println(a.distanciaEuclidea(b));
    }
}
