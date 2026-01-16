package Unidad8.Act4Electrodomestico;

public class Lavadora extends Electrodomestico {
    
    private double precio;
    private boolean aguaCaliente;
    
    public Lavadora(String marca, double potencia) {
        super("lavadora", marca, potencia);
        this.aguaCaliente = false;
        this.precio = 0;
    }

    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
        super("lavadora", marca, potencia);
        setPrecio(precio);
        setAguaCaliente(aguaCaliente);
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Lavadora [precio=" + precio + ", aguaCaliente=" + aguaCaliente + "]";
    }

    @Override
    public double getConsumo(int horas) {
        if (this.aguaCaliente) {
            return horas * (super.getPotencia() + super.getPotencia() * 0.20);
        } else {
            return horas * super.getPotencia();
        }
    }
}
