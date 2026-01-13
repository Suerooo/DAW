package Unidad8.Act1ClaseHoraMinuto; 

public class HoraMinuto {
    protected int hora;
    protected int minuto;
    
    public HoraMinuto(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }
    
    public HoraMinuto() {}

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setHora(int hora) {
        if (hora > 23 || hora < 0) {
            return false;
        } else {
            this.hora = hora;
            return true;
        }
    }

        public boolean setMinuto(int minuto) {
        if (minuto > 59 || minuto < 0) {
            return false;
        } else {
            this.minuto = minuto;
            return true;
        }
    }

    public void inc() {
        this.minuto++;
        
        if (minuto > 59) {
            this.minuto = 0;
            this.hora++;
        } 
        
        if (hora > 23) {
            this.hora = 0;
        }
    }
    
    @Override
    public String toString() {
        return "Hora: " + hora + ":" + minuto;
    }
}