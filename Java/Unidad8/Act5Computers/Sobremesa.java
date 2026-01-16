package Unidad8.Act5Computers;

public class Sobremesa extends Ordenador {
    private String descripcion;
    
    public Sobremesa(String tipo, double precio, String descripcion) {
        super(tipo, precio);
        setDescripcion(descripcion);
    }

    public void decirEslogan () {
        System.out.println("Es el que mas pesa, pero el que menos cuesta");
    }

    public String getDescipcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || (!descripcion.equalsIgnoreCase("ATX") && !descripcion.equalsIgnoreCase("MICROATX") && !descripcion.equalsIgnoreCase("ITX"))) {
            this.descripcion = "ATX";
        } else {
            this.descripcion = descripcion;
        }
    }
    
    @Override
    public String toString() {
        return "Sobremesa [tipo=" + tipo + ", descripcion=" + descripcion + ", precio=" + precio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
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
        Sobremesa other = (Sobremesa) obj;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        return true;
    }
    
    public void rendimiento () {
        System.out.println("4000 pulsos");
    }
}
