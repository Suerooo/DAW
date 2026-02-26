package Examenes.Examen4.Act1Interface.Triatleta;

import Examenes.Examen4.Act1Interface.Persona;

public class Triatleta extends Persona implements Corredor, Nadador {
    private Estado estado;

    public Triatleta(String nombre, int edad, Estado estado) {
        super(nombre, edad);
        setEstado(estado);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("El campo 'estado' no puede ser nulo");
        }
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
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
        Triatleta other = (Triatleta) obj;
        if (estado != other.estado)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s Estado: %s%n", super.toString(), estado);
    }

    @Override
    public void correr() {
        System.out.println("El triatleta esta corriendo");
        setEstado(Estado.CORRIENDO);
    }

    @Override
    public void nadar() {
        System.out.println("El triatleta esta nadando");
        setEstado(Estado.NADANDO);
    }

}
