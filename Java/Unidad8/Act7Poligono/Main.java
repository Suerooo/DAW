package Unidad8.Act7Poligono;

public class Main {
    public static void main(String[] args) {
        Cuadrado aux1 = new Cuadrado(10, 10);
        Triangulo aux2 = new Triangulo(10, 10);
        
        System.out.println("Area cuadrado: " + aux1.area());
        System.out.println("Area triangulo: " + aux2.area());
    }
}
