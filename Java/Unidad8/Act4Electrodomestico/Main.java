package Unidad8.Act4Electrodomestico;

public class Main {
    public static void main(String[] args) {
        Electrodomestico aux1 = new Electrodomestico("Microondas", "Nose", 2.2);
        Lavadora aux2 = new Lavadora("nose", 3.3, 1800, false);
        
        System.out.println("Microondas");
        System.out.println("Consumo en 5 horas: " + aux1.getConsumo(22) + " Coste: " + aux1.getCosteConsumo(22, 20));
        System.out.println(aux1);
        
        System.out.println();
        
        System.out.println("Lavadora");
        System.out.println("Consumo en 5 horas: " + aux2.getConsumo(22) + " Coste: " + aux2.getCosteConsumo(22, 20));
        System.out.println(aux2);
    }
}
