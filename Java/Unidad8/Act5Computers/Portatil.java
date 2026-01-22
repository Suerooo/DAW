package Unidad8.Act5Computers;

public class Portatil extends Ordenador {
    private double peso;

    public Portatil(int codigo, double precio, double peso) {
        super(codigo, precio);
        setPeso(peso);
    }

    public void decirEslogan() {
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
        return super.toString() + " peso=" + peso;
    }

    @Override
    public boolean equals(Object obj) {
        Portatil otro = (Portatil) obj;

        if (super.equals(obj) && this.peso == otro.peso) {
            return true;
        } else {
            return false;
        }
    }

    public void rendimiento() {
        System.out.println("2000 pulsos");
    }
}
