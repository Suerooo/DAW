package Unidad7.Act15ClaseHora;

public class Horas {
    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (0 <= hora && hora <= 23) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (0 <= minuto && minuto <= 59) {
            this.minuto = minuto;
        } else {
            this.minuto = 0;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (0 <= segundo && segundo <= 59) {
            this.segundo = segundo;
        } else {
            this.segundo = 0;
        }
    }

    public void incrementaSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
}
