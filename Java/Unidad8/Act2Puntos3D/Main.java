package Unidad8.Act2Puntos3D;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 4);

        System.out.println("Distancia 2D: " + p1.distancia(p2));

        Punto3D p3d1 = new Punto3D(0, 0, 0);
        Punto3D p3d2 = new Punto3D(3, 4, 12);

        System.out.println("Distancia 3D: " + p3d1.distancia(p3d2));
    }
}
