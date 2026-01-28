package Examenes.Examen3.Empleado;

import java.util.Arrays;

public class EmpleadoPermanente extends Empleado {
    // comidas - salarioExtra - viajes - viernes - equipamiento
    private boolean[] beneficios = { false, false, false, false, false };
    private Area areaTrabajo;
    private static final String ERROR_BENEFICIO = "El beneficio que ha pasado como parametro es incorrecto(opciones correctas: 'comidas' - 'salarioextra' - 'viajes' - 'viernes' - 'equipamiento')";

    public EmpleadoPermanente(String dni, String nombre, int edad, double salario, Area areaTrabajo) {
        super(dni, nombre, edad, salario);
        this.areaTrabajo = areaTrabajo;
    }

    public EmpleadoPermanente(String dni, String nombre, int edad, Area areaTrabajo) {
        super(dni, nombre, edad);
        this.areaTrabajo = areaTrabajo;
    }

    public void agregarBeneficio(String beneficio) {
        int indiceBeneficio = buscarBeneficio(beneficio);

        if (indiceBeneficio == -1) {
            System.out.println(ERROR_BENEFICIO);
        } else {
            this.beneficios[indiceBeneficio] = true;
        }
    }

    public void quitarBeneficio(String beneficio) {
        int indiceBeneficio = buscarBeneficio(beneficio);

        if (indiceBeneficio == -1) {
            System.out.println(ERROR_BENEFICIO);
        } else {
            this.beneficios[indiceBeneficio] = false;
        }
    }

    private int buscarBeneficio(String beneficio) {
        switch (beneficio.toLowerCase()) {
            case "comida", "comidas":
                return 0;
            case "salarioextra", "salario extra":
                return 1;
            case "viajes", "viaje":
                return 2;
            case "viernes":
                return 3;
            case "equipamiento", "equipamientos":
                return 4;
            default:
                return -1;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Beneficios= " + Arrays.toString(beneficios) + ", Area Trabajo= " + areaTrabajo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        EmpleadoPermanente other = (EmpleadoPermanente) obj;
        return super.equals(obj) && this.areaTrabajo == other.areaTrabajo
                && Arrays.equals(this.beneficios, other.beneficios);
    }

}
