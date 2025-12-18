package Unidad7.Act7ClaseCalendario;

public class Calendario {
    private int dia;
    private int mes;
    private int ano;        
    
    public Calendario(int dia, int mes, int ano) {
        setAno(dia);
        setMes(mes);
        setDia(ano);
    }
    
    public int getAno() {
        return ano;
    }
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }
    
    public void setAno(int ano) {
        if (ano>=1) this.ano = ano;
    }
    
    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) this.mes = mes;
    }
    
    public void setDia(int dia) {
        int diasDelMes = 1;
        
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) diasDelMes=31;
        if (mes==4 || mes==6 || mes==9 || mes==11) diasDelMes=30;
        if (mes==2) diasDelMes=28;
        
        if (dia <= diasDelMes ) this.dia = dia;
    }

    @Override
    public String toString() {
        return "[año=" + ano + ", mes=" + mes + ", dia=" + dia + "]";
    }
    
    void incrementarDia() {
        
    }
}
