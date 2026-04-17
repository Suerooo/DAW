package Unidad11.Act16GestionJornadas;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Jornada implements Comparable<Jornada>, Serializable {

    final String dniEmpleado;
    LocalDate fechaJornada;
    LocalTime horaEntrada;
    LocalTime horaSalida;

    public Jornada(String dniEmpleado, LocalDate fechaJornada) {
        this.dniEmpleado = dniEmpleado;
        this.fechaJornada = fechaJornada;
    }

    public Jornada(String dniEmpleado, LocalDate fechaJornada,
            LocalTime horaEntrada) {
        this.dniEmpleado = dniEmpleado;
        this.fechaJornada = fechaJornada;
        this.horaEntrada = horaEntrada;
    }

    
    
    public Jornada(String dniEmpleado, LocalDate fechaJornada,
            LocalTime horaEntrada, LocalTime horaSalida) {
        this.dniEmpleado = dniEmpleado;
        this.fechaJornada = fechaJornada;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    int tiempoTrabajado() {
        return (int) horaEntrada.until(horaSalida, ChronoUnit.MINUTES);
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dniEmpleado == null) ? 0 : dniEmpleado.hashCode());
        result = prime * result + ((fechaJornada == null) ? 0 : fechaJornada.hashCode());
        result = prime * result + ((horaEntrada == null) ? 0 : horaEntrada.hashCode());
        result = prime * result + ((horaSalida == null) ? 0 : horaSalida.hashCode());
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
        Jornada other = (Jornada) obj;
        if (dniEmpleado == null) {
            if (other.dniEmpleado != null)
                return false;
        } else if (!dniEmpleado.equals(other.dniEmpleado))
            return false;
        if (fechaJornada == null) {
            if (other.fechaJornada != null)
                return false;
        } else if (!fechaJornada.equals(other.fechaJornada))
            return false;
        if (horaEntrada == null) {
            if (other.horaEntrada != null)
                return false;
        } else if (!horaEntrada.equals(other.horaEntrada))
            return false;
        if (horaSalida == null) {
            if (other.horaSalida != null)
                return false;
        } else if (!horaSalida.equals(other.horaSalida))
            return false;
        return true;
    }


    public int compareTo(Jornada ob) {
        int res = dniEmpleado.compareTo(ob.dniEmpleado);
        if (res == 0) {
            res = fechaJornada.compareTo(ob.fechaJornada);
        }
        return res;
    }

    public String toString() {
        return "\nDNI: " + dniEmpleado + ", fecha: " + fechaJornada
                + "--> minutos trabajados: " + tiempoTrabajado();
    }
}
