package Unidad8.Act6Instrumento;

public class Piano extends Instrumento {
    
    public void interpretar() {
        Notas[] notasMusicales = super.getNotasMusicales();
        
        for (int i = 0; i < notasMusicales.length; i++) {
            switch (notasMusicales[i]) {
                case DO -> System.out.println("Doo");
                case RE -> System.out.println("Ree");
                case MI -> System.out.println("Mii");
                case FA -> System.out.println("Faa");
                case SOL -> System.out.println("Soll");
                case LA -> System.out.println("Laa");
                case SI -> System.out.println("Sii");                
            }
        }
    }
}
