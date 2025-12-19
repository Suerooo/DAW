package Unidad7.Act6MarcaPagina;

public class Main {
    public static void main(String[] args) {
        MarcaPagina libro1 = new MarcaPagina(-2);
        
        libro1.incrementar();
        System.out.println(libro1.toString());
        
        libro1.incrementar(20);
        System.out.println(libro1.toString());
        
        libro1.empezar();
        System.out.println(libro1.toString());
    }
}
