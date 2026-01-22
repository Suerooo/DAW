package Unidad8.Act5Computers;

public class Sobremesa extends Ordenador {
    private Tipos tipo;

    public Sobremesa(int codigo, double precio, Tipos tipo) {
        super(codigo, precio);
        setTipo(tipo);
    }

    public void decirEslogan() {
        System.out.println("Es el que mas pesa, pero el que menos cuesta");
    }

    public Tipos getDescipcion() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        if (tipo == null) {
            this.tipo = Tipos.ATX;
        } else {
            this.tipo = tipo;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " tipo=" + tipo;
    }

    @Override
    public boolean equals(Object obj) {
        Sobremesa otro = (Sobremesa) obj;

        if (super.equals(obj) && this.tipo == otro.tipo) {
            return true;
        } else {
            return false;
        }
    }

    public void rendimiento() {
        System.out.println("4000 pulsos");
    }
}
