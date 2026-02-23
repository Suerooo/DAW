package Unidad9.Act9IntanceOf;

public abstract class Vehiculo implements Comparable {
    protected String matricula;
    protected String modelo;

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + " | Modelo: " + modelo;
    }

    // ORDEN NATURAL: Por matrícula (usando el compareTo de String)
    @Override
    public int compareTo(Object o) {
        // Tema 8/9: Casting obligatorio al no usar genéricos
        Vehiculo otro = (Vehiculo) o;
        return this.matricula.compareTo(otro.getMatricula());
    }
}