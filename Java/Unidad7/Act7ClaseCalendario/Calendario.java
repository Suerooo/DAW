package Unidad7.Act7ClaseCalendario;

public class Calendario {
    private int dia = 1;
    private int mes = 1;
    private int anio = 1;        
    
    public Calendario(int dia, int mes, int anio) {
        setDia(dia);
        setAnio(anio);
        setMes(mes);
        corregirFecha();
    }
    
    public int getAnio() {
        return anio;
    }
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }
    
    public void setAnio(int anio) {
        if (anio>=1) this.anio = anio;
    }
    
    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) this.mes = mes;
    }
    
    public void setDia(int dia) {
        if (dia <= obtenerDiasMes() && dia >= 1) this.dia = dia;
    }
    
    private int obtenerDiasMes() {
        if (this.mes==1 || this.mes==3 || this.mes==5 || this.mes==7 || this.mes==8 || this.mes==10 || this.mes==12) return 31;
        if (this.mes==4 || this.mes==6 || this.mes==9 || this.mes==11) return 30;
        if (this.mes==2) return 28;
        
        return -1;
    }
    
    private void corregirFecha() {
        int diasMes = obtenerDiasMes();

        while (dia > diasMes) {
            dia -= diasMes;
            mes++;
            diasMes = obtenerDiasMes();
        }

        while (mes > 12) {
            mes -= 12;
            anio++;

            if (anio == 0) {
                anio = 1;
            }
        }
}

    @Override
    public String toString() {
        return "[día=" + this.dia + ", mes=" + this.mes + ", año=" + this.anio + "]";
    }
    
    public void incrementarDia() {
        
    }
}
