package Unidad11.Act14Socios;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio>, Serializable {

    String apodo;
    String nombre;
    LocalDate fechaAlta;

    public Socio(String apodo, String nombre, String alta) {
        this.apodo = apodo;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta = LocalDate.parse(alta, f);
    }

    public Socio(String apodo) {
        this.apodo = apodo;
    }

    int antiguedad() {
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Socio o) {
        return apodo.compareTo(o.apodo);
    }

    @Override
    public boolean equals(Object o) {
        return apodo.equals(((Socio) o).apodo);
    }

    @Override
    public String toString() {
        return "Socio{" + "apodo=" + apodo + ", nombre=" + nombre
                + ", antiguedad=" + antiguedad() + "}\n";
    }
}
