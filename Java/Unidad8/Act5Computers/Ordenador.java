package Unidad8.Act5Computers;

public abstract class Ordenador {
    private int codigo;
    private double precio;

    protected Ordenador(int codigo, double precio) {
        setCodigo(codigo);
        setPrecio(precio);
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            this.codigo = 0;
        } else {
            this.codigo = codigo;
        }
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return "Codigo=" + codigo + ", Precio=" + precio;
    }

    @Override
    public boolean equals(Object obj) {
        Ordenador otro = (Ordenador) obj;

        if (this.codigo == otro.codigo && this.precio == otro.precio) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void rendimiento();
}
