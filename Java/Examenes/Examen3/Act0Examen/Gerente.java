package Examenes.Examen3.Act0Examen;

public class Gerente extends Empleado {
    // VALORES DEFAULT
    private static final String AREA_DEFAULT = "desconocido";
    private static final double PORC_IMPUESTO = 5; // % de impuesto que se resta al salario gerentes (default: 5%)

    // ATRIBUTOS
    private String area;

    // METODOS
    public Gerente(String nombre, String dni, int edad, double salarioBase, String area) {
        super(nombre, dni, edad, salarioBase);
        setArea(area);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if (area == null || area.trim().isEmpty()) {
            System.out.println("En area " + MENSAJE_ERROR + AREA_DEFAULT);
            this.area = AREA_DEFAULT;
        } else {
            this.area = area;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " \n Sueldo: " + calcularSueldo() + " \n Area: " + this.area;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Gerente other = (Gerente) obj;
        return super.equals(obj) && this.area.equalsIgnoreCase(other.area);
    }

    @Override
    public double calcularSueldo() {
        return getSalarioBase() - (PORC_IMPUESTO / 100);
    }

}
