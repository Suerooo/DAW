package Unidad7.Act1VehiculoElectrico;

public class Main {
    public static void main(String[] args) {
        CocheElectrico aux1 = new CocheElectrico(null, 1, true);

        aux1.conducir(20);

        System.out.println(aux1);
    }
}
