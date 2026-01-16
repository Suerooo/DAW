package Unidad8.Act2Puntos3D;

public class Punto {
    private double y;
    private double x;
    
    public Punto() {
        this.x = 0;
        this.y = 0;
    }
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double distancia(Punto punto2) {
        double dx = punto2.x - this.x;
        double dy = punto2.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
