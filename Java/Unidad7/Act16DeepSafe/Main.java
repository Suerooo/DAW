package Unidad7.Act16DeepSafe;

public class Main {
    public static void main(String[] args) {
        Submarinista aux1 = new Submarinista("Juan", 30, 20);
        System.out.println(aux1);
        
        aux1.sumergirse(100);
        
        System.out.println(aux1);
    }
}
