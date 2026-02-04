package Unidad9.Act4InterfacesPolimorfismo;

import java.time.LocalDate;

import Unidad9.Act4InterfacesPolimorfismo.Enum.TipoCereal;
import Unidad9.Act4InterfacesPolimorfismo.Productos.*;

public class Main {
    public static void main(String[] args) {
        Cereales cereales = new Cereales("Chococrispi", 1.53, TipoCereal.OTROS, LocalDate.of(2027, 2, 4));
        Vino vino = new Vino("Pesquera", "Tinto", 20, 1200, 5, 2, "Cristal");
        Detergente detergente = new Detergente("", 0, 0, 0, null);
    }
}
