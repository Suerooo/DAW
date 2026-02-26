package Examenes.Examen4.Act1Interface.Vehiculo;

public class Coche implements Vehiculo {

    private final String matricula;
    private Double velocidadActual;

    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidadActual = 0.0;
    }

    public Coche(String matricula, Double velocidadActual) {
        this.matricula = matricula;
        this.velocidadActual = velocidadActual;
    }

    @Override
    public void acelerar(Double velocidad) {
        this.velocidadActual = velocidad;
    }

    @Override
    public void frenar() {
        this.detener();
        this.velocidadActual = 0.0;
    }

    @Override
    public Double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(Double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coche other = (Coche) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Matricula: %s | Velocidad: %.2f", matricula, velocidadActual);
    }

}
