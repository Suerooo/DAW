package Unidad9.Act8Llamada;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Llamada implements Comparable<Llamada> {
    private int telefonoCliente;
    private int telefonoInterlocutor;
    private boolean saliente;
    private LocalDateTime inicioLlamada;
    private LocalDateTime finalLlamada;
    private Zona zona;

    public Llamada(int telefonoCliente, int telefonoInterlocutor, boolean saliente, Zona zona) {
        setTelefonoCliente(telefonoCliente);
        setTelefonoInterlocutor(telefonoInterlocutor);
        setSaliente(saliente);
        this.inicioLlamada = LocalDateTime.now();
        setZona(zona);
    }

    public final int getTarifa() {
        return switch (this.zona) {
            case Zona.ZON1 -> 1;
            case Zona.ZON2 -> 2;
            case Zona.ZON3 -> 3;
            case Zona.ZON4 -> 4;
            case Zona.ZON5 -> 5;
        };
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public int getTelefonoInterlocutor() {
        return telefonoInterlocutor;
    }

    public void setTelefonoInterlocutor(int telefonoInterlocutor) {
        this.telefonoInterlocutor = telefonoInterlocutor;
    }

    public boolean isSaliente() {
        return saliente;
    }

    public void setSaliente(boolean saliente) {
        this.saliente = saliente;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public LocalDateTime getInicioLlamada() {
        return inicioLlamada;
    }

    public long getDuracionMin() {
        return ChronoUnit.MINUTES.between(inicioLlamada, finalLlamada);
    }

    public int getCoste() {
        if (!saliente) {
            return 0;
        }

        return (int) getDuracionMin() * getTarifa();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + telefonoCliente;
        result = prime * result + telefonoInterlocutor;
        result = prime * result + (saliente ? 1231 : 1237);
        result = prime * result + ((inicioLlamada == null) ? 0 : inicioLlamada.hashCode());
        result = prime * result + ((zona == null) ? 0 : zona.hashCode());
        return result;
    }

    @Override
    public String toString() {
        String toString = String.format(
                "Telefono cliente: %d%n Telefono interlocutor: %d%n Fecha y hora: %s%n Duracion: %d%n",
                telefonoCliente, telefonoInterlocutor, inicioLlamada, getDuracionMin());

        if (getCoste() == 0) {
            return toString;
        }

        return toString + String.format(" Coste: %.2f%n", getCoste());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Llamada other = (Llamada) obj;
        if (telefonoCliente != other.telefonoCliente)
            return false;
        if (telefonoInterlocutor != other.telefonoInterlocutor)
            return false;
        if (saliente != other.saliente)
            return false;
        if (inicioLlamada == null) {
            if (other.inicioLlamada != null)
                return false;
        } else if (!inicioLlamada.equals(other.inicioLlamada))
            return false;
        if (zona != other.zona)
            return false;
        return true;
    }

    @Override
    public int compareTo(Llamada o) {
        int compareTelefono = this.telefonoCliente - o.telefonoCliente;

        if (compareTelefono != 0) {
            return compareTelefono;
        }

        return this.inicioLlamada.compareTo(o.inicioLlamada);
    }

}