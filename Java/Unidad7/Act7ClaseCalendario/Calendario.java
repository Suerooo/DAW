package Unidad7.Act7ClaseCalendario;

public class Calendario {
    private int dia;
    private int mes;
    private int anio;
    private static final int[] DIA_MES = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public Calendario(int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia <= 0) {
            this.dia = 1;
        } else if (dia > DIA_MES[this.mes - 1]) {
            this.dia = 1;
            setMes(this.mes + 1);
        } else {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes <= 0) {
            this.mes = 1;
        } else if (mes > 12) {
            this.mes = 1;
            setAnio(this.anio + 1);
        } else {
            this.mes = mes;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio <= 0) {
            this.anio = 1;
        } else {
            this.anio = anio;
        }
    }
}
