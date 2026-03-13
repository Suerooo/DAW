package Unidad10.Act4RegistroTemperatura;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Registro implements Serializable {
    private LocalDateTime fecha;
    private Double temperatura;

    public Registro(Double temperatura) {
        this.fecha = LocalDateTime.now();
        setTemperatura(temperatura);
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + ((temperatura == null) ? 0 : temperatura.hashCode());
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
        Registro other = (Registro) obj;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        if (temperatura == null) {
            if (other.temperatura != null)
                return false;
        } else if (!temperatura.equals(other.temperatura))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Fecha=" + fecha + " Temperatura=" + temperatura;
    }

}
