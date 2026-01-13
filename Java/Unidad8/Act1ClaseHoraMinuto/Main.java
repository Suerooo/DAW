package Unidad8.Act1ClaseHoraMinuto;

public class Main {
    public static void main(String[] args) {
        HoraMinuto aux = new HoraMinuto(23, 59);
        
        System.out.println(aux.toString());
        
        aux.inc();
        System.out.println(aux.toString());
        
        aux.inc();
        System.out.println(aux.toString());
        
        System.out.println("Se cambio la hora? " + aux.setHora(25));
        System.out.println(aux.toString());
        
        HoraExcata aux2 = new HoraExcata(23, 59, 59);
        
        System.out.println(aux2.toString());
        
        aux2.inc();
        System.out.println(aux2.toString());
        
        aux2.inc();
        System.out.println(aux2.toString());
        
        System.out.println("Se cambio la hora? " + aux2.setSegundo(62));
        System.out.println(aux2.toString());
    }
}
