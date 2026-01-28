package Examenes.Examen3.Empleado;

public class EmpleadoTemporal extends Empleado {

    private int duracionContrato;
    private Area areaTrabajo;

    public EmpleadoTemporal(String dni, String nombre, int edad, double salario, int duracionContrato,
            Area areaTrabajo) {
        super(dni, nombre, edad, salario);
        this.duracionContrato = duracionContrato;
        this.areaTrabajo = areaTrabajo;
    }

    public EmpleadoTemporal(String dni, String nombre, int edad, int duracionContrato, Area areaTrabajo) {
        super(dni, nombre, edad);
        this.duracionContrato = duracionContrato;
        this.areaTrabajo = areaTrabajo;
    }

    public void finalizarContrat() {
        this.duracionContrato = 0;
        System.out.println("Contrato finalizado");
    }

    @Override
    public String toString() {
        return super.toString() + " Duracion Contrato= " + duracionContrato + ", Area Trabajo=" + areaTrabajo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        EmpleadoTemporal other = (EmpleadoTemporal) obj;
        return super.equals(obj) && this.areaTrabajo == other.areaTrabajo
                && this.duracionContrato == other.duracionContrato;
    }
    
}
