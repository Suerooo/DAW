package Examenes.Examen3.Act0Examen;

public class Programador extends Empleado {
    // VALORES DEFAULT
    private static final Lenguajes LENGUAJE_DEFAULT = Lenguajes.PYTHON;
    private static final double PLUS_JAVA = 300; // los programadores que
                                                 // dominan java tienen un plus
                                                 // (default: 300)

    // ATRIBUTOS
    private Lenguajes lenguajeDominante;

    // METODOS
    public Programador(String nombre, String dni, int edad, double salarioBase, Lenguajes lenguajeDominante) {
        super(nombre, dni, edad, salarioBase);
        setLenguajeDominante(lenguajeDominante);
    }

    public Lenguajes getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(Lenguajes lenguajeDominante) {
        if (lenguajeDominante == null) {
            System.out.println("En lenguaje dominante " + MENSAJE_ERROR + LENGUAJE_DEFAULT);
            this.lenguajeDominante = LENGUAJE_DEFAULT;
        } else {
            this.lenguajeDominante = lenguajeDominante;
        }
    }

    @Override
    public double calcularSueldo() {
        if (this.lenguajeDominante == Lenguajes.JAVA) {
            return getSalarioBase() + PLUS_JAVA;
        } else {
            return getSalarioBase();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " \n Sueldo: " + calcularSueldo() + " \n Lenguaje Dominante: " + this.lenguajeDominante;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Programador other = (Programador) obj;
        return super.equals(obj) && this.lenguajeDominante == other.lenguajeDominante;
    }

}
