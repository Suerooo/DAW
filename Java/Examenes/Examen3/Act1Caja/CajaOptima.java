package Examenes.Examen3.Act1Caja;

public class CajaOptima extends Caja {

    private static final double PORCENTAJE_VOLUMEN = 0.80;
    private static double superficeTotal;

    public CajaOptima(double ancho, double alto, double fondo, Unidad unidadMedia, String etiqueta) {
        super(ancho, alto, fondo, unidadMedia, etiqueta);
        registrarCarton(getArea());
    }

    private static void registrarCarton(double area) {
        CajaOptima.superficeTotal += area;
    }

    public double getArea() {
        return 2 * ((getAncho() * getAlto()) + (getAncho() * getFondo()) + (getAlto() * getFondo()));
    }

    public static double cartonTotal() {
        return superficeTotal;
    }

    @Override
    public double getVolumen() {
        return super.getVolumen() * PORCENTAJE_VOLUMEN;
    }

    @Override
    public String toString() {
        return super.toString() + ", area=" + getArea();
    }
}
