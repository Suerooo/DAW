package Unidad8.Act2Puntos3D;

public class Punto3D extends Punto {
    private double z;

    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    
    public double distancia(Punto3D punto2) {
        double dx = punto2.getX() - super.getX();
        double dy = punto2.getY() - super.getY();
        double dz = punto2.z - this.z;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }
}
