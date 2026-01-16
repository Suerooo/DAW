package Unidad8.Act7Poligono;

public abstract class Poligono {
    private double base;
    private double altura;
    
    protected Poligono(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            this.base = 1;
        } else {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            this.altura = 1;
        } else {
            this.altura = altura;
        }
    }
    
    public abstract double area();
}
