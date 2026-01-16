package Unidad8.Act7Poligono;

public class Triangulo extends Poligono {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    
    public double area() {
        return (super.getBase() * super.getAltura()) / 2;
    }
}
