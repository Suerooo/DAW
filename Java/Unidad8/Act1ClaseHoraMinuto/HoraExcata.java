package Unidad8.Act1ClaseHoraMinuto;

public class HoraExcata extends HoraMinuto {
    private int segundo;
    
    HoraExcata (int hora, int minuto, int segundo) {
        super(hora, minuto);
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }

    public boolean setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            return false;
        } else {
            this.segundo = segundo;
            return true;
        }
    }
    
    @Override
    public void inc() {
        this.segundo++;
        
        if (this.segundo > 59) {
            segundo = 0;
            minuto++;
        }
        
        if (this.minuto > 59) {
            minuto = 0;
            hora++;
        } 
        
        if (this.hora > 23) {
            hora = 0;
        } 
    }

    @Override
    public String toString() {
        return "Hora: " + hora + ":" + minuto + ":" + segundo;
    }
    
    
    
    
}
