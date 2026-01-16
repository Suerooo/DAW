package Unidad8.Act5Computers;

public abstract class Ordenador {
    private String tipo;
    private double precio;
    
    protected Ordenador(String tipo, double precio) {
        setTipo(tipo);
        setPrecio(precio);
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            this.tipo = "desconocido";
        } else {
            this.tipo = tipo;
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
        return "Ordenador [tipo=" + tipo + ", precio=" + precio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ordenador other = (Ordenador) obj;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        return true;
    }

    public abstract void rendimiento ();
}
