package Unidad8.Act7Poligono;

public class Cuadrado extends Poligono {

    public Cuadrado(double base, double altura) {
        super(base, altura);
    }
    
    public double area() {
        return super.getBase() * super.getAltura();
    }
}
