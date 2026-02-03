package Unidad9.Act4InterfacesPolimorfismo;

import java.time.LocalDate;

public interface EsAlimento {
    public void setCaducidad(LocalDate fc);
    public LocalDate getCaducidad();
    public void setCalorias(int calorias);
    public int getCalorias();
}
