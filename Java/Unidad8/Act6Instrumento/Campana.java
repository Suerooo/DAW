package Unidad8.Act6Instrumento;

public class Campana extends Instrumento {
    
    public void interpretar() {
        Notas[] notasMusicales = super.getNotasMusicales();
        
        for (int i = 0; i < notasMusicales.length; i++) {
            switch (notasMusicales[i]) {
                case DO -> System.out.println("Do.");
                case RE -> System.out.println("Re.");
                case MI -> System.out.println("Mi.");
                case FA -> System.out.println("Fa.");
                case SOL -> System.out.println("Sol.");
                case LA -> System.out.println("La.");
                case SI -> System.out.println("Si.");                
            }
        }
    }
}
