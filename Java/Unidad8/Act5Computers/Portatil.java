package Unidad8.Act5Computers;

public class Portatil extends Ordenador {
    private double peso;

    public Portatil(String tipo, double precio, double peso) {
        super(tipo, precio);
        setPeso(peso);
    }

    public void decirEslogan () {
        System.out.println("Ideal para sus viajes");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            this.peso = 1;
        } else {
            this.peso = peso;
        }
    }
    
    @Override
    public String toString() {
        return "Portatil [tipo=" + tipo + ", peso=" + peso + ", precio=" + precio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(peso);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Portatil other = (Portatil) obj;
        if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
            return false;
        return true;
    }

    public void rendimiento () {
        System.out.println("2000 pulsos");
    }
}
